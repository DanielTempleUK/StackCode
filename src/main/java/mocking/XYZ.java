package mocking;

public class XYZ {
	public static Identifier getMachineIdentifierFor( final Machine machine ) {
		final Identifier identifier = new IdentifierImpl();
		identifier.setMachine(machine.getMachine());
		identifier.setMachineIdentifierType(machine.getMachineIdentifierType());
		return identifier;
	}
}
