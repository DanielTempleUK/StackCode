package sorting;

import java.util.Comparator;

public class TagComparator implements Comparator<Tag>{

	public static final String ASCENDING = "ASCENDING";
	public static final String DESCENDING = "DESCENDING";

	private String sortOrder;

	public TagComparator() {
		this(ASCENDING);
	}

	public TagComparator(final String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public int compare(final Tag o1, final Tag o2) {
		final Comparator<Integer> comparator = new NullsLastComparator<Integer>(this.sortOrder);
		final int compare = comparator.compare( o1.getRank(), o2.getRank() );

		if( compare == 0 ) {
			return comparator.compare( o1.getId(), o2.getId() );
		}

		return compare;
	}
}