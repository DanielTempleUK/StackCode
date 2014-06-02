package mocking;

public class Class1 {
	public Object method(final Object passedObject) {
		final Class2 class2 = new Class2();
		return class2.doMethodCall(passedObject);
	}
}