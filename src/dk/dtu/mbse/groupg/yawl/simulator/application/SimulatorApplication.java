package dk.dtu.mbse.groupg.yawl.simulator.application;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetannotationsFactory;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ApplicationWithUIManager;
import org.pnml.tools.epnk.applications.ui.ApplicationUIManager;
import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pntypes.ptnet.PTArcAnnotation;

import dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsFactory;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.EnabledTransition;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.Marking;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.Mode;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.PlaceMarkingAnnotation;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc;
import yawlnet.yawltypes.Arc;
import yawlnet.yawltypes.Place;
import yawlnet.yawltypes.Transistion;
import yawlnet.yawltypes.Transition;
import yawlnet.yawltypes.TransitionType;
import yawlnet.yawltypes.YAWLNetArcAnnotation;
import yawlnet.yawltypes.YawltypesFactory;
import yawlnet.yawltypes.impl.TransitionTypeImpl;

public class SimulatorApplication extends ApplicationWithUIManager {

	/**
	 * Create a constructor for this class with Petri net as its parameter
	 * 
	 * @param petrinet
	 */
	public SimulatorApplication(PetriNet petrinet) {
		super(petrinet);
		ApplicationUIManager manager = this.getPresentationManager();
		manager.addPresentationHandler(new PresentationHandler());
		manager.addActionHandler(new FireTransitionHandler(this));
		manager.addActionHandler(new SelectArcHandler(this));
	}

	/*
	 * One method that you must implement is initializeContents(), which creates
	 * the initial annotations of the net on which the application is started.
	 * In this method, this net is available by the method getPetriNet().
	 */
	public void initializeContents() {
		/*
		 * In order to add the object annotations to somewhere, create a new net
		 * annotation first:
		 */
		NetAnnotation netannotation = NetannotationsFactory.eINSTANCE.createNetAnnotation();
		netannotation.setNet(getPetrinet());

		/**
		 * For the YAWL simulator, you would need annotations for enabled
		 * transitions, for arcs which the user can select from (for XOR-joins
		 * and XOR- and OR-splits) and for markings (note that for OR-joins, the
		 * user does not need to select arcs, becaise a token will be consumed
		 * from all in-coming arcs from a place which has at least one token in
		 * it).
		 */

		/*
		 * Then create the corresponding annotations for each object that should
		 * have an overlay in the initial situation;
		 */

		PetriNet pn = this.getPetrinet();

		Iterator it = pn.eAllContents();
		
		//In a given marking, 
		//each place that has at least one token should receive a Marking annotation.
		while (it.hasNext()) {
			Object obj = it.next();
			if (obj instanceof Place) {
				Place place = (Place) obj;
				if (place.getType() != null) {
					Marking marking = AnnotationsFactory.eINSTANCE.createMarking();
					marking.setObject(place);
					marking.setValue(1);
					netannotation.getObjectAnnotations().add(marking);
				}
			} else if (obj instanceof Arc) {
				Arc arc = (Arc) obj;
				if (arc.getType() != null) {
					SelectArc selectArc = AnnotationsFactory.eINSTANCE.createSelectArc();
					selectArc.setObject(arc);
					selectArc.setSelected(true);
					netannotation.getObjectAnnotations().add(selectArc);
				}
			} else if (obj instanceof Transition) {
				/*	Each enabled transition should receive
				 *  a EnabledTransition annotation.
				 *  If this transition is an XOR-join,
				 *  all the incoming arcs from a place with at least one token
				 *  should receive a SelectArc annotation with the target
				 *  set to the EnabledTransition annotation; 
				 *  and exactly one SelectArc should have 
				 *  the selected attribute set to true. 
				 */
				Transition transition = (Transition) obj;
				
				/*
				 * If transition can be fired - then annotate it. And if 
				 * you have a situation in which you can select between arcs, 
				 * then you could make both arcs grey, and select between the two. Or just 
				 * one red by default with switching possible
				 */
				

			}
		}

		/*
		 * and for the the new Annotaions defined in 2., you also need to set
		 * the other features and references.
		 */

		/*
		 * In the end, add this annotation to the application and set it as the
		 * applications current annotation:
		 */
		this.getNetAnnotations().getNetAnnotations().add(netannotation);
		this.getNetAnnotations().setCurrent(netannotation);

	}
	
	/**
	 * From package org.pnml.tools.epnk.tutorial.application.ptnetsimulator;
		public class PTNetSimulatorApplication extends ApplicationWithUIManager {
	 * @return
	 */
	boolean enabled(FlatAccess flatNet, Map<Place, Integer> marking, Transition transition) {
		// TODO this does not work yet if there is more than one arc between the same
		//      place and the same transition!
		for (Object arc: flatNet.getIn(transition)) {
			if (arc instanceof Arc) {
				Arc ptArc = (Arc) arc;				
				YAWLNetArcAnnotation arcAnnotation = ptArc.getInscription();
				int available = 0;
				Object source = ptArc.getSource();
				if (source instanceof PlaceNode) {
					source = flatNet.resolve((PlaceNode) source);
					if (source instanceof Place) {
						if (marking.containsKey(source)) {
							available = marking.get(source);
						}
						int needed = 1; 
						if (arcAnnotation != null) {
							needed = arcAnnotation.getText().getValue();
						}
						if (available < needed) {
							return false;
						}
					} else {
						return false;
					}
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
		return true;
	}
	
/**
 * From package org.pnml.tools.epnk.tutorial.application.ptnetsimulator;
	public class PTNetSimulatorApplication extends ApplicationWithUIManager {
 * @return
 */
	public Map<Place, Integer> computeMarking() {
		Map<Place,Integer> marking = new HashMap<Place,Integer>();
		for (ObjectAnnotation annotation: this.getNetAnnotations().getCurrent().getObjectAnnotations()) {
			if (annotation instanceof PlaceMarkingAnnotation) {
				PlaceMarkingAnnotation markingAnnotation = (PlaceMarkingAnnotation) annotation;
				Object object = markingAnnotation.getObject();
				if (object instanceof Place && markingAnnotation.getText() > 0) {
					Place ptPlace = (Place) object;
					marking.put(ptPlace, markingAnnotation.getText());
				}
			}
		}
		return marking;
	}
	
	/**
	 * From package org.pnml.tools.epnk.tutorial.application.ptnetsimulator;
		public class PTNetSimulatorApplication extends ApplicationWithUIManager {
	 * @return
	 */
	Map<Place, Integer> fireTransition(FlatAccess flatNet, Map<Place, Integer> marking1, Transition transition) {
		Map<Place,Integer> marking2 = new HashMap<Place, Integer>();
		for (Place place: marking1.keySet()) {
			marking2.put(place, marking1.put(place, marking1.get(place)));
		}
		
		for (Object arc: flatNet.getIn(transition)) {
			if (arc instanceof Arc) {
				Arc ptArc = (Arc) arc;
				YAWLNetArcAnnotation ptArcAnnotation = ptArc.getInscription();
				Object source  = ptArc.getSource();
				if (source instanceof PlaceNode) {
					source = flatNet.resolve((PlaceNode) source);
					if (source instanceof Place) {
						Place place = (Place) source;
						int available = 0;
						if (marking1.containsKey(place)) {
							available = marking1.get(place);
						}
						int needed = 1; 
						if (ptArcAnnotation != null) {
							needed = ptArcAnnotation.getText().getValue();
						}
						marking2.put(place, available-needed);
					}
				}
			}
		}
		
		for (Object arc: flatNet.getOut(transition)) {
			if (arc instanceof Arc) {
				Arc ptArc = (Arc) arc;
				YAWLNetArcAnnotation ptArcAnnotation = ptArc.getInscription();
				Object target  = ptArc.getTarget();
				if (target instanceof PlaceNode) {
					target = flatNet.resolve((PlaceNode) target);
					if (target instanceof Place) {
						Place place = (Place) target;
						int available = 0;
						if (marking1.containsKey(place)) {
							available = marking1.get(place);
						}
						int provided = 1; 
						if (ptArcAnnotation != null) {
							provided = ptArcAnnotation.getText().getValue();
						}
						marking2.put(place, available+provided);
					}
				}
			}
		}

		return marking2;
	}
	
	NetAnnotation computeAnnotation(FlatAccess flatNet, Map<Place, Integer> marking) {
		NetAnnotation annotation = NetannotationsFactory.eINSTANCE.createNetAnnotation();
		for (Place place: marking.keySet()) {
			int value = marking.get(place);
			if (value > 0) {
				PlaceMarkingAnnotation markingAnnotation = AnnotationsFactory.eINSTANCE.createPlaceMarkingAnnotation();
				markingAnnotation.setText(value);
				markingAnnotation.setObject(place);
				annotation.getObjectAnnotations().add(markingAnnotation);
				// also annotate reference places with the current marking of the place
				for (PlaceNode ref: flatNet.getRefPlaces(place)) {
					PlaceMarkingAnnotation markingAnnotationRef = AnnotationsFactory.eINSTANCE.createPlaceMarkingAnnotation();
					markingAnnotationRef.setText(value);
					markingAnnotationRef.setObject(ref);
					annotation.getObjectAnnotations().add(markingAnnotationRef);	
				}
			}
		}
		
		for (Node transition: flatNet.getTransitions()) {
			if (transition instanceof Transition) {
				if (enabled(flatNet, marking, (Transition) transition)) {
					dk.dtu.mbse.groupg.yawl.simulator.annotations.TransitionActivationAnnotation transitionAnnotation =
							AnnotationsFactory.eINSTANCE.createTransitionActivationAnnotation();
					transitionAnnotation.setObject(transition);
					transitionAnnotation.setMode(Mode.ENABLED);
					annotation.getObjectAnnotations().add(transitionAnnotation);
				}
			}
		}
		return annotation;
	}
}
