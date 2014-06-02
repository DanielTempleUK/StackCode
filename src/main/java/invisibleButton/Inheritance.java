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
		
		//My point about having to cast
		final A obj = list.get(1);
		final B obj2 = (B) list.get(1);
		//This line would have caused a compilation failure
		//final B obj3 = list.get(0);
		
		for (A a : list) {
			System.out.println(a);
		}
	}
}
