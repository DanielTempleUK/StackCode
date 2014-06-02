package looping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Loping {

	/**
	 * Looking for method of adding elements to a collection whilst iterating through it.
	 */
	public static void main(final String[] args) {

		//List Iterator method

		final List<Integer> list = new ArrayList<Integer>(Arrays.asList(2,3,4,5,6));
		final ListIterator<Integer> ite = list.listIterator();
		while( ite.hasNext() ) {
			if( ite.next() %2 == 0 ) {
				ite.add( 7 );
			}
			else {
				ite.remove(); //removes the last value returned by next()
			}
		}

		System.out.println(list);



		//Second list method

		final List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(2,3,4,5,6));
		final List<Integer> newList2 = new ArrayList<Integer>(list2);
		final ListIterator<Integer> ite2 = list2.listIterator();
		while( ite2.hasNext() ) {
			final Integer next = ite2.next();
			if( next % 2 == 0 ) {
				newList2.add( 7 );
			}
			else {
				newList2.remove(next);
			}
		}

		System.out.println(newList2);



		//List iterator using set to replace the current item

		final List<String> arrayList = new ArrayList<String>(Arrays.asList("one", "two", "three"));
		System.out.println("Before: " + arrayList);

		final ListIterator<String> iter = arrayList.listIterator();
		while(iter.hasNext()) {
			final String s = iter.next();
			iter.set(s.toUpperCase());
		}

		System.out.println("After: " + arrayList);
	}
}
