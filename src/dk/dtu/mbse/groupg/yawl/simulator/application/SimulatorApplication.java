package dk.dtu.mbse.groupg.yawl.simulator.application;

import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetannotationsFactory;
import org.pnml.tools.epnk.applications.ApplicationWithUIManager;
import org.pnml.tools.epnk.applications.ui.ApplicationUIManager;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

public class SimulatorApplication extends ApplicationUIManager {

	// Create a constructor for this class with Petri net as its parameter
	public SimulatorApplication(ApplicationWithUIManager application) {
		super(application);
		// TODO Auto-generated constructor stub
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
		netannotation.setNet(net);
		annotat
		/*
		 * Then create the corresponding annotations for each object that should
		 * have an overlay in the initial situation; for each object annotation,
		 * you must set the underlying Petri net object that it annotates; and
		 * for the the new Annotaions defined in 2., you also need to set the
		 * other features and references.
		 */

		// Then, add it to the netannotation by calling
		// netannotation.getObjectAnnotations().add()

		/*
		 * In the end, add this annotation to the application and set it as the
		 * applications current annotation:
		 * this.getNetAnnotations().getNetAnnotations().add(initialAnnotation);
		 * this.getNetAnnotations().setCurrent(initialAnnotation);
		 */
	}

}
