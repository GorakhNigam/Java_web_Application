package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class BookOperations {
	ArrayList<Book> bk = new ArrayList<>();
	
	public void addBook(int bookId, String title, int edition, String author, String publisher, int publishedYear,
			String description, int quantity, int cost) {
		
		Book bk1 = new Book(bookId, title, edition, author, publisher, publishedYear, description,quantity, cost);
		bk.add(bk1);
	}
	
	public void updateStock(int bookId, int edition) {
		for(Book b : bk) {
			if(b.getBookId() == bookId) {
				b.setEdition(edition);
				System.out.println(b.getBookId()+" "+b.getEdition());
			}
		}
		
	}
	
	public void deleteBook(int bookId) {
		for(Book b : bk) {
			if(b.getBookId() == bookId) {
				bk.remove(bookId);
			}
		}
	}
	
	public void searchByAuther(String author) {
		Collections.sort(bk,  new SortByEdition());
		for(Book b : bk) {
			if(b.getAuthor() == author) {
				System.out.println(b.getBookId()+" "+b.getDescription());
			}
		}
	}
	
	public void searchByTitle(String title) {
		Collections.sort(bk, new SortByTitle());
		for(Book b : bk) {
			if(b.getAuthor() == title) {
				System.out.println(b.getBookId()+" "+b.getDescription());
			}
		}
	}
	
	public void searchByPublisher(String publisher) {
		Collections.sort(bk, new SortByPublisher());
		for(Book b : bk) {
			if(b.getAuthor() == publisher) {
				System.out.println(b.getBookId()+" "+b.getDescription());
			}
		}
	}
}
