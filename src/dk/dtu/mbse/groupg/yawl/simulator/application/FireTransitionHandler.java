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
			// firing is handled in the SimulatorApplication class
			application.fireTransition(annotation);
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
