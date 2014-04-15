package passwords;

import java.util.Scanner;

public class Checker {

	public static void main(final String[] args) {
		final Scanner scan = new Scanner(System.in);

		boolean correct = false;
		do {
			System.out.println("Please enter your password: ");
			final String nextLine = scan.nextLine();

			if( nextLine.equals("Dave123") ) {
				System.out.println("WAHOO!!!");
				correct = true;
			}
			else {
				System.out.println("BOOOO!!!!");
			}
		} while ( !correct );

		scan.close();
	}
}