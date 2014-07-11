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
@PrepareForTest({SingletonClass.class})
public class CallingClassTest {

	@Test
	public void thatCallingClassMakesExpectedCalls() {
		final SingletonClass mockSingleton = PowerMock.createMock(SingletonClass.class);
		EasyMock.expect(mockSingleton.doStuff()).andReturn("lol").anyTimes();

		PowerMock.mockStatic(SingletonClass.class);
		EasyMock.expect(SingletonClass.getInstance()).andReturn(mockSingleton).anyTimes();

		PowerMock.replayAll(mockSingleton);

		final CallingClass callingClass = new CallingClass();
		final String doBdo = callingClass.doBdo();
		assertThat(doBdo, is("lol"));

		EasyMock.verify(mockSingleton);
		PowerMock.verifyAll();
	}
}