package animals;

public class Dog implements Edible {

	public String name;
	public int heightCMeters;
	public int lengthCMeters;
	public float weightKilos;
	public int hitPoints;

	public Dog(final int hitPoints, final String name, final int heightCMeters, final int lengthCMeters, final float weightKilos) {
		this.name = name;
		this.heightCMeters = heightCMeters;
		this.lengthCMeters = lengthCMeters;
		this.weightKilos = weightKilos;
		this.hitPoints = hitPoints;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Name: ");
		builder.append(this.name);
		builder.append(", Height CM: ");
		builder.append(this.heightCMeters);
		builder.append(", Length CM: " );
		builder.append(this.lengthCMeters);
		builder.append(", Weight Kilos: ");
		builder.append(this.weightKilos);
		builder.append(", Hit Points: ");
		builder.append(this.hitPoints);
		return builder.toString();
	}

	public void eat(final Edible x) {
		x.isEaten(10);
		System.out.println(x);
	}

	public void isEaten(final int hitPointsToDeduct) {
		this.hitPoints = this.hitPoints - hitPointsToDeduct;
	}
}