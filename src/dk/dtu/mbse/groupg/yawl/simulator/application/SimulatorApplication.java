package dk.dtu.mbse.groupg.yawl.simulator.application;

import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetannotationsFactory;
import org.pnml.tools.epnk.applications.ApplicationWithUIManager;
import org.pnml.tools.epnk.applications.ui.ApplicationUIManager;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

import dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsFactory;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.AnnotationsPackage;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.EnabledTransition;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.Marking;
import dk.dtu.mbse.groupg.yawl.simulator.annotations.SelectArc;

public class SimulatorApplication extends ApplicationWithUIManager {
	
	
	/**
	 * Create a constructor for this class with Petri net as its parameter
	 * @param petrinet
	 */
	public SimulatorApplication(PetriNet petrinet) {
		super(petrinet);
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
		 * For the YAWL simulator, you would need annotations for enabled transitions,
		 *  for arcs which the user can select from (for XOR-joins and XOR- and OR-splits)
		 *  and for markings (note that for OR-joins, the user does not need to select arcs,
		 *  becaise a token will be consumed from all in-coming arcs from a place
		 *  which has at least one token in it).
		 */	

		
		/*
		 * Then create the corresponding annotations for each object that should
		 * have an overlay in the initial situation; 
		 */
		EnabledTransition enabledTransition = AnnotationsFactory.eINSTANCE.createEnabledTransition();
		SelectArc selectArc = AnnotationsFactory.eINSTANCE.createSelectArc();
		//Marking marking = AnnotationsFactory.eINSTANCE.createMarking();
		
		//for each object annotation, you must set the underlying Petri net object that it annotates;

		/*		
		 and for the the new Annotaions defined in 2., you also need to set the
		 * other features and references.
		 */		

		// Then, add it to the netannotation by calling
		 netannotation.getObjectAnnotations().add(enabledTransition);
		 netannotation.getObjectAnnotations().add(selectArc);
		 //netannotation.getObjectAnnotations().add(marking);

		/*
		 * In the end, add this annotation to the application and set it as the
		 * applications current annotation:
		 */
		 this.getNetAnnotations().getNetAnnotations().add(netannotation);
		 this.getNetAnnotations().setCurrent(netannotation);
		
	}



}
