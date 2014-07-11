package callhandler;

import java.io.IOException;
import java.io.Reader;

public class CallHandler {
	private SqlSessionFactory sessionFactory;
	public CallHandler() {
		final String resource = "mybatis/mybatis-config.xml";
		Reader reader;
		try {
			reader = Resources.getResourceAsReader(resource);
			this.sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		}
		catch (final IOException e) {
			e.printStackTrace();
		}
	}

	public String handleRequest(final Call call) {
		// Some Implementation
		return "";
	}
}