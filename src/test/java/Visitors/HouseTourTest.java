package Visitors;


import org.junit.Assert;
import org.junit.Test;

public class HouseTourTest {

	@Test
	public void thatnumberOfVisitorsIncreasesWhenAVisitorIsAdmitted() {
		final HouseTour houseTour = new HouseTour();

		Assert.assertEquals(houseTour.getNumberOfVisitors(), (Integer) 0);

		houseTour.AdmitNewVisitor("name", "male", 50, "British");

		Assert.assertEquals(houseTour.getNumberOfVisitors(), (Integer) 1);

		houseTour.AdmitNewVisitor("name2", "female", 48, "British");

		Assert.assertEquals(houseTour.getNumberOfVisitors(), (Integer) 2);
	}
}