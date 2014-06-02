package median;


public class Median {

	public static void main(final String[] args) {
		/* Number	Frequency
		 * 		0			5
		 * 		1			6
		 * 		2			8
		 * 		3			1
		 * 		4			2
		 * 		5			3
		 * 		6			6
		 * 		7			9
		 * 		8			5
		 * 		9			7
		 * 
		 * Total = 52
		 *                       Midpoint(s)
		 *                          **
		 * 0000011111122222222344555666666777777777888889999999
		 * 
		 * Median = 6
		 */
		final int[] frequencies = {5,6,8,1,2,3,6,9,5,7};
		final int[] rollingFrequencies = new int[frequencies.length];

		rollingFrequencies[0] = frequencies[0];
		for (int i = 1; i < rollingFrequencies.length; i++) {
			rollingFrequencies[i] = frequencies[i] + rollingFrequencies[i-1];
		}

		//At this point, rollingFrequencies is: [5, 11, 19, 20, 22, 25, 31, 40, 45, 52]
		final int total = rollingFrequencies[rollingFrequencies.length - 1]; //The final rollingFreq will be the total.
		final int mid = total / 2;

		for (int i = 0; i < rollingFrequencies.length; i++) {
			if( rollingFrequencies[i] > mid ) {
				System.out.println( i );
				return;
			}
		}
	}
}
