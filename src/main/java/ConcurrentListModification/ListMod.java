package ConcurrentListModification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMod {

	private final List<String> notes;

	public ListMod() {
		this.notes = new ArrayList<String>();
	}

	public void removeFirstNote(final String certainString) {
		int noteNumber = 0;
        boolean removed = false;

        for (String note : notes){

            if(note.contains(certainString) && !removed){
                notes.remove(noteNumber);
                removed = true;

            } else {

                noteNumber++;
            }
        } 
	}

	public void addNotes(final String... notes) {
		this.notes.addAll(Arrays.asList(notes));
	}

	public Boolean containsNote(final String note) {
		return this.notes.contains(note);
	}

}
