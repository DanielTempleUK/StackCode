package longxml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class LongXmlParser {

	private static final String ELEMENT_TO_BREAK_UP_OPEN = "<element>";
	private static final String ELEMENT_TO_BREAK_UP_CLOSE = "</element>";
	private static final String SUB_ELEMENT_OPEN = "<subelement>";
	private static final String SUB_ELEMENT_CLOSE = "</subelement>";
	private static final int SUB_ELEMENT_SIZE_LIMIT = 1000;

	public static void main(final String[] args) {
		try {

			/* The XML currently looks like this:
			 * 
			 * <root>
			 * <element> ... Super long input with 30000+ characters ... </element>
			 * </root>
			 * 
			 */
			final File file = new File("src\\main\\java\\longxml\\test.xml");
			final BufferedReader reader = new BufferedReader(new FileReader(file));

			final StringBuffer buffer = new StringBuffer();
			String line = reader.readLine();
			while( line != null ) {
				if( line.contains(ELEMENT_TO_BREAK_UP_OPEN) ) {
					buffer.append(ELEMENT_TO_BREAK_UP_OPEN);
					String substring = line.substring(ELEMENT_TO_BREAK_UP_OPEN.length(), (line.length() - ELEMENT_TO_BREAK_UP_CLOSE.length()) );

					while( substring.length() > SUB_ELEMENT_SIZE_LIMIT ) {
						buffer.append(SUB_ELEMENT_OPEN);
						buffer.append( substring.substring(0, SUB_ELEMENT_SIZE_LIMIT) );
						buffer.append(SUB_ELEMENT_CLOSE);

						substring = substring.substring(SUB_ELEMENT_SIZE_LIMIT);
					}
					if( substring.length() > 0 ) {
						buffer.append(SUB_ELEMENT_OPEN);
						buffer.append(substring);
						buffer.append(SUB_ELEMENT_CLOSE);
					}
					buffer.append(ELEMENT_TO_BREAK_UP_CLOSE);
				}
				else {
					buffer.append(line);
				}

				line = reader.readLine();
			}
			reader.close();


			/* The XML now looks something like this:
			 * 
			 * <root>
			 * <element>
			 * <subElement> ... First Part of Data ... </subElement>
			 * <subElement> ... Second Part of Data ... </subElement>
			 * ... Multiple Other SubElements of Data ..
			 * <subElement> ... Final Part of Data ... </subElement>
			 * </element>
			 * </root>
			 */

			//This parses the xml with the new subElements in
			final InputSource src = new InputSource(new StringReader(buffer.toString()));
			final Node document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(src).getFirstChild();

			//This gives us the first child (element) then that's children (subelements)
			final NodeList childNodes = document.getFirstChild().getChildNodes();

			//Then concatenate them back into a big string.
			final StringBuilder finalElementValue = new StringBuilder();
			for( int i = 0; i < childNodes.getLength(); i++ ) {
				final Node node = childNodes.item(i);
				finalElementValue.append( node.getFirstChild().getNodeValue() );
			}

			//At this point do whatever you need to do. Decode, Deserialize, etc...
			System.out.println(finalElementValue.toString());
		}
		catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
