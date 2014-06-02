package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tag {

	private Integer rank;
	private Integer id;

	public Tag(final Integer rank, final Integer id) {
		this.rank = rank;
		this.id = id;
	}

	public Integer getRank() {
		return this.rank;
	}

	public void setRank(final Integer rank) {
		this.rank = rank;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "R=" + this.rank + "&I=" + this.id; //Tag: " + super.toString() + "
	}

	public static void main(final String[] args) {
		final List<Tag> tags = new ArrayList<Tag>();
		tags.add(new Tag(null, 1));
		tags.add(new Tag(1, 2));
		tags.add(new Tag(null, 2));
		tags.add(new Tag(6, 5));
		tags.add(new Tag(null, 4));
		tags.add(new Tag(6, 3));
		tags.add(new Tag(null, 3));
		tags.add(new Tag(3, 7));

		System.out.println("ASCENDING");
		Collections.sort(tags, new TagComparator(TagComparator.ASCENDING));
		System.out.println(tags);

		System.out.println("DESCENDING");
		Collections.sort(tags, new TagComparator(TagComparator.DESCENDING));
		System.out.println(tags);
	}
}