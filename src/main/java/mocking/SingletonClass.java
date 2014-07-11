package mocking;

public final class SingletonClass {
	private static SingletonClass instance;
	public static String status;

	private SingletonClass() {
		initPaths();
	}

	public static SingletonClass getInstance() {
		if( instance == null ) {
			instance = new SingletonClass();
		}
		return instance;
	}

	private void initPaths() {
		SingletonClass.status = "I have been in the method !";
	}

	public String doStuff() {
		return "stuff done ...";
	}
}