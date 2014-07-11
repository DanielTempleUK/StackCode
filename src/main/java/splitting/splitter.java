package splitting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class splitter {

	public static void main(final String[] args) {

		final String toSplit = "name:jack,berk,john;teacher:smith,jan;course:math;";


		final List<String> elements = getElements(toSplit);
		String[] values = new String[3];

		for (final String string : elements) {
			values = toSplit.split(string);
		}

		System.out.println( Arrays.toString(values) );




	}

	private static List<String> getElements(final String toSplit) {
		final String name = "name";
		final String teacher = "teacher";
		final String course = "course";

		int namePos = -1;
		int teacherPos = -1;
		int coursePos = -1;

		if( toSplit.contains(name) ) {
			namePos = toSplit.indexOf(name);
		}
		if( toSplit.contains(teacher) ) {
			teacherPos = toSplit.indexOf(teacher);
		}
		if( toSplit.contains(course) ) {
			coursePos = toSplit.indexOf(course);
		}

		final List<Integer> indexes = new ArrayList<Integer>();
		if( namePos>-1 ) {
			indexes.add(namePos);
		}
		if( teacherPos > -1 ) {
			indexes.add(teacherPos);
		}
		if( coursePos > -1) {
			indexes.add(coursePos);
		}
		Collections.sort(indexes);

		final List<String> positions = new ArrayList<String>();
		for (final Integer integer : indexes) {

			if( integer == namePos) {
				positions.add(name);
			}
			if( integer == teacherPos) {
				positions.add(teacher);
			}
			if( integer == coursePos) {
				positions.add(course);
			}
		}

		return positions;
	}

}