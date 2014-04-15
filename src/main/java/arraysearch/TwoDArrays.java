package arraysearch;

import java.util.Arrays;

public class TwoDArrays {

	public static String[][] addNewArray( final String[][] baseArray, final String[] toAdd ) {
		final String[][] newArray = new String[ (baseArray.length + 1) ][];

		for( int i = 0; i < baseArray.length; i++ ) {
			newArray[i] = baseArray[i];
		}
		newArray[baseArray.length] = toAdd;

		return newArray;
	}

	public static void main(final String[] args) {
		final String[][] data = {{"Neil-PC","127.0.0.1","Xeon 1230v3 + 2gb DDR2"}};
		final String[] extraData = {"Bob-PC","127.0.0.1","Xeon 1230v3 + 2gb DDR2"};

		final String[][] newArray = addNewArray(data, extraData);
		for (final String[] strings : newArray) {
			System.out.println( Arrays.toString(strings) );
		}
	}
}
