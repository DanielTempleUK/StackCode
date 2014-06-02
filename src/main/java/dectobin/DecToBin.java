package dectobin;

public class DecToBin {

	public static void main(final String args[]) {
		int x=12;
		int z=x;
		final int n=(int)Math.ceil(Math.log10(x)/Math.log10(2));
		System.out.println("No. of Digits="+n);
		final int[] a = new int[5];
		int j=0;

		while (z!=0)
		{
			x=z%2;
			a[j]=x;
			j++;
			z=z/2;
		}
		final int l=a.length;

		for(int i=l-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}

		System.out.println("");

		final int LEN = 12;
		final int[][] location = new int[LEN][2];

		location[0][0] = 50;
		location[0][1] = 0;
		location[1][0] = 50;
		location[1][1] = 50;

		System.out.println("WAHO!");




	}
}
