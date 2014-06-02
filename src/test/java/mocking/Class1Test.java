package mocking;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Class1.class)
public class Class1Test {

	@Test
	public void testMethod() throws Exception {
		final Object passedObject = new Object();
		final Class2 mockClass2 = PowerMock.createMock(Class2.class);

		PowerMock.expectNew(Class2.class).andReturn(mockClass2);
		EasyMock.expect(mockClass2.doMethodCall(passedObject)).andReturn("YEAH!");

		PowerMock.replay(mockClass2, Class2.class);

		final Class1 class1 = new Class1();
		final Object returnedValue = class1.method(passedObject);
		Assert.assertEquals(returnedValue.toString(), "YEAH!");

		PowerMock.verify(mockClass2, Class2.class);
	}
}