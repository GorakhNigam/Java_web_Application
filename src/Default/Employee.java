
public class Employee {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int code = Integer.parseInt(args[0]);
		String name = args[1];
		int salary = Integer.parseInt(args[2]);
		Account employee = new Account(code, name, salary);
		
		/*employee.setCode(1234); 
		employee.setName("Gorakh");
		employee.setSalary(50000);*/
		System.out.print(employee.getCode());
	}

}
