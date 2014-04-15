package mocking;

public class Generics {

	@SuppressWarnings("unchecked")
	public <T extends Object> T createInitInstance(final Class<T> clazz) {
		return (T)new Object();
	}
}
