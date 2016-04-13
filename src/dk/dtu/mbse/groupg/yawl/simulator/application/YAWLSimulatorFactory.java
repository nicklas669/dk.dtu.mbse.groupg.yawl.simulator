package dk.dtu.mbse.groupg.yawl.simulator.application;

import org.pnml.tools.epnk.applications.ApplicationFactory;
import org.pnml.tools.epnk.applications.ApplicationWithUIManager;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

import yawlnet.yawltypes.YAWLnet;

// TODO chage this to the Path of your YAWL type

public class YAWLSimulatorFactory extends ApplicationFactory {

	@Override
	public String getName() {
		return "YAWL Simulator";
	}

	@Override
	public String getDescription() {
		return "A simple YAWL simulator not yet taken XOR, OR and RESET arcs into account";
	}

	@Override
	public boolean isApplicable(PetriNet net) {
		// TODO change YAWLNet to the class representing your YAWL type
		return net.getType() instanceof YAWLnet;
	}

	@Override
	public ApplicationWithUIManager startApplication(PetriNet net) {

                // TODO return an instance of your YAWL Simulator application
		return new SimulatorApplication(net);
	}

}
