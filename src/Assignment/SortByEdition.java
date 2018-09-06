package Assignment;

import java.util.Comparator;

public class SortByEdition implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		int diff = o1.getAuthor().compareTo(o2.getAuthor());
		return diff;
	}

}
