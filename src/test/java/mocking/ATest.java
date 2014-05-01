package mocking;

import org.easymock.EasyMock;
import org.easymock.EasyMockSupport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(StaticD.class)
public class ATest extends EasyMockSupport {

	@Test
	public void testRun() {
		final B bMock = createMock(B.class);
		final C cMock = createMock(C.class);

		PowerMock.mockStatic(StaticD.class);
		EasyMock.expect(StaticD.getC()).andReturn(cMock);
		PowerMock.replay(StaticD.class);

		final A aReal = new A(bMock);

		EasyMock.expect( bMock.getValue() ).andReturn("test");
		replayAll();

		aReal.run("test");

		verifyAll();
		resetAll();
	}
}