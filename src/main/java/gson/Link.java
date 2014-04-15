package gson;

public class Link {
	private String source;
	private String target;
	private String value;
	private String distance;

	public String getSource() {
		return this.source;
	}

	public void setSource(final String source) {
		this.source = source;
	}

	public String getTarget() {
		return this.target;
	}

	public void setTarget(final String target) {
		this.target = target;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(final String value) {
		this.value = value;
	}

	public String getDistance() {
		return this.distance;
	}

	public void setDistance(final String distance) {
		this.distance = distance;
	}
}