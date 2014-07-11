package proj;

public class ButtonActions {

	private final Functions functions;

	public ButtonActions() {
		this(new Functions());
	}

	public ButtonActions(final Functions functions) {
		this.functions = functions;
	}

	public int alpha() {
		return this.functions.function1();
	}
}