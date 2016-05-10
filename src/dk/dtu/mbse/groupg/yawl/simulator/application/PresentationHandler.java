package dk.dtu.mbse.groupg.yawl.simulator.application;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ui.IPresentationHandler;
import org.pnml.tools.epnk.applications.ui.figures.PolylineOverlay;
import org.pnml.tools.epnk.applications.ui.figures.RectangleOverlay;
import org.pnml.tools.epnk.diagram.edit.parts.ArcEditPart;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

import dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc;
import yawlnet.yawltypes.Arc;

public class PresentationHandler implements IPresentationHandler {

	/*
	 * this presentation handler should define for some of your annotations (at
	 * least for SelectArc) how they look; for SelectArc annotations, you could
	 * create a PolylineOverlay for the arc and set its colour to grey if the
	 * selected attribute is false (it will be red by default).
	 */
	@Override
	public IFigure handle(ObjectAnnotation annotation, AbstractGraphicalEditPart graphicalEditPart) {
		if (annotation instanceof SelectArc) {
			SelectArc selectArcAnnotation = (SelectArc) annotation;
			if (graphicalEditPart instanceof ArcEditPart) {
				ArcEditPart editPart = (ArcEditPart) graphicalEditPart;
				// IFigure figure = graphicalEditPart.getFigure();
				java.lang.Object modelObject = editPart.resolveSemanticElement();
				if (modelObject instanceof Arc) {
					PolylineOverlay overlay = new PolylineOverlay((ConnectionNodeEditPart) graphicalEditPart);
					System.err.println("PresentationHandler: arcAnnotation.selected = "+selectArcAnnotation.isSelected());
					if (!selectArcAnnotation.isSelected()) {
						overlay.setForegroundColor(ColorConstants.gray);
						overlay.setBackgroundColor(ColorConstants.gray);
//						overlay.getUpdateManager().addDirtyRegion(overlay, overlay.getBounds());
						System.err.println("Sat color til grå!");
					}
					return overlay;
				}
			}
		}
		return null;
	}

}
