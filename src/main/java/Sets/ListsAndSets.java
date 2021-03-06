package Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Question:
 * http://stackoverflow.com/questions/23078182/contents-of-multiple-lists-put-in-a-set/23078257#23078257
 * 
 * OP asked if Lists could be combined into a Set such that the duplicates would be removed.
 * 
 * @author danielt
 */
public class ListsAndSets {

	public static void main(final String[] args) {
		final String one = new String("one");
		final String two = new String("two");
		final String three = new String("three");
		final String four = new String("four");

		final List<String> listA = new ArrayList<String>();
		listA.add(one);
		listA.add(two);

		final List<String> listB = new ArrayList<String>();
		listB.add(two);
		listB.add(three);

		final List<String> listC = new ArrayList<String>();
		listC.add(three);
		listC.add(four);

		final Set<String> set = new HashSet<String>();
		set.addAll(listA);
		set.addAll(listB);
		set.addAll(listC);

		System.out.println(set);
	}
}