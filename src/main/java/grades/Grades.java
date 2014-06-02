package grades;

public class Grades {

	public static void main(final String[] args) {
		final String [] grades = {"AAAB","ABAA","AABA"};

		for (final String string : grades) {
			final char[] charArray = string.toCharArray();

			int count = 0;
			for (final char c : charArray) {
				if( c == 'A' ) {
					count++;
				}
			}

			if(count >= 3) {
				System.out.println("3+ A Grades");
			}
		}
	}
}
