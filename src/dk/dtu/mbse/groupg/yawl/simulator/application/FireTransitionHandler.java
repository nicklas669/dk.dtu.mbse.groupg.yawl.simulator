/**
 * Handler for firing a transition.
 * @author Nicklas Hansen (s144858)
 * Inspiration from Ekkart Kindler's example in the epnk tutorials pt-net-simulator!
 */
package dk.dtu.mbse.groupg.yawl.simulator.application;


import org.eclipse.draw2d.MouseEvent;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ui.IActionHandler;

import dk.dtu.mbse.groupg.yawl.simulator.annotations.EnabledTransition;


public class FireTransitionHandler implements IActionHandler {

	private SimulatorApplication application;

	public FireTransitionHandler(SimulatorApplication application) {
		super();		
		this.application = application;	
	}
	
	@Override
	public boolean mouseDoubleClicked(MouseEvent arg0, ObjectAnnotation annotation) {
		if (annotation instanceof EnabledTransition) {
			System.err.println("Doubleclicked an EnabledTransition!");
			application.fireTransition(annotation);
		}
			
			
//		System.err.println("mouseDoubleClicked from FireTransitionHandler!");
//		NetAnnotations netAnnotations = application.getNetAnnotations();
//		NetAnnotation current = netAnnotations.getCurrent();
//		
//		FlatAccess flatNet = new FlatAccess(application.getPetrinet());
		
//		if (current.getObjectAnnotations().contains(annotation)) {
//			Object object = annotation.getObject();
//			if (object instanceof Transition && annotation instanceof EnabledTransition) {
//				Transition transition = (Transition) object;
//				EnabledTransition transitionAnnotation = ((EnabledTransition) annotation);
//				Map<Place,Integer> marking1 = application.computeMarking();
//				if (application.enabled(flatNet, marking1, transition)) {
//					Map<Place,Integer> marking2 = application.fireTransition(flatNet, marking1, transition);
//					NetAnnotation netAnnotation = application.computeAnnotation(flatNet, marking2);
//					netAnnotation.setNet(application.getPetrinet());
//					application.deleteNetAnnotationAfterCurrent();
//					application.addNetAnnotationAsCurrent(netAnnotation);
//					return true;
//				}
//			}
//		}
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
