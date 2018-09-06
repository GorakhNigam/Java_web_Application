package collections;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empList = new ArrayList<>();
		Employee emp1 = new Employee(101, "Virtusa");
		Employee emp2 = new Employee(202,"Hyd");
		empList.add(emp1);
		empList.add(emp2);
		Collections.sort(empList, new SortByName());
		for(Employee emp : empList)
			System.out.println(emp.getCode()+" "+emp.getName());

	}

}
