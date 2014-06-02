package sorting;

import java.util.Comparator;

public class NullsLastComparator<T extends Comparable<T>> implements Comparator<T>{

	public static final String ASCENDING = "ASCENDING";
	public static final String DESCENDING = "DESCENDING";

	private String sortOrder;

	public NullsLastComparator() {
		this(ASCENDING);
	}

	public NullsLastComparator(final String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public int compare(final T o1, final T o2) {
		if( o1 == null && o2 == null) {
			return 0;
		}

		if( o1 == null ) {
			return 1;
		}

		if( o2 == null ) {
			return -1;
		}

		if(this.sortOrder.equalsIgnoreCase(DESCENDING)) {
			return o2.compareTo(o1);
		}

		return o1.compareTo(o2);
	}
}