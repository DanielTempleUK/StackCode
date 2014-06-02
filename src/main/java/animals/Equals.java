package animals;

public class Equals {

	public static enum FooBar {
		foo,
		bar;

		public void test() {
			if( foo != bar )
				System.out.println("Test 3: " + foo + " is not equals to " + bar);
		}

		@Override
		public String toString() {
			return "FooBar@ca4c33db";
		}
	}

	public static void main(final String[] args) {
		FooBar foo = FooBar.foo;
		FooBar bar = FooBar.bar;

		if( foo != bar )
			System.out.println("Test 1: " + foo + " is not equals to " + bar);

		foo = FooBar.foo;
		bar = foo;

		if( foo != bar )
			System.out.println("Test 2: " + foo + " is not equals to " + bar);

		FooBar.foo.test();
	}
}
