package node;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.openide.nodes.Node;

public class NodeTest {

	public static class IsRoot {
		public boolean isRoot(final Node node) {
			final Node parentNode = node.getParentNode();
			return (parentNode == null);
		}
	}

	private IsRoot isroot;

	@Before
	public void setUp() {
		this.isroot = new IsRoot();
	}

	@Test
	public void gettingExpectationsForGetParentFromNode() {
		final Node parentNode = EasyMock.createMock(Node.class);
		EasyMock.replay(parentNode);

		final Node node = EasyMock.createMock(Node.class);
		node.getParentNode();
		EasyMock.expect(node.getParentNode()).andReturn(parentNode);
		EasyMock.replay(node);

		this.isroot.isRoot(node);

		EasyMock.verify(node);
	}

	public static abstract class AbstractWoop {
		public boolean testMeth(final String string) {
			return "dave".equals(string);
		}

		public abstract boolean testMeth2(final String string);
	}

	@Test
	public void gettingExpectationsForGetParentFromNode456() {
		final AbstractWoop parentNode = EasyMock.createMock(AbstractWoop.class);
		EasyMock.expect(parentNode.testMeth("string")).andReturn(true);
		EasyMock.replay(parentNode);

		parentNode.testMeth("string");

		EasyMock.verify(parentNode);
	}




}
