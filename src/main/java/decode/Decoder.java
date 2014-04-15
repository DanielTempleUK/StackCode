package decode;

import java.util.HashMap;
import java.util.Map;

public class Decoder {

	private static final Map<String, String> morseCodeMap;
	static {
		morseCodeMap = new HashMap<String, String>();
		morseCodeMap.put(".-", "A");
		morseCodeMap.put("-...", "B");
		morseCodeMap.put("-.-.", "C");
		morseCodeMap.put("-..", "D");
		morseCodeMap.put(".", "E");
		morseCodeMap.put("..-.", "F");
		morseCodeMap.put("--.", "G");
		morseCodeMap.put("....", "H");
		morseCodeMap.put("..", "I");
		morseCodeMap.put(".---", "J");
		morseCodeMap.put("-.-", "K");
		morseCodeMap.put(".-..", "L");
		morseCodeMap.put("--", "M");
		morseCodeMap.put("-.", "N");
		morseCodeMap.put("---", "O");
		morseCodeMap.put(".--.", "P");
		morseCodeMap.put("--.-", "Q");
		morseCodeMap.put(".-.", "R");
		morseCodeMap.put("...", "S");
		morseCodeMap.put("-", "T");
		morseCodeMap.put("..-", "U");
		morseCodeMap.put("...-", "V");
		morseCodeMap.put(".--", "W");
		morseCodeMap.put("-..-", "X");
		morseCodeMap.put("-.--", "Y");
		morseCodeMap.put("--..", "Z");
	}

	public String decode(final String morseCode) {
		final StringBuilder decodedMessage = new StringBuilder();

		final String[] splitMorseCode = morseCode.split(" ");

		for (final String morseCharacter : splitMorseCode) {
			if( "".equals(morseCharacter) ) {
				if ( !decodedMessage.toString().endsWith(" ") ) {
					decodedMessage.append(" ");
				}
				continue;
			}

			if( morseCodeMap.containsKey(morseCharacter) ) {
				decodedMessage.append(morseCodeMap.get(morseCharacter));
			}
		}

		return decodedMessage.toString();
	}
}