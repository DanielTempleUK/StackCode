package jsion;

public class Test {

	public String lastName;
	public String jsonObjectIDontWantToParse;

	@Override
	public String toString() {
		return "lastName=" + this.lastName + ", jsonObjectIDontWantToParse=" + this.jsonObjectIDontWantToParse;
	}

	public void setJsonObjectIDontWantToParse(final String jsonObjectIDontWantToParse) {
		this.jsonObjectIDontWantToParse = jsonObjectIDontWantToParse;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}
}