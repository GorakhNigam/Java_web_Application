package Assignment;

import java.util.Scanner;

public class BuyerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookOperations oper = new BookOperations();
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		if(input == "searchAuther") {
			String author = sc.next();
			oper.searchByAuther(author);
		}
		else if(input == "searchTitle") {
			String title = sc.next();
			oper.searchByAuther(title);
		}
		else if(input == "searchPublisher") {
			String publisher = sc.next();
			oper.searchByAuther(publisher);
		}

	}

}
