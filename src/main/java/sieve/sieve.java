package sieve;

import java.io.IOException;
import java.util.Scanner;

public class sieve {

	public static void main(final String[] args)throws IOException {
		final Scanner s = new Scanner(System.in);

		System.out.println("Please give number of tests: ");
		final int numberOfTests = s.nextInt();

		for( int a = 0; a < numberOfTests; a++ ) {
			System.out.println("Test: " + (a+1) );
			System.out.println("Please give lower limit: ");
			final int lowerLimit = s.nextInt();
			System.out.println("Please give upper limit: ");
			final int upperLimit = s.nextInt();

			final Boolean[] primes = new Boolean[upperLimit];
			primes[0] = Boolean.FALSE;
			primes[1] = Boolean.FALSE;

			for ( int i = 2; i < upperLimit; i++ ) {
				if( primes[i] == null ) {
					primes[i] = Boolean.TRUE;
				}

				for( int j = i+i; j < upperLimit; j+=i ) {
					primes[j] = Boolean.FALSE;
				}
			}

			for (int i = 0; i<upperLimit; i++) {
				if( primes[i] && i > lowerLimit ) {
					System.out.println( (long) i );
				}
			}
		}
	}
}