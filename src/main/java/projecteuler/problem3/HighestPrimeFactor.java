package projecteuler.problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighestPrimeFactor {

	private static final double INPUT = 600851475143d;

	private static final List<Double> primeFactors = new ArrayList<Double>();

	public static void main(final String... args) {
		findPrimeFactors(INPUT);

		Collections.sort(primeFactors);

		System.out.println(primeFactors.get(primeFactors.size()-1));
	}

	private static void findPrimeFactors(final double input) {
		for ( double i = 2; i < Math.sqrt(input); i++ ) {

			final double d = input / i;

			if( ( d % 1 ) == 0 ) {
				System.out.println(i + " is a factor");
				if(isPrime(i)) {
					primeFactors.add(i);
				}
			}
		}
	}

	private static boolean isPrime(final double input) {
		for ( double i = 2; i < Math.sqrt(input); i++ ) {

			final double d = input / i;

			if( (d % 1) == 0 ) {
				return false;
			}
		}

		return true;
	}
}