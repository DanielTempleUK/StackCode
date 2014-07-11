package mocking;

public interface Identifier {
	public String getMachine();
	public void setMachine(final String machine);
	public MachineIdentifierType getMachineIdentifierType();
	public void setMachineIdentifierType(final MachineIdentifierType machineIdentifierType);
}