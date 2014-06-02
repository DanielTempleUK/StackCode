package mocking;


import org.easymock.Capture;
import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

public class GenericsTest {

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void thatGenericsCanBeMocked() {

		final Generics mockGenerics = EasyMock.createMock(Generics.class);

		new Capture<String>();
		EasyMock.expect(mockGenerics.createInitInstance(EasyMock.eq(String.class))).andReturn("Hello");
		EasyMock.replay(mockGenerics);
	}
}