package arraysearch;

public class Target {

	public int arraySearch(final int a[], final int target){
		for(int index = 0; index < a.length; index++){
			if(a[index] == target)
				return index;
		}
		return -1;
	}

	public static void main(final String[] args) {
		final Target t = new Target();
		final int test1[] = {15,20,5,11};
		final int test2[] = {15,20,7,11};
		System.out.println("Testing arraySearch with target = 5 and array of 15,20,5,11: " +    t.arraySearch(test1,5));
		System.out.println("Testing arraySearch with target = 5 and array of 15,20,7,11: " + t.arraySearch(test2,5));
	}
}
