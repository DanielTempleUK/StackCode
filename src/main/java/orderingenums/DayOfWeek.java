package orderingenums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum DayOfWeek {
	FRIDAY, MONDAY, SATURDAY, SUNDAY, THURSDAY, TUESDAY, WEDNESDAY;

	public static void main(final String[] args) {
		final DayOfWeek[] values = DayOfWeek.values();
		final List<DayOfWeek> list = Arrays.asList(values);

		Collections.sort(list);
		System.out.println(list);

		Collections.sort(list, new DayOfWeekComparator());
		System.out.println(list);
	}
}
