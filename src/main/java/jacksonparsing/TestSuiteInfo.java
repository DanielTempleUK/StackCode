package jacksonparsing;

import org.codehaus.jackson.annotate.JsonProperty;

public class TestSuiteInfo {

	private String description;

	@JsonProperty("-description")
	public String getDescription() {
		return this.description;
	}
	public void setDescription(final String description) {
		this.description = description;
	}
}
