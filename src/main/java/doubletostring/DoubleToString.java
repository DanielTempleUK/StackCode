package doubletostring;

import java.math.BigDecimal;

public class DoubleToString {



	public static void main(final String[] args) {
		double d = 33.123456789;
		BigDecimal bigD = new BigDecimal(""+d);
		System.out.println( bigD.toString() );

		d = 1.234;
		bigD = new BigDecimal(""+d);
		System.out.println( bigD.toString() );

		d = 2.0;
		bigD = new BigDecimal(""+d);
		System.out.println( bigD.toString() );

		d = 123456789.0 ;
		bigD = new BigDecimal(""+d);
		System.out.println( bigD.toString() );
	}
}
