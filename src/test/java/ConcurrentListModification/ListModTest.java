package ConcurrentListModification;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ListModTest {

	private final ListMod noteBook = new ListMod();

	@Before
	public void setUp() throws Exception {
		this.noteBook.addNotes("Hello", "My", "Name", "Is", "Dave");
	}

	@Test
	public void thatNoteIsRemoved() {
		Assert.assertTrue(this.noteBook.containsNote("Hello"));

		this.noteBook.removeFirstNote("Hello");

		Assert.assertFalse(this.noteBook.containsNote("Hello"));
	}


	public static class Parent {
		public int parentMethod() {
			return 2;
		}
	}

	public static class Child extends Parent {
		public int childMethod() {
			return 1;
		}
	}
}