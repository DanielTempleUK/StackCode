package negtaives;

import java.util.Arrays;

public class Negatives {

	public static void main(final String[] args) {
		System.out.println( Arrays.toString( negatives(new int[]{1, 2, 3, -4, -5, -5, -9}) ) );
	}

	private static int[] negatives(final int[] a){
		int[] na = new int[0];

		int count = 0;
		for( int i = 0; i < a.length; i++ ) {
			if( a[i] < 0 ) {
				na = Arrays.copyOf(na, count+1);
				na[count] = a[i];
				count++;
			}
		}

		return na;
	}
}
