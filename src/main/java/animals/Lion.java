package animals;

public class Lion implements Edible {

	public String name;
	public int heightCMeters;
	public int lengthCMeters;
	public float weightKilos;
	public int hitPoints;

	public Lion(final int hitPoints, final String name, final int heightCMeters, final int lengthCMeters, final float weightKilos) {
		this.name = name;
		this.heightCMeters = heightCMeters;
		this.lengthCMeters = lengthCMeters;
		this.weightKilos = weightKilos;
	}

	public void lionDetails() {
		System.out.println("Name: " + this.name);
		System.out.println("Height CM: " + this.heightCMeters);
		System.out.println("Length CM: " + this.lengthCMeters);
		System.out.println("Weight Kilos: " + this.weightKilos);
	}

	public void eat(final Edible x) {
		x.isEaten(10);
		System.out.println(x);
	}

	public void isEaten(final int hitPointsToDeduct) {
		this.hitPoints = this.hitPoints - hitPointsToDeduct;
	}
}