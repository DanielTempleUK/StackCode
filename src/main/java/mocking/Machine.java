package mocking;

public class Machine {

	private String machine;
	private MachineIdentifierType machineIdentifierType;

	public String getMachine() {
		return this.machine;
	}

	public void setMachine(final String machine) {
		this.machine = machine;
	}

	public MachineIdentifierType getMachineIdentifierType() {
		return this.machineIdentifierType;
	}

	public void setMachineIdentifierType(final MachineIdentifierType machineIdentifierType) {
		this.machineIdentifierType = machineIdentifierType;
	}
}