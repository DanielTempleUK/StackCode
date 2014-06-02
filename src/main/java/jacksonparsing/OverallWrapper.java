package jacksonparsing;

import org.codehaus.jackson.annotate.JsonProperty;

public class OverallWrapper {

	private TestSuite testSuite;

	@JsonProperty("TestSuite")
	public TestSuite getTestSuite() {
		return this.testSuite;
	}

	public void setTestSuite(final TestSuite testSuite) {
		this.testSuite = testSuite;
	}
}
