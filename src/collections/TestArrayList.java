package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList items = new ArrayList();
		items.add(576);
		items.add("hyd");
		System.out.println(items.add(576));
		System.out.println(items);
		
		Iterator itr = items.iterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			if(obj instanceof Integer)
			System.out.println(obj);
		}
		//items.remove("hyd");
		System.out.println(items.remove("hyd"));
		items.remove(new Integer(576));
		
	}

}
