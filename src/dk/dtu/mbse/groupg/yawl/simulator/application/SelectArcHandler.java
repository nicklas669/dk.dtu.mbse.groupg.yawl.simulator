/**
 * Handler responsible for handling mouse-clicks on SelectArc annotations
 * @author Nicklas Hansen (s144858), Emil Hvid
 *
 */
package dk.dtu.mbse.groupg.yawl.simulator.application;

import java.util.Iterator;

import org.eclipse.draw2d.MouseEvent;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ui.IActionHandler;

import dk.dtu.mbse.groupg.yawl.simulator.annotations.EnabledTransition;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc;
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
		if (annotation instanceof SelectArc) {
			SelectArc pressedArcAnnotation = (SelectArc) annotation;
			int changeInArc = 0;
			if (pressedArcAnnotation.isSelected()) {
				// Decrease if arc is going from enabled to disabled
				changeInArc = -1;
			} else {
				changeInArc = 1;
			}
			// If Arc is coming out of a Transition
			if (pressedArcAnnotation.getSourceTransition() != null) {
				// Get the source Transition Annotation behind SelectArc annotation
				EnabledTransition sourceTransAnnotation = pressedArcAnnotation.getSourceTransition();
				Transition sourceTrans = (Transition) sourceTransAnnotation.getObject();
				int requiredArcsSelected = 0;

				// Calculate number of currently enabled/selected arcs
				int selectedArcs = 0;
				Iterator<SelectArc> selectArcIt = sourceTransAnnotation.getOutArcs().iterator();
				while (selectArcIt.hasNext()) {
					SelectArc selArc = selectArcIt.next();
					if (selArc.isSelected()) {
						selectedArcs++;
					}
				}

				// For split transitions
				TransitionType transitionType = sourceTrans.getSplit();
				int transType;
				if (transitionType != null) {
					transType = transitionType.getText().getValue();
					switch (transType) {
					case TransitionTypes.OR_VALUE:
						requiredArcsSelected = 1;
						if ((selectedArcs + changeInArc) >= requiredArcsSelected) {
							pressedArcAnnotation.setSelected(!pressedArcAnnotation.isSelected());
						}
						break;
					case TransitionTypes.AND_VALUE:
						requiredArcsSelected = sourceTrans.getOut().size();
						if ((selectedArcs + changeInArc) == requiredArcsSelected) {
							pressedArcAnnotation.setSelected(!pressedArcAnnotation.isSelected());
						} else {
							pressedArcAnnotation.setSelected(true);
						}
						break;
					case TransitionTypes.XOR_VALUE:
						requiredArcsSelected = 1;
						if (selectedArcs >= requiredArcsSelected) {
							for (SelectArc sarc : sourceTransAnnotation.getOutArcs()) {
								sarc.setSelected(false);
							}
							pressedArcAnnotation.setSelected(true);
						} else {
							pressedArcAnnotation.setSelected(true);
						}
						break;
					}
				} else {
					// Transition type was null!
					System.err.println("Transition type is null!");
				}
				application.update();
				return true;
			}
			// If Arc is coming out of a Place
			else if (pressedArcAnnotation.getTargetTransition() != null) {
				// Get the target Transition Annotation in front of SelectArc annotation
				EnabledTransition targetTransAnnotation = pressedArcAnnotation.getTargetTransition();
				Transition targetTrans = (Transition) targetTransAnnotation.getObject();
				int requiredArcsSelected = 0;

				// Calculate number of currently enabled/selected arcs
				int selectedArcs = 0;
				Iterator<SelectArc> selectArcIt = targetTransAnnotation.getInArcs().iterator();
				while (selectArcIt.hasNext()) {
					SelectArc selArc = selectArcIt.next();
					if (selArc.isSelected()) {
						selectedArcs++;
					}
				}
				// Only interested in join when coming from a Place to a Transition
				// For join transitions
				TransitionType transitionType = targetTrans.getJoin();
				int transType;
				if (transitionType != null) {
					transType = transitionType.getText().getValue();
					switch (transType) {
					case TransitionTypes.OR_VALUE:
						requiredArcsSelected = 1;
						if ((selectedArcs + changeInArc) >= requiredArcsSelected) {
							pressedArcAnnotation.setSelected(!pressedArcAnnotation.isSelected());
						}
						break;
					case TransitionTypes.AND_VALUE:
						requiredArcsSelected = targetTrans.getIn().size();
						if ((selectedArcs + changeInArc) == requiredArcsSelected) {
							pressedArcAnnotation.setSelected(!pressedArcAnnotation.isSelected());
						} else {
							pressedArcAnnotation.setSelected(true);
						}
						break;
					case TransitionTypes.XOR_VALUE:
						requiredArcsSelected = 1;
						if (selectedArcs >= requiredArcsSelected) {
							for (SelectArc sarc : targetTransAnnotation.getInArcs()) {
								sarc.setSelected(false);
							}
							pressedArcAnnotation.setSelected(true);
						} else {
							pressedArcAnnotation.setSelected(true);
						}
						break;
					}
				} else {
					// Transition type was null!
					System.err.println("Transition type is null!");
				}
				application.update();
				return true;
			}

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
