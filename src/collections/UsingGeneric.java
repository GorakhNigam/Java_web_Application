package collections;

import java.util.ArrayList;

public class UsingGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> items = new ArrayList<>();
		items.add("Hi");
		items.add("All");
		for(String s : items) {
			System.out.println(s);
		}
	}

}
