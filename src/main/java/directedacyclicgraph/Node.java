package directedacyclicgraph;

import java.util.HashSet;
import java.util.Set;

public class Node<T extends Object> {

	private T data;
	private Set<Node<T>> children;
	private Set<Node<T>> parents;

	public Node(final T data) {
		this.data = data;
		this.children = new HashSet<Node<T>>();
		this.parents = new HashSet<Node<T>>();
	}

	public T getData() {
		return this.data;
	}

	public Set<Node<T>> getChildren() {
		return this.children;
	}

	public boolean addChild(final Node<T> newChild) {
		return this.children.add(newChild);
	}

	public Set<Node<T>> getParents() {
		return this.parents;
	}

	public boolean addParent(final Node<T> newParent) {
		return this.parents.add(newParent);
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof Node) {
			final Node<?> typedObj = (Node<?>) obj;
			return this.data.equals( typedObj.getData() );
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return this.data.hashCode();
	}
}