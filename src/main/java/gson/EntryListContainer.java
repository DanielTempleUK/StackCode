package gson;

import java.util.List;

public class EntryListContainer {
	private List<Node> nodes;
	private List<Link> links;

	public void setNodes(final List<Node> nodes) {
		this.nodes = nodes;
	}

	public List<Node> getNodes() {
		return this.nodes;
	}

	public void setLinks(final List<Link> links) {
		this.links = links;
	}

	public List<Link> getLinks() {
		return this.links;
	}
}