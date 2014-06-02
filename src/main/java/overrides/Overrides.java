package overrides;


public class Overrides {

	public <T extends Number> String method(final T t) {
		return "";
	};




	public static class Foo1 extends Overrides {
		@Override
		public String method(final Number t) {
			return "";
		}
	}

	public static class Foo2 extends Overrides {
		@Override
		public <T extends Number> String method(final T t) throws NullPointerException {
			return "";
		}
	}
}

