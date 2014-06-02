package directedacyclicgraph;


import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DirectedAcyclicGraphTest {

	DirectedAcyclicGraph<String> graph;

	@Before
	public void setUp() throws Exception {
		this.graph = new DirectedAcyclicGraph<String>( "Football" );
		Assert.assertTrue( this.graph.addChild("Football", "Competition") );
		Assert.assertTrue( this.graph.addChild("Football", "Player") );
		Assert.assertTrue( this.graph.addChild("Competition", "Premiership") );
		Assert.assertTrue( this.graph.addChild("Competition", "Champions League") );
		Assert.assertTrue( this.graph.addChild("Premiership", "Man City") );
		Assert.assertTrue( this.graph.addChild("Premiership", "Man Utd") );
		Assert.assertTrue( this.graph.addChild("Champions League", "Man Utd") );
	}

	@Test
	public void thatGraphCannotAddAChildToANonExistantParent() {
		Assert.assertFalse( "Should have rejected the duplicate entry", this.graph.addChild("B", "A") );
	}

	@Test
	public void thatChildrenAreRetrievedCorrectly() {
		final Set<String> children = this.graph.getChildrenOf("Football");
		Assert.assertEquals( children.size(), 2 );
		Assert.assertTrue( children.contains( "Competition") );
		Assert.assertTrue( children.contains( "Player" ) );
	}

	@Test
	public void thatAllDescendantsAreRetrievedCorrectlyFor1Tier() {
		final Set<String> children = this.graph.getAllDescendantsOf("Premiership");
		Assert.assertEquals( children.size(), 2 );
		Assert.assertTrue( children.contains( "Man City") );
		Assert.assertTrue( children.contains( "Man Utd" ) );
	}

	@Test
	public void thatAllDescendantsAreRetrievedCorrectlyForMultipleTiers() {
		final Set<String> children = this.graph.getAllDescendantsOf("Football");
		Assert.assertEquals( children.size(), 6 );
		Assert.assertTrue( children.contains( "Competition" ) );
		Assert.assertTrue( children.contains( "Player" ) );
		Assert.assertTrue( children.contains( "Premiership" ) );
		Assert.assertTrue( children.contains( "Champions League") );
		Assert.assertTrue( children.contains( "Man City") );
		Assert.assertTrue( children.contains( "Man Utd" ) );
	}

	@Test
	public void thatParentsCanBeRetrieved() {
		final Set<String> parents = this.graph.getParentsOf("Man Utd");
		Assert.assertEquals( parents.size(), 2);
		Assert.assertTrue( parents.contains( "Premiership" ) );
		Assert.assertTrue( parents.contains( "Champions League") );
	}

	@Test
	public void thatGraphCanBeCreatedEmpty() {
		this.graph = new DirectedAcyclicGraph<String>();
		Assert.assertNotNull( this.graph );
	}

	@Test
	public void thatEmptyGraphCanHaveItsRootSet() {
		this.graph = new DirectedAcyclicGraph<String>();
		Assert.assertTrue( this.graph.addRoot("Football") );
	}

	@Test
	public void thatPopulatedGraphCannotHaveItsRootSet() {
		Assert.assertFalse( this.graph.addRoot("Football") );
	}
}