package animals;

import org.easymock.EasyMock;
import org.junit.Test;

public class ToStringOverridingTest {

	@Test
	public void thatToStringCanBeMocked() {
		final ToStringOverriding mock = EasyMock.createMock(ToStringOverriding.class);

		EasyMock.expect(mock.toString()).andReturn("toString");
		EasyMock.replay(mock);

		mock.toString();

		EasyMock.verify(mock);
	}
}