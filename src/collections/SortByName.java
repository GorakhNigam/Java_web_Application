package collections;

import java.util.Comparator;

public class SortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee arg0, Employee arg1) {
		// TODO Auto-generated method stub.
		int diff = arg0.getName().compareTo(arg1.getName());
		return diff;
	}
}