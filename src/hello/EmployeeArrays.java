package hello;

public class EmployeeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empls[] = new Employee[2];
		empls[0] = new Employee(11, "aaa");
		empls[1] = new Employee(13,"abcd");
		for(int i = 0; i<empls.length; i++)
			if(empls[i].getCode() == 130)
				System.out.println("Something");
	}

}
