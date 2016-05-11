/**
 * Handler responsible for handling mouse-clicks on SelectArc annotations
 * @author Nicklas Hansen (s144858)
 *
 */
package dk.dtu.mbse.groupg.yawl.simulator.application;

import org.eclipse.draw2d.MouseEvent;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ui.IActionHandler;

import dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.TransitionActivationAnnotation;
import yawlnet.yawltypes.Arc;
import yawlnet.yawltypes.Place;
import yawlnet.yawltypes.PlaceType;
import yawlnet.yawltypes.PlaceTypes;
import yawlnet.yawltypes.Transition;
import yawlnet.yawltypes.TransitionType;
import yawlnet.yawltypes.TransitionTypes;

public class SelectArcHandler implements IActionHandler {

	private SimulatorApplication application;

	public SelectArcHandler(SimulatorApplication application) {
		super();
		this.application = application;
	}

	/**
	 * @author Nicklas Hansen (s144858), Stefan Hyltoft (s144872)
	 *
	 */
	@Override
	public boolean mousePressed(MouseEvent arg0, ObjectAnnotation annotation) {
		/*
		 * For SelectArc annotations, it should select or unselect the
		 * underlying arc; but you need to make sure that the selection of all
		 * arcs of a transition is consistent (i.e. exactly one arc selected for
		 * XOR-joins or -split and at least one arc selected for OR-splits
		 */
		// System.err.println("mousePressed from SelectArcHandler!");
		if (annotation instanceof SelectArc) {
			SelectArc arcAnnotation = (SelectArc) annotation;
			arcAnnotation.setSelected(!arcAnnotation.isSelected());
			// Get the Arc object behind SelectArc annotation
//			Object object = annotation.getObject();
//			if (object instanceof Arc) {
//				Arc arc = (Arc) object;
//				// Get the transition which is the source of the Arc
//				if (arc.getSource() instanceof Transition) {
//					Transition sourceTrans = (Transition) arc.getSource();
//					int numOfArcsOut = sourceTrans.getOut().size();
//					// For split transitions
//					TransitionType transitionType = sourceTrans.getSplit();
//					if (transitionType != null) {
//						switch (transitionType.getText().getValue()) {
//						case TransitionTypes.OR_VALUE:
//							arcAnnotation.setSelected(!arcAnnotation.isSelected());
//							break;
//						case TransitionTypes.AND_VALUE:
//							break;
//						case TransitionTypes.XOR_VALUE:
//							break;
//						}
//					}
//				}
//			}

			// Need to make sure that the selection of all arcs of a transition
			// is consistent
			// (i.e. exactly one arc selected for XOR-joins or -split and at
			// least one arc selected for OR-splits)
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

	@Override
	public boolean mouseDoubleClicked(MouseEvent arg0, ObjectAnnotation annotation) {
		return false;
	}

}
