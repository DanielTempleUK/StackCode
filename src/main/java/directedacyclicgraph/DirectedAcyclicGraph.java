package directedacyclicgraph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DirectedAcyclicGraph<T extends Object> {

	private Node<T> root;
	private List< Node<T> > nodes;

	public DirectedAcyclicGraph() {
		super();
		this.nodes = new ArrayList< Node<T> >();
	}

	public DirectedAcyclicGraph(final T root) {
		super();

		this.root = new Node<T>( root );

		this.nodes = new ArrayList< Node<T> >();
		this.nodes.add( this.root );
	}

	public boolean addRoot( final T data ) {
		if( this.root == null ) {
			this.root = new Node<T>( data );
			this.nodes.add( this.root );
			return true;
		}
		return false;
	}

	public boolean addChild(final T parent, final T newChild) {
		final Node<T> parentNode = new Node<T>( parent );
		final Node<T> childNode = new Node<T>( newChild );

		if( !this.nodes.contains( parentNode ) ) {
			return false;
		}

		final int indexOf = this.nodes.indexOf( parentNode );
		final Node<T> parentRef = this.nodes.get( indexOf );
		childNode.addParent(parentRef);
		return parentRef.addChild( childNode ) && this.nodes.add( childNode );
	}

	public Set<T> getChildrenOf(final T data) {
		final Set<T> children = new HashSet<T>();

		final Set<Node<T>> childNodes = getNodeFromData(data).getChildren();

		for (final Node<T> childNode : childNodes) {
			children.add(childNode.getData());
		}

		return children;
	}

	public Set<T> getParentsOf(final T data) {
		final Set<T> parents = new HashSet<T>();

		final Set<Node<T>> parentNodes = getNodeFromData(data).getParents();

		for (final Node<T> parentNode : parentNodes) {
			parents.add(parentNode.getData());
		}

		return parents;
	}

	public Set<T> getAllDescendantsOf(final T data) {
		final Set<T> descendants = new HashSet<T>();
		final Set<T> children = getChildrenOf(data);

		for (final T t : children) {
			descendants.addAll( getAllDescendantsOf( t ) );
		}

		descendants.addAll(children);
		return descendants;
	}

	private Node<T> getNodeFromData(final T data) {
		final Node<T> node = new Node<T>( data );
		final int indexOf = this.nodes.indexOf( node );
		return this.nodes.get(indexOf);
	}
}