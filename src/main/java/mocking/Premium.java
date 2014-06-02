package mocking;

import java.math.BigDecimal;
import java.util.Date;

public class Premium {

	public BigDecimal getRemainingPremium(final BigDecimal baseAmount, final Date commencementDate, final Date effectiveDate, final boolean isComplete) {
		return BigDecimal.ZERO;
	}

	public BigDecimal getRemainingPremium(final BigDecimal baseAmount, final Date commencementDate, final Date effectiveDate, final boolean isComplete, final boolean isComplete2) {
		return getRemainingPremium(baseAmount, commencementDate, effectiveDate, isComplete);
	}
}