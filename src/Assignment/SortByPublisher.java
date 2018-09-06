package Assignment;

import java.util.Comparator;

public class SortByPublisher implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		int diff = o1.getPublisher().compareTo(o2.getPublisher());
		return diff;
	}

}
