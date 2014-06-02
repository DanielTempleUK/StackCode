package jacksonparsing;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class TestSuite {

	private TestSuiteInfo testSuiteInfo;

	private List<TestCaseDataWrapper> testCaseData;

	@JsonProperty("TestCase")
	public List<TestCaseDataWrapper> getTestCaseData() {
		return this.testCaseData;
	}

	public void setTestCaseData(final List<TestCaseDataWrapper> testCaseData) {
		this.testCaseData = testCaseData;
	}

	@JsonProperty("TestSuiteInfo")
	public TestSuiteInfo getTestSuiteInfo() {
		return this.testSuiteInfo;
	}

	public void setTestSuiteInfo(final TestSuiteInfo testSuiteInfo) {
		this.testSuiteInfo = testSuiteInfo;
	}

}
