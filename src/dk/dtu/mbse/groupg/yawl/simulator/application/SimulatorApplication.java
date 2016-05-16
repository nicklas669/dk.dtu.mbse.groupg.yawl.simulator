/**
 * Inspiration from org.pnml.tools.epnk.tutorial.application.ptnetsimulator/PTNetSimulatorApplication.java by Ekkart Kindler
 * @author Nicklas Hansen (s144858)
 * @author Emil Hvid
 */
package dk.dtu.mbse.groupg.yawl.simulator.application;

import java.util.Iterator;

import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetannotationsFactory;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ApplicationWithUIManager;
import org.pnml.tools.epnk.applications.ui.ApplicationUIManager;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

import dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsFactory;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.EnabledTransition;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.Marking;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc;
import yawlnet.yawltypes.Arc;
import yawlnet.yawltypes.Place;
import yawlnet.yawltypes.PlaceTypes;
import yawlnet.yawltypes.Transition;
import yawlnet.yawltypes.TransitionType;
import yawlnet.yawltypes.TransitionTypes;

public class SimulatorApplication extends ApplicationWithUIManager {

	/**
	 * Create a constructor for this class with Petri net as its parameter
	 * 
	 * @author Nicklas Hansen (s144858), Emil Hvid
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
	/**
	 * @author Nicklas Hansen (s144858), Stefan Hyltoft (s144872) 
	 * 
	 */
	public void initializeContents() {
//		 In order to add the object annotations to somewhere, create a new net
//		 annotation first:
		NetAnnotation netannotation = NetannotationsFactory.eINSTANCE.createNetAnnotation();
		netannotation.setNet(getPetrinet());
		
		PetriNet pn = this.getPetrinet();
		Iterator it = pn.eAllContents();

		while (it.hasNext()) {
			Object obj = it.next();
			if (obj instanceof Place) {
				Place place = (Place) obj;
				// In a given marking, each Place that has at least one token should
				// receive a Marking annotation.
				if (place.getType() != null) {
					if (place.getType().getText().getValue() == PlaceTypes.START_VALUE) {
						// Initially only start place should have an annotation
						Marking placeMarking = AnnotationsFactory.eINSTANCE.createMarking();
						placeMarking.setValue(1);
						placeMarking.setObject(place);
						netannotation.getObjectAnnotations().add(placeMarking);

						// Activate start place's nearest transitions...
						// First get all the start place's outgoing arcs and
						// iterate over them
						Iterator<org.pnml.tools.epnk.pnmlcoremodel.Arc> arcIterator = place.getOut().iterator();
						while (arcIterator.hasNext()) {
							Arc arc = (Arc) arcIterator.next();
							
							// Create an annotation on each Arc going out of start place
							SelectArc sArcFromPlace = AnnotationsFactory.eINSTANCE.createSelectArc();
							sArcFromPlace.setObject(arc);
							netannotation.getObjectAnnotations().add(sArcFromPlace);
							
							// Create an annotation for each transition
							// connected to start place
							
							Transition trans = (Transition) arc.getTarget();
							EnabledTransition enabledTrans = AnnotationsFactory.eINSTANCE.createEnabledTransition();
							enabledTrans.setObject(trans);
							netannotation.getObjectAnnotations().add(enabledTrans);

							// For join transitions
							TransitionType transitionType = trans.getSplit();
							if (transitionType != null) {
								int transTypeValue = transitionType.getText().getValue();
								int selectedCount = 0;
								// Create annotations for each outgoing Arc from
								// transition
								Iterator<org.pnml.tools.epnk.pnmlcoremodel.Arc> arcIterator2 = trans.getOut()
										.iterator();
								while (arcIterator2.hasNext()) {
									Arc arc2 = (Arc) arcIterator2.next();
									// Annotate the out-going Arc
									// if (arc2.getType() != null) {
									// Might want to check here if arc is of
									// type Reset - resetarcs shouldnt be
									// selectable?
									SelectArc selectArc2 = AnnotationsFactory.eINSTANCE.createSelectArc();
									selectArc2.setObject(arc2);
									// Initially all these arcs are not selected
									if (transTypeValue == TransitionTypes.OR_VALUE && selectedCount > 1) {
										selectArc2.setSelected(true);
										selectedCount++;
									} else if (transTypeValue == TransitionTypes.XOR_VALUE && selectedCount > 1) {
										selectArc2.setSelected(true);
										selectedCount++;
									}

									else if (transTypeValue == TransitionTypes.AND_VALUE) {
										selectArc2.setSelected(true);
										selectedCount++;
									} else {
										selectArc2.setSelected(false);
										selectedCount++;
									}
									// Add this selectArc to the
									// EnabledTransitions' list of outgoing arcs
									enabledTrans.getOutArcs().add(selectArc2);
									netannotation.getObjectAnnotations().add(selectArc2);
									// }
								}
							}
						}
					}
				}
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
	 * @author Nicklas Hansen (s144858)
	 * @param annotation
	 */
	void fireTransition(ObjectAnnotation annotation) {
		EnabledTransition firingTrans = (EnabledTransition) annotation;
	
		// Create new Netannotation
		NetAnnotation newNetannotation = NetannotationsFactory.eINSTANCE
				.createNetAnnotation();
		newNetannotation.setNet(getPetrinet());
		
		NetAnnotation currNetannotation = this.getNetAnnotations().getCurrent();
		
		// Find out which SelectArcs are enabled and fire those that are
		for (SelectArc sArc : firingTrans.getOutArcs()) {
			if (sArc.isSelected()) {
				Place targetPlace = (Place) ((Arc) sArc.getObject()).getTarget();
//				System.err.println(targetPlace);
				// Enabled Selectarcs target Place should get a Marking annotation
				Marking placeMarking = AnnotationsFactory.eINSTANCE.createMarking();
				placeMarking.setValue(1);
				placeMarking.setObject(targetPlace);
				newNetannotation.getObjectAnnotations().add(placeMarking);

				// Create new EnabledTransition from Place target
				for (org.pnml.tools.epnk.pnmlcoremodel.Arc outArcPNML : targetPlace.getOut()) {
					Arc outArc = (Arc) outArcPNML;
					
					Transition targetTrans = (Transition) outArc.getTarget();
					EnabledTransition enabledTrans = AnnotationsFactory.eINSTANCE.createEnabledTransition();
					enabledTrans.setObject(targetTrans);
					newNetannotation.getObjectAnnotations().add(enabledTrans);
					
					// Create new SelectArcs from Place
					SelectArc sArc2 = AnnotationsFactory.eINSTANCE.createSelectArc();
					sArc2.setObject(outArc);
					sArc2.setTargetTransition(enabledTrans);
					// Always enable the one selectArc if both split and join are null 
					// (meaning it must be a Single transition)
					if (targetTrans.getSplit() == null && targetTrans.getJoin() == null) sArc2.setSelected(true);
					newNetannotation.getObjectAnnotations().add(sArc2);
					
					// Create new SelectsArcs going out of the new EnabledTransition
					for (org.pnml.tools.epnk.pnmlcoremodel.Arc targetArcPNML : targetTrans.getOut()) {
						Arc targetArc = (Arc) targetArcPNML;
						
						SelectArc sArc3 = AnnotationsFactory.eINSTANCE.createSelectArc();
						sArc3.setObject(targetArc);
						sArc3.setSourceTransition(enabledTrans);
						// Always enable the one selectArc if both split and join are null (meaning it must be a Single transition)
						if (targetTrans.getSplit() == null && targetTrans.getJoin() == null) sArc3.setSelected(true);
						newNetannotation.getObjectAnnotations().add(sArc3);
					}
				}
			}
			// Remove old SelectArcs
//			netannotation.getObjectAnnotations().remove(sArc);
		}
		// Remove old EnabledTransition
//		netannotation.getObjectAnnotations().remove(firingTrans);
		this.getNetAnnotations().getNetAnnotations().add(newNetannotation);
		this.getNetAnnotations().setCurrent(newNetannotation);
	}
}
