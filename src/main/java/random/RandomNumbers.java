package random;

public class RandomNumbers {

	public static void main(final String args[]){
		System.out.println(bar(15));
		System.out.println(foo(15));
	}

	//Iterative Solution
	public static String bar(final int n){
		final StringBuilder builder = new StringBuilder();
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= i ; j++) {
				builder.append(j);
			}
			builder.append(" ");
		}
		return builder.toString();
	}

	//Recursive Solution (with some iteration too)
	public static String foo(final int n) {
		String s = "";

		if(n == 1){       //Base step of the recursion
			s = 1 + " ";
		}
		else {
			final String foo = foo(n-1);
			s = foo + foo.substring(foo.length() - n, foo.length() -1) + n + " "; //Recursive step of the recursion
		}

		return s;
	}
}