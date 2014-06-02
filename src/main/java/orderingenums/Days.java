package orderingenums;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public enum Days implements Comparable<Days> {

	FRIDAY(5), MONDAY(1), SATURDAY(6), SUNDAY(7), THURSDAY(4), TUESDAY(2), WEDNESDAY(3);

	private Integer order;

	private Days(final Integer order) {
		this.order = order;
	}

	public static List<Days> sort(final List<Days> list) {
		Collections.sort(list, new Comparator<Days>(){
			public int compare(final Days o1, final Days o2) {
				return o1.order.compareTo(o2.order);
			}
		});

		return list;
	}

	public static void main(final String[] args) {
		final Days[] values = Days.values();
		final List<Days> list = Arrays.asList(values);

		Collections.sort(list);
		System.out.println(list);

		System.out.println(Days.sort(list));
	}
}