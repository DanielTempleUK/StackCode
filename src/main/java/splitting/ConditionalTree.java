package splitting;

public class ConditionalTree {

	public static void main(final String[] args) {
		final String input = "=IF(A2=1;0;IF(D2=D3;IF(C2=1;TRUE;FALSE);4))";

		final String[] elements = input.split("IF");

		for (int i = 1; i < elements.length; i++ ) {
			String element = elements[i];
			element = element.replaceAll("\\(", "");
			element = element.replaceAll("\\)", "");
			if( element.charAt(element.length()-1) == ';' ) {
				element = element.substring(0, element.length()-1);
			}

			System.out.println(element);





		}

	}
}
