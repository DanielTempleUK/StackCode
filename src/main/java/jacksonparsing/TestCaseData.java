package jacksonparsing;

import org.codehaus.jackson.annotate.JsonProperty;

public class TestCaseData {

	private String sequence;
	private int testNumber;
	private String testCaseFile;

	@JsonProperty("-sequence")
	public String getSequence() {
		return this.sequence;
	}

	public void setSequence(final String sequence) {
		this.sequence = sequence;
	}

	@JsonProperty("-testNumber")
	public int getTestNumber() {
		return this.testNumber;
	}

	public void setTestNumber(final int testNumber) {
		this.testNumber = testNumber;
	}

	@JsonProperty("-testCaseFile")
	public String getTestCaseFile() {
		return this.testCaseFile;
	}

	public void setTestCaseFile(final String testCaseFile) {
		this.testCaseFile = testCaseFile;
	}
}