package wordlengths;

import java.util.HashMap;
import java.util.Map;

public class WordLengths {

	public static void main(final String[] args) {
		final Map<Integer, Integer> wordLengths = new HashMap<Integer, Integer>();

		final String testString = "the quick brown fox jumped over the lazy dog";
		final String[] words = testString.split(" ");

		for (int i = 0; i < words.length; i++) {
			final int wordLength = words[i].length();

			if( wordLengths.keySet().contains( wordLength ) ) {
				Integer currentNumberOfOccurences = wordLengths.get(wordLength);
				currentNumberOfOccurences++;
				wordLengths.put(wordLength, currentNumberOfOccurences);
				continue;
			}

			wordLengths.put(wordLength, 1);
		}

		double totalLength = 0;
		double totalOccurrences = 0;
		for (final Integer length : wordLengths.keySet()) {
			final Integer occurrences = wordLengths.get(length);
			totalLength += (length * occurrences );
			totalOccurrences += occurrences;
		}

		final double mean = totalLength / totalOccurrences;

		System.out.println("Average word length is: " + mean );
	}
}
