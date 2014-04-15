package mocking;

import java.math.BigDecimal;
import java.util.Date;

public interface IPremium {
	public BigDecimal getRemainingPremium(final BigDecimal baseAmount, final Date commencementDate, final Date effectiveDate, final boolean isComplete);

	public Date getCommencementDate();
}