package platenumber;

import java.util.HashMap;
import java.util.Map;

public class MostCommomChars {

	public static void main(final String[] args) {
		final  StringBuilder stringBuilder = new StringBuilder();

		//Points 1 and 2
		final char[][] characters = new char[][]{
				"where".toCharArray(),
				"wHere".toCharArray(),
				"where".toCharArray(),
				"wperg".toCharArray(),
				"where".toCharArray(),
				"w6ere".toCharArray(),
				"where".toCharArray(),
				"where".toCharArray(),
				"wHere".toCharArray(),
				"w4eeg".toCharArray(),
				"where".toCharArray(),
				"wHare".toCharArray(),
				"where".toCharArray(),
				"where".toCharArray(),
				"weede".toCharArray(),
				"whare".toCharArray(),
				"wHect".toCharArray(),
				"where".toCharArray(),
				"wHere".toCharArray(),
				"whara".toCharArray()
		};

		//Point 3
		for (int i=0; i < 5 ; i++) {

			//Point 4
			final Map<String, Integer> occurrences = new HashMap<String, Integer>();
			for(int j = 0; j < characters.length; j++ ) {

				final String character = ""+characters[j][i];

				if( occurrences.containsKey(character) ) {
					Integer currentTotal = occurrences.get(character);
					occurrences.put(character, ++currentTotal);
					continue;
				}

				occurrences.put(character, 1);
			}

			//Point 5
			int mostOccurrences = 0;
			String characterWithMostOccurrences = "";
			for (final String character : occurrences.keySet()) {
				if( occurrences.get(character) > mostOccurrences ) {
					mostOccurrences = occurrences.get(character);
					characterWithMostOccurrences = character;
				}
			}

			stringBuilder.append(characterWithMostOccurrences);

		}

		//Point 6
		System.out.println(stringBuilder.toString());
	}
}
