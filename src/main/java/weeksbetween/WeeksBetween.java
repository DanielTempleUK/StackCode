package weeksbetween;

import org.joda.time.DateTime;
import org.joda.time.Weeks;

public class WeeksBetween {

	public static void main(final String[] args) {
		final String StartDate = "2014-03-03";
		final String EndDate = "2014-08-03";

		final DateTime StartDateJoda= new DateTime(StartDate);
		final DateTime EndDateJoda= new DateTime(EndDate);
		final int weeks = Weeks.weeksBetween(StartDateJoda, EndDateJoda).getWeeks();
		System.out.println("The difference is " + weeks +" weeks.");
	}
}
