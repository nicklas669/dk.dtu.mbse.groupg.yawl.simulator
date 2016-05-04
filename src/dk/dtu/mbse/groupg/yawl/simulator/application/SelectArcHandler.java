package dk.dtu.mbse.groupg.yawl.simulator.application;

import org.eclipse.draw2d.MouseEvent;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ui.IActionHandler;

import dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc;

public class SelectArcHandler implements IActionHandler {
	
	private SimulatorApplication application;

	public SelectArcHandler(SimulatorApplication application) {
		super();
		this.application = application;
	}

	@Override
	public boolean mouseDoubleClicked(MouseEvent arg0, ObjectAnnotation annotation) {
		return false;
	}

	@Override
	public boolean mousePressed(MouseEvent arg0, ObjectAnnotation annotation) {
		if (annotation instanceof SelectArc) {
			SelectArc arcAnnotation = (SelectArc) annotation;
			arcAnnotation.setSelected(!arcAnnotation.isSelected());
			application.update();
			//Need to make sure that the selection of all arcs of a 
			//transition is consistent (i.e. exactly one arc selected
			// for XOR-joins or -split and at least one arc selected for OR-splits
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
