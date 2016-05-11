/**
 * Handler for firing a transition.
 * @author Ekkart Kindler
 * Large parts copied from Ekkart Kindler's example in the epnk tutorials pt-net-simulator!
 */
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

import dk.dtu.mbse.groupg.yawl.simulator.annotations.EnabledTransition;
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
		System.err.println("mouseDoubleClicked from FireTransitionHandler!");
		NetAnnotations netAnnotations = application.getNetAnnotations();
		NetAnnotation current = netAnnotations.getCurrent();
		
		FlatAccess flatNet = new FlatAccess(application.getPetrinet());
		if (current.getObjectAnnotations().contains(annotation)) {
			Object object = annotation.getObject();
			if (object instanceof Transition && annotation instanceof EnabledTransition) {
				Transition transition = (Transition) object;
				EnabledTransition transitionAnnotation = ((EnabledTransition) annotation);
				Map<Place,Integer> marking1 = application.computeMarking();
				if (application.enabled(flatNet, marking1, transition)) {
					Map<Place,Integer> marking2 = application.fireTransition(flatNet, marking1, transition);
					NetAnnotation netAnnotation = application.computeAnnotation(flatNet, marking2);
					netAnnotation.setNet(application.getPetrinet());
					List<ObjectAnnotation> clearPlaceAnnotations = new ArrayList<ObjectAnnotation>();
					for (ObjectAnnotation objectAnnotation: current.getObjectAnnotations()) {
						if (objectAnnotation != transitionAnnotation && objectAnnotation instanceof EnabledTransition ) {
//							((EnabledTransition) objectAnnotation).setMode(Mode.ENABLED);
						} else if (objectAnnotation instanceof EnabledTransition) {
							clearPlaceAnnotations.add(objectAnnotation);
						}
					}
					current.getObjectAnnotations().removeAll(clearPlaceAnnotations);
//					transitionAnnotation.setMode(Mode.FIRED);
//					for (Arc arc: flatNet.getOut(transition)) {
//						Object object2 = arc.getTarget();
//						if (object2 instanceof PlaceNode) {
//							PlaceNode target = flatNet.resolve((PlaceNode) object2);
//							if (target != null) {
//								PlaceSelectionAnnotation placeAnnotation = AnnotationsFactory.eINSTANCE.createPlaceSelectionAnnotation();
//								placeAnnotation.setObject(target);
//								placeAnnotation.setSelected(true);
//								current.getObjectAnnotations().add(placeAnnotation);
//							}
//						}
//					}
					
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
		return false;
	}

	@Override
	public boolean mouseReleased(MouseEvent arg0, ObjectAnnotation annotation) {
		// TODO Auto-generated method stub
		return false;
	}

}
