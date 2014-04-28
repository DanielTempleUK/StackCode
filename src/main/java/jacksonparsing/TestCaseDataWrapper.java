package jacksonparsing;

import org.codehaus.jackson.annotate.JsonProperty;

public class TestCaseDataWrapper {

	@JsonProperty("TestCaseData")
	private TestCaseData testcaseData;

	public TestCaseData getTestcaseData() {
		return this.testcaseData;
	}

	public void setTestcaseData(final TestCaseData testcaseData) {
		this.testcaseData = testcaseData;
	}
}