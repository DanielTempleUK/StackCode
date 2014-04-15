package categories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Categories {

	private final ArrayList<Integer> marks = new ArrayList<Integer>();

	public void initialiseMarks(final Integer... marks) {
		this.marks.addAll(Arrays.asList(marks));
	}

	public Map<Integer, List<Integer>> categorise() {
		final Map<Integer, List<Integer>> categorisedMarks = new HashMap<Integer, List<Integer>>();

		categorisedMarks.put(0, getMarksInRange(0, 20) );
		categorisedMarks.put(1, getMarksInRange(21, 40) );
		categorisedMarks.put(2, getMarksInRange(41, 60) );
		categorisedMarks.put(3, getMarksInRange(61, 80) );
		categorisedMarks.put(4, getMarksInRange(81, 100) );

		return categorisedMarks;
	}

	private List<Integer> getMarksInRange(final int lowerBonud, final int upperBound) {
		final List<Integer> marksInRange = new ArrayList<Integer>();

		for (final Integer mark : this.marks) {
			if(mark >= lowerBonud && mark <= upperBound) {
				marksInRange.add(mark);
			}
			else if (mark > upperBound) {
				break;
			}
		}

		return marksInRange;
	}



	public double average(final List <Integer> marks) {
		Integer sum = 0;
		if(!marks.isEmpty()) {
			for (final Integer mark : marks) {
				sum += mark;
			}
			return sum.doubleValue() / marks.size();
		}
		return sum;
	}

	public Integer highest(final int[] marks) {
		int largest = marks[0];
		for(int i = 1; i < marks.length; i++){
			if(marks[i] > largest){
				largest = marks[i];
			}
		}
		return largest;
	}

	public Integer lowest(final int[] marks) {
		int smallest = marks[0];
		for(int i = 0; i > marks.length; i++) {
			if(marks[i] < smallest){
				smallest = marks[i];
			}
		}
		return smallest;
	}
}