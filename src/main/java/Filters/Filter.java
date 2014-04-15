package Filters;

public class Filter {

	private final FilterExecutor filter;

	public Filter(final FilterExecutor f) {
		this.filter = f;
	}

	public void handle() {
		final Object object = new Object();
		this.filter.execute(object);
	}
}
