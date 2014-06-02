package orderingenums;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class DayOfWeekComparator implements Comparator<DayOfWeek> {

	private static Map<DayOfWeek, Integer> orders = new HashMap<DayOfWeek, Integer>();
	static {
		orders.put(DayOfWeek.MONDAY, 1);
		orders.put(DayOfWeek.TUESDAY, 2);
		orders.put(DayOfWeek.WEDNESDAY, 3);
		orders.put(DayOfWeek.THURSDAY, 4);
		orders.put(DayOfWeek.FRIDAY, 5);
		orders.put(DayOfWeek.SATURDAY, 6);
		orders.put(DayOfWeek.SUNDAY, 7);
	}

	public int compare(final DayOfWeek o1, final DayOfWeek o2) {
		return orders.get(o1).compareTo(orders.get(o2));
	}
}