package dk.dtu.mbse.groupg.yawl.simulator.application;

import java.util.Iterator;

import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetannotationsFactory;
import org.pnml.tools.epnk.applications.ApplicationWithUIManager;
import org.pnml.tools.epnk.applications.ui.ApplicationUIManager;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsFactory;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.EnabledTransition;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.Marking;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc;
import yawlnet.yawltypes.Arc;
import yawlnet.yawltypes.Place;
import yawlnet.yawltypes.Transition;

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

		// for each object annotation, you must set the underlying Petri net
		// object that it annotates;
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
					netannotation.getObjectAnnotations().add(selectArc);
				}
			}
		}

		/*
		 * and for the the new Annotaions defined in 2., you also need to set
		 * the other     vvvvvfeatures and references.
		 */

		// Then, add it to the netannotation by calling
		// netannotation.getObjectAnnotations().add(enabledTransition);
		// netannotation.getObjectAnnotations().add(selectArc);
		// netannotation.getObjectAnnotations().add(marking);

		/*
		 * In the end, add this annotation to the application and set it as the
		 * applications current annotation:
		 */
		this.getNetAnnotations().getNetAnnotations().add(netannotation);
		this.getNetAnnotations().setCurrent(netannotation);

	}

}
