package mocking;

public class A {
	B b;
	C c;
	public A (final B _b) {
		this.b = _b;
		this.c = getC();
	}
	public void run (final String _val) {
		final String val = this.b.getValue();
		//do something
		System.out.println(val);
	}
	public C getC() {
		return StaticD.getC();
	}
}
