package Filters;


import org.easymock.Capture;
import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

public class FilterExtensionTest {

	private FilterExecutor mockFilterExecutor;

	@Before
	public void setUp() {
		this.mockFilterExecutor = EasyMock.createMock(FilterExecutor.class);
	}

	@Test
	public void test1() {
		final Capture<Object> object = new Capture<Object>();
		EasyMock.expect(this.mockFilterExecutor.execute(EasyMock.isNull(Object.class))).andReturn(new Object());
		EasyMock.replay(this.mockFilterExecutor);
		final FilterExtension test = new FilterExtension(this.mockFilterExecutor);
		test.handle();

		object.getValue();

		final Exception e = new RuntimeException();
		e.getStackTrace()[0].toString();
		//Assert
	}

	@Test
	public void test2() {
		final Object object = new Object();
		//More or less similar to above
		EasyMock.expect(this.mockFilterExecutor.execute(object)).andReturn(object);
		EasyMock.replay(this.mockFilterExecutor);
		final FilterExtension test = new FilterExtension(this.mockFilterExecutor);
		test.handle();
	}
}
