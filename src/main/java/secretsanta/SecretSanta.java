package secretsanta;

import java.util.ArrayList;
import java.util.List;

public class SecretSanta {

	private static final List<String> people = new ArrayList<String>(){
		private static final long serialVersionUID = 1L;
		{
			add("Shane");
			add("Colin");
			add("Dan");
			add("Jay");
			add("George");
			add("Joel");
			add("DaveB");
			add("Dom");
			add("Dinesh");
			add("Steve");
			add("BenK");
			add("Justine");
			add("Suzy");
			add("Jeremy");
			add("BenH");
			add("Sarah");
			add("Robin");
			add("Glen");
			add("DaveW");
		}};

		public static void main(final String[] args) {
			final List<String> remainingPeople = new ArrayList<String>(people);

			for (int i = 0; i < people.size(); i++) {
				final String personBeingChosenFor = people.get(i);

				int randomIndex = (int)(Math.random() * remainingPeople.size());
				String personChosen = remainingPeople.get(randomIndex);
				while(personChosen.equals(personBeingChosenFor)) {
					randomIndex = (int)(Math.random() * remainingPeople.size());
					personChosen = remainingPeople.get(randomIndex);
				}

				System.out.println(personBeingChosenFor + " gets: " + personChosen);
			}
		}
}