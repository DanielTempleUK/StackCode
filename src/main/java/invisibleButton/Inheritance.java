package invisibleButton;

import java.util.ArrayList;
import java.util.List;

public class Inheritance {

	public static class A {
		@Override
		public String toString() {
			return "A";
		}
	}
	public static class B extends A {
		@Override
		public String toString() {
			return "B";
		}
	}
	public static class C extends A {
		@Override
		public String toString() {
			return "C";
		}
	}
	public static class D extends B {
		@Override
		public String toString() {
			return "D";
		}
	}

	public static void main(final String[] args) {
		final List<A> list = new ArrayList<A>();
		list.add(new A());
		list.add(new B());
		list.add(new C());
		list.add(new D());

		for (final A a : list) {
			System.out.println(a);
		}
	}
}
