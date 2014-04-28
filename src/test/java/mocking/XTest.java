package mocking;

import junit.framework.Assert;

import org.easymock.EasyMock;
import org.junit.Test;

public class XTest {

	@Test
	public void thatMockingDoesntWorkForNonMocks() {
		final X pojo = EasyMock.createMock(X.class);

		EasyMock.reset(pojo);
		EasyMock.expect(pojo.xyz()).andReturn(false);
		EasyMock.replay(pojo);

		Assert.assertFalse(pojo.xyz());

		EasyMock.verify(pojo);
	}
}