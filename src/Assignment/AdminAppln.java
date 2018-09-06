package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminAppln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookOperations oper = new BookOperations();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<1; i++) {
			int bookId = sc.nextInt();
			String title = sc.next();
			int edition = sc.nextInt();
			String author = sc.next();
			String publisher = sc.next();
			int publishedYear = sc.nextInt();
			String description = sc.next();
			int quantity = sc.nextInt();
			int cost = sc.nextInt();
			
			oper.addBook(bookId, title, edition, author, publisher, publishedYear, description,quantity, cost);
		}
		String input = sc.next();
		if(input.equals("add")) {
							
				int bookId = sc.nextInt();
				String title = sc.next();
				int edition = sc.nextInt();
				String author = sc.next();
				String publisher = sc.next();
				int publishedYear = sc.nextInt();
				String description = sc.next();
				int quantity = sc.nextInt();
				int cost = sc.nextInt();
						
				oper.addBook(bookId, title, edition, author, publisher, publishedYear, description,quantity, cost);
				

		}
		else if(input.equals("update")) {
			int bookId = sc.nextInt();
			int edition = sc.nextInt();
			oper.updateStock(bookId, edition);
		}
		else if(input.equals("delete")) {
			int bookId = sc.nextInt();
			oper.deleteBook(bookId);
		}
	}

}
