package grouping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grouping {

	public static void main(final String[] args) {
		//Your input of [[1,0],[2,0],[3,3],[1,0,0],[2,0],[2,0,0],[0,0],[1,2]] in a List of Lists
		final List<List<String>> input = createInput();

		//To hold onto the groups for printing later
		final Map<Integer, List<List<String>>> groupsMap = new HashMap<Integer, List<List<String>>>();

		//This will track the List<Integer> that have already been grouped.
		final List<List<String>> ungroupedLists = new ArrayList<List<String>>(input);

		//Have a separate groupCounter so that we end up with continuous group numbers
		int groupCounter = 0;

		for (int i = 0; i < input.size(); i++ ) {
			//This gets the group indexed at i (starting from 0 just like array
			final List<String> currentList = input.get(i);

			//This checks if the currentList has already been grouped.
			//If it has, then continue to the next List.
			if( !ungroupedLists.contains(currentList) ) {
				continue;
			}
			//If it hasn't already been grouped, then remove it as we're going to group it now.
			ungroupedLists.remove(currentList);

			//Create a new group to add any grouped lists to.
			final List<List<String>> currentGroup = new ArrayList<List<String>>();
			currentGroup.add(currentList);

			//This list will hold the lists that get grouped so they can be removed for subsequent grouping runs.
			final List<List<String>> groupedLists = new ArrayList<List<String>>();

			//For the ungrouped lists, check if they group with the current list.
			for (int j = 0; j < ungroupedLists.size(); j++) {
				//Get the list we want to compare the current one to.
				final List<String> currentComparisonList = ungroupedLists.get(j);

				//Gets the first integer of the currentList
				final String integer = currentList.get(0);
				//Gets the last integer of the currentList
				final String integer2 = currentList.get(currentList.size()-1);
				//Gets the first integer of the currentComparisonList
				final String integer3 = currentComparisonList.get(0);
				//Gets the last integer of the currentComparisonList
				final String integer4 = currentComparisonList.get(currentComparisonList.size()-1);

				//If the first Integers match, and the last integers match, add the currentComparisonList
				//to the group and makr it for removal later
				if( integer.equals(integer3) && integer2.equals(integer4) ) {
					currentGroup.add(currentComparisonList);
					groupedLists.add(currentComparisonList);
				}
			}

			//Remove the now grouped lists.
			ungroupedLists.removeAll(groupedLists);

			//When we've done all of that checking, add the group to the map of groups.
			groupsMap.put(groupCounter, currentGroup);

			//Finally increment the groupCounter for the next group
			groupCounter++;
		}

		//This simply prints the output in the format desired.
		for ( int i = 0; i < groupsMap.size(); i++ ) {
			System.out.println("group: " + i);
			for (final List<String> list : groupsMap.get(i)) {
				System.out.println(list.toString());
			}
		}
	}

	private static List<List<String>> createInput() {
		final List<List<String>> input = new ArrayList<List<String>>();
		final ArrayList<String> list1 = new ArrayList<String>();
		list1.add("1");
		list1.add("0");

		final ArrayList<String> list2 = new ArrayList<String>();
		list2.add("2");
		list2.add("0");

		final ArrayList<String> list3 = new ArrayList<String>();
		list3.add("3");
		list3.add("3");

		final ArrayList<String> list4 = new ArrayList<String>();
		list4.add("1");
		list4.add("0");
		list4.add("0");

		final ArrayList<String> list5 = new ArrayList<String>();
		list5.add("2");
		list5.add("0");

		final ArrayList<String> list6 = new ArrayList<String>();
		list6.add("2");
		list6.add("0");
		list6.add("0");

		final ArrayList<String> list7 = new ArrayList<String>();
		list7.add("0");
		list7.add("0");

		final ArrayList<String> list8 = new ArrayList<String>();
		list8.add("1");
		list8.add("2");

		input.add(list1);
		input.add(list2);
		input.add(list3);
		input.add(list4);
		input.add(list5);
		input.add(list6);
		input.add(list7);
		input.add(list8);
		return input;
	}
}
