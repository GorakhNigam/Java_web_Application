package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> data = new HashMap<>();
		data.put("Virtusa",12345);
		data.put("hyd",6789);
		data.put("java", 4567);
		//data.put("hyd",6700);
		data.put("ts", 6789);
		System.out.println(data);
		Set set = data.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
