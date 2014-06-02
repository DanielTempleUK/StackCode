package directedacyclicgraph;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("unchecked")
public class NodeTest {

	private Node<String> node;
	private Node<String> parent;
	private Node<String> child;

	@Before
	public void setUp() throws Exception {
		this.parent = new Node<String>("Hello");
		this.node = new Node<String>("World");
		this.child = new Node<String>("Goodbye");
	}

	@Test
	public void thatNodeCanHaveChildrenAdded() {
		this.node.addChild( this.child );
		assertThat(this.node.getChildren().size(), is(1));
	}

	@Test
	public void thatNodeCanHaveParentsAdded() {
		this.node.addParent( this.parent );
		assertThat(this.node.getParents().size(), is(1));
	}

	@Test
	public void thatNodesReturnTheirChildren() {
		this.node.addChild( this.child );
		final Set<Node<String>> children = this.node.getChildren();
		assertThat(children, contains(this.child) );
	}

	@Test
	public void thatNodesReturnTheirParents() {
		this.node.addParent( this.parent );
		final Set<Node<String>> parents = this.node.getParents();
		assertThat(parents, contains(this.parent) );
	}
}