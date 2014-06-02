package Visitors;

public class Visitor
{
	// Define Instance Variables
	public String name;
	public String gender;
	public int age;
	public String citizenship;
	public int currentRoom;

	// Define Constructor
	public Visitor(final String theName, final String theGender, final int theAge, final String theCitizenship)
	{
		this.name = theName;
		this.gender = theGender;
		this.age = theAge;
		this.citizenship = theCitizenship;
		this.currentRoom = 0;
	}

	@Override
	public String toString( )
	{
		final String output = String.format("%-20s %-15s %d", this.name, this.citizenship, this.currentRoom);
		return output;
	}
}