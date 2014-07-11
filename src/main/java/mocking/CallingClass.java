package mocking;

public class CallingClass {

	public String doBdo() {
		final SingletonClass instance = SingletonClass.getInstance();
		return instance.doStuff();
	}
}