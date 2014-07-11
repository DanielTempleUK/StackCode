package mocking;

import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Helper.class)
public class DoerTest {

	@Test
	public void FailingTest() {
		final Doer doer = new Doer();
		PowerMock.mockStatic(Helper.class);
		EasyMock.expect( Helper.help(EasyMock.anyInt()) ).andReturn(0);
		PowerMock.replay(Helper.class);

		doer.doIt();
	}
}