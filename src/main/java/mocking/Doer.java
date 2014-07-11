package mocking;

public class Doer {
	public void doIt(){
		final int result = Helper.help(5);
		System.out.println(result);
	}
}