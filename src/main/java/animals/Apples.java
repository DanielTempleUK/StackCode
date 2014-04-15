package animals;
import java.util.Scanner;

public class Apples {

	public static void main(final String[] args) {
		int inputNumber=0;
		int sum;
		int count;
		double average;

		sum = 0;
		count = 0;

		final Scanner reader = new Scanner(System.in);
		System.out.println("Program calculates the average of inputted grades.");
		System.out.println("Finish with a negative integer.");
		System.out.print("Input a grade (4-10): ");
		inputNumber = reader.nextInt();

		while (inputNumber > 0) {
			if (inputNumber<4 || inputNumber>10) {
				System.out.println("Invalid grade!");
			} else {
				sum += inputNumber;
				count++;
			}
			System.out.print("Input a grade (4-10): ");
			inputNumber = reader.nextInt();
		}

		if (count==0) {
			System.out.print("You didn't enter any data!");
		}
		else {
			average = ((double)sum) / count;
			System.out.println();
			System.out.println(count + " grades inputted.");
			System.out.print("Average of the grades: "+ average);
		}
	}
}