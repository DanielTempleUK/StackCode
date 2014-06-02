package mocking;

public class StaticD {
	public static C getC() {
		throw new RuntimeException("error");
	}
}