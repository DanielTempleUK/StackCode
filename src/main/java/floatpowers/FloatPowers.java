package floatpowers;

public class FloatPowers {

	public static float power(final float base, final int power) {
		float result = 1;
		for( int i = 0; i < power; i++ ) {
			result *= base;
		}
		return result;
	}

	public static void main(final String[] args) {
		System.out.println( power(Float.MAX_VALUE, 2) );

		System.out.println( Math.pow(Double.MAX_VALUE, 2) );
	}
}
