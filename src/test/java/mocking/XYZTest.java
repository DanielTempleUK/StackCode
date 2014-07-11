package mocking;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({XYZ.class, IdentifierImpl.class})
public class XYZTest {

	@Test
	public void thatMachineIdentifierIsCreatedWithMachineAndType() {
		final String machineString = "machine";
		final MachineIdentifierType machineIdType = new MachineIdentifierType();

		final Machine machine = new Machine();
		machine.setMachine( machineString );
		machine.setMachineIdentifierType( machineIdType );

		final Identifier identifier = XYZ.getMachineIdentifierFor( machine );
		assertThat( identifier.getMachine(), is(machineString));
		assertThat( identifier.getMachineIdentifierType(), is( machineIdType ));
	}

	@Test
	public void thatInteractionWithMachineIsAsExpected() {
		final String machineString = "machine";
		final MachineIdentifierType machineIdType = new MachineIdentifierType();

		final Machine mockedMachined = EasyMock.createMock(Machine.class);
		EasyMock.expect( mockedMachined.getMachine() ).andReturn( machineString );
		EasyMock.expect( mockedMachined.getMachineIdentifierType() ).andReturn( machineIdType );

		EasyMock.replay( mockedMachined );

		final Identifier identifier = XYZ.getMachineIdentifierFor( mockedMachined );
		assertThat( identifier.getMachine(), is(machineString));
		assertThat( identifier.getMachineIdentifierType(), is( machineIdType ));

		EasyMock.verify( mockedMachined );
	}

	@Test
	public void thatInteractionWithMachineAndIdentifierIsAsExpected() throws Exception {
		final String machineString = "machine";
		final MachineIdentifierType machineIdType = new MachineIdentifierType();

		final Machine mockedMachined = EasyMock.createMock(Machine.class);
		EasyMock.expect( mockedMachined.getMachine() ).andReturn( machineString );
		EasyMock.expect( mockedMachined.getMachineIdentifierType() ).andReturn( machineIdType );

		final IdentifierImpl mockedIdentifierImpl = EasyMock.createMock(IdentifierImpl.class);
		mockedIdentifierImpl.setMachine(machineString);
		EasyMock.expectLastCall();
		mockedIdentifierImpl.setMachineIdentifierType( machineIdType );
		EasyMock.expectLastCall();

		PowerMock.expectNew(IdentifierImpl.class).andReturn( mockedIdentifierImpl );

		PowerMock.replayAll();

		final IdentifierImpl identifier = (IdentifierImpl) XYZ.getMachineIdentifierFor( mockedMachined );
		assertThat( identifier, is( mockedIdentifierImpl ) );

		PowerMock.verifyAll();
	}

}
