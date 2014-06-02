package regexes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static final Pattern pattern = Pattern.compile("\\\\.*e(.*?)\\\\u");

	public static void main(final String[] args) {
		final Matcher matcher = pattern.matcher("\u003cb\u003e Text here\\u003c/b\u003e \u003c/u\u003e\u003c/b\u003e \r\n\r\n");
		if( matcher.find() ) {
			System.out.println(matcher.group(0));
			return;
		}
		System.err.println("No Match Found");
	}

}
