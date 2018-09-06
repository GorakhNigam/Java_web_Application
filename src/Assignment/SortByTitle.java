package Assignment;

import java.util.Comparator;

public class SortByTitle implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		int diff = o1.getTitle().compareTo(o2.getTitle());
		return diff;
	}

}
