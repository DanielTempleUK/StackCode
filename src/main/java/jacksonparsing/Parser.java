package jacksonparsing;

import org.codehaus.jackson.map.ObjectMapper;

public class Parser {

	public static void main(final String[] args) {

		final String json = "{\"TestSuite\":{\"TestSuiteInfo\":{\"-description\":\"parse\"},\"TestCase\":[" +
				"{\"TestCaseData\":{\"-sequence\":\"sequential\",\"-testNumber\":\"2\",\"-testCaseFile\":\"testcase\\\\Web\\\\Ab.xml\"}}," +
				"{\"TestCaseData\":{\"-sequence\":\"sequential\",\"-testNumber\":\"3\",\"-testCaseFile\":\"testcase\\\\Web\\\\BC.xml\"}}" +
				"]}}";

		final ObjectMapper mapper = new ObjectMapper();

		try {
			final OverallWrapper readValue = mapper.readValue(json, OverallWrapper.class);

			System.out.println(readValue.getTestSuite());
		}
		catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
