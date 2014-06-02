package mocking;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;
import java.util.Date;

import org.easymock.EasyMock;
import org.junit.Test;

public class PremiumTest {

	@Test
	public void thatMockingWorks() {

		final Date mockDate = EasyMock.createMock(Date.class);
		final IPremium premium = EasyMock.createMock(IPremium.class);
		EasyMock.expect(premium.getCommencementDate()).andReturn(mockDate).anyTimes();
		expect(
				premium.getRemainingPremium(
						(BigDecimal) EasyMock.anyObject(),
						(Date) EasyMock.anyObject(),
						(Date) EasyMock.anyObject(),
						EasyMock.anyBoolean()
						))
						.andReturn(BigDecimal.TEN).anyTimes();
		replay(premium);

		final BigDecimal remainingPremium2 = premium.getRemainingPremium((BigDecimal) EasyMock.anyObject(), null, null, true);

		verify(premium);
		assertThat(BigDecimal.TEN, is(remainingPremium2));
	}
}