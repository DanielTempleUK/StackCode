package arras;

import java.util.Scanner;

public class Add2BigInts {

	public static void main(final String[] args) {
		System.out.println("Please enter two numbers which have no more than 50 digits: ");
		final Scanner s = new Scanner(System.in);
		final String x = s.next();
		final String y = s.next();

		System.out.println("Calculating: (" + x + " + " + y + ")");

		//The arrays come back in ascending order of magnitude. See method comment.
		final int[] xDigits = stringToIntArray(x);
		final int[] yDigits = stringToIntArray(y);
		final int[] result = new int[51]; //This array will only ever be 51 in size at most
		int carryOver = 0;

		//Add up each individual digit and process any carry over
		for (int i = 0; i < 50; i++) {
			final int j = xDigits[i] + yDigits[i] + carryOver;
			if( j > 9 ) {
				result[i] = j % 10;
				carryOver = 1; //Since we're adding each individual digit, the only possible carry over is 1.
			}
			else {
				result[i] = j;
				carryOver = 0; //No carry over in this case.
			}
		}

		//We're now about to print the result, so reverse the array to get the descending order of magnitude
		reverseArray(result);

		System.out.print("Result: ");
		//This print boolean is used to ignore any leading 0s.

		//Use the boolean so that we do print trailing or middling 0s
		boolean print = false;
		for (final int i : result) {
			if( !print && i == 0 ) {
				continue;
			}
			else {
				print = true;
			}
			System.out.print(i);
		}
		s.close();
	}

	private static void reverseArray(final int[] result) {
		for(int i = 0; i < result.length/2; i++) {
			final int temp = result[i];
			result[i] = result[result.length - i - 1];
			result[result.length - i - 1] = temp;
		}
	}

	/**
	 * Will assume the String is a number and return an int[] that contains
	 * the digits form the number in ascending magnitude order left to write.
	 * i.e.:
	 * 		Input:		12345
	 * 		Becomes:	{5,4,3,2,1}
	 */
	public static int[] stringToIntArray(final String n) {
		final char[] charArray = n.toCharArray();
		final int[] result = new int[50];

		int resultIndex = 0;
		for (int i = (charArray.length-1); i >=0 ; i--) {
			result[resultIndex] = Integer.parseInt( "" + charArray[i] );
			resultIndex++;
		}

		return result;
	}
}