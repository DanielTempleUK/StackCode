package gson;

public class Node {
	private String name;
	private int type;
	private String slug;
	private String entity;

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public int getType() {
		return this.type;
	}

	public void setType(final int type) {
		this.type = type;
	}

	public String getSlug() {
		return this.slug;
	}

	public void setSlug(final String slug) {
		this.slug = slug;
	}

	public String getEntity() {
		return this.entity;
	}

	public void setEntity(final String entity) {
		this.entity = entity;
	}
}