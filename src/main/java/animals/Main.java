package animals;

public class Main {

	public static void main(final String[] args) {
		final Lion adam = new Lion(500, "Adam", 5, 5, 5);
		final Dog fido = new Dog(500, "Fido", 5, 5, 5);
		adam.eat(fido);
	}
}