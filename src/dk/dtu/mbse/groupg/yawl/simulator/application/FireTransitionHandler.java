package dk.dtu.mbse.groupg.yawl.simulator.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.MouseEvent;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotations;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ui.IActionHandler;
import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;

import dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsFactory;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.EnabledTransition;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.Mode;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.PlaceSelectionAnnotation;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.TransitionActivationAnnotation;
import yawlnet.yawltypes.Place;
import yawlnet.yawltypes.Transition;


public class FireTransitionHandler implements IActionHandler {

	private SimulatorApplication application;

	public FireTransitionHandler(SimulatorApplication application) {
		super();		
		this.application = application;
	}
	

	@Override
	public boolean mouseDoubleClicked(MouseEvent arg0, ObjectAnnotation annotation) {
		NetAnnotations netAnnotations = application.getNetAnnotations();
		NetAnnotation current = netAnnotations.getCurrent();
		
		FlatAccess flatNet = new FlatAccess(application.getPetrinet());
		if (current.getObjectAnnotations().contains(annotation)) {
			Object object = annotation.getObject();
			if (object instanceof Transition && annotation instanceof EnabledTransition) {
				Transition transition = (Transition) object;
				TransitionActivationAnnotation transitionAnnotation = ((TransitionActivationAnnotation) annotation);
				Map<Place,Integer> marking1 = application.computeMarking();
				if (application.enabled(flatNet, marking1, transition)) {
					Map<Place,Integer> marking2 = application.fireTransition(flatNet, marking1, transition);
					NetAnnotation netAnnotation = application.computeAnnotation(flatNet, marking2);
					netAnnotation.setNet(application.getPetrinet());
					List<ObjectAnnotation> clearPlaceAnnotations = new ArrayList<ObjectAnnotation>();
					for (ObjectAnnotation objectAnnotation: current.getObjectAnnotations()) {
						if (objectAnnotation != transitionAnnotation && objectAnnotation instanceof EnabledTransition ) {
							((TransitionActivationAnnotation) objectAnnotation).setMode(Mode.ENABLED);
						} else if (objectAnnotation instanceof EnabledTransition) {
							clearPlaceAnnotations.add(objectAnnotation);
						}
					}
					current.getObjectAnnotations().removeAll(clearPlaceAnnotations);
					transitionAnnotation.setMode(Mode.FIRED);
					for (Arc arc: flatNet.getOut(transition)) {
						Object object2 = arc.getTarget();
						if (object2 instanceof PlaceNode) {
							PlaceNode target = flatNet.resolve((PlaceNode) object2);
							if (target != null) {
								PlaceSelectionAnnotation placeAnnotation = AnnotationsFactory.eINSTANCE.createPlaceSelectionAnnotation();
								placeAnnotation.setObject(target);
								placeAnnotation.setSelected(true);
								current.getObjectAnnotations().add(placeAnnotation);
							}
						}
					}
					
					application.deleteNetAnnotationAfterCurrent();
					application.addNetAnnotationAsCurrent(netAnnotation);
					return true;
				}
			}
		}
		// this should not happen (or only when the net is changed while simulating);
		// could do something to fix this here-
		return false;
	}

	@Override
	public boolean mousePressed(MouseEvent arg0, ObjectAnnotation annotation) {
		/*
		 * For SelectArc annotations, it should select or unselect the underlying
		 * arc; but you need to make sure that the selection of all arcs of a
		 * transition is consistent (i.e. exactly one arc selected for XOR-joins or
		 * -split and at least one arc selected for OR-splits
		 */
		if (annotation instanceof SelectArc) {
			SelectArc arcAnnotation = (SelectArc) annotation;
			//arcAnnotation.getObject()
			//arcAnnotation.setSelected(!arcAnnotation.isSelected());
			application.update();
			return true; 
		}
		return false; 
	}

	@Override
	public boolean mouseReleased(MouseEvent arg0, ObjectAnnotation annotation) {
		// TODO Auto-generated method stub
		return false;
	}

}
