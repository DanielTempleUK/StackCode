package callhandler;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.Reader;

import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({CallHandler.class, SqlSessionFactoryBuilder.class, Resources.class})
public class CallHandlerTest {

	private static final String RESULT0 = "";

	@Test
	public void test0 () throws Exception {
		final Reader mockedReader = EasyMock.createMock(Reader.class);
		final SqlSessionFactoryBuilder mockedSqlSessionFactoryBuilder = EasyMock.createMock(SqlSessionFactoryBuilder.class);
		final SqlSessionFactory mockedSessionFactory = EasyMock.createMock(SqlSessionFactory.class);

		PowerMock.mockStatic(SqlSessionFactoryBuilder.class);
		PowerMock.mockStatic(Resources.class);

		PowerMock.expectNew(SqlSessionFactoryBuilder.class).andReturn(mockedSqlSessionFactoryBuilder);
		EasyMock.expect(Resources.getResourceAsReader("mybatis/mybatis-config.xml")).andReturn(mockedReader);
		EasyMock.expect(mockedSqlSessionFactoryBuilder.build(mockedReader)).andReturn(mockedSessionFactory);

		PowerMock.replayAll();
		assertThat(new CallHandler().handleRequest(new Call()), is(RESULT0));
		PowerMock.verifyAll();
	}
}
