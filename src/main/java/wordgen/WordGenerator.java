package wordgen;

import java.util.ArrayList;
import java.util.List;

public class WordGenerator {

	public List<String> generateWords() {
		final List<String> words = new ArrayList<String>();

		for (int i = 48; i < 58; i++) {
			for (int j = 48; j < 58; j++) {
				for (int k = 48; k < 58; k++) {
					for (int l = 48; l < 58; l++) {
						final String bruteword = "" + (char) i + (char) j + (char) k + (char) l;
						words.add(bruteword);
					}
				}
			}
		}

		return words;
	}

	public List<String> words(final char min, final char max, final int n) {
		final List<String> ret = new ArrayList<String>();
		if(n == 0) {
			ret.add("");
			return ret;
		}
		for(final String word : words(min, max, n - 1)) {
			for(char c = min; c <= max; ++c) {
				ret.add(word + c);
			}
		}
		return ret;
	}
}