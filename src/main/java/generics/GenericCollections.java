package generics;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class GenericCollections<A,B> {

	public static void main(final String[] args) {

	}



	public < C extends Collection<?> > C convert( final C collection ) {
		return null;
	}

	public Set<A> convert( final Set<B> collection ) {
		return null;
	}

	public List<A> convert( final List<B> collection ) {
		return null;
	}
}