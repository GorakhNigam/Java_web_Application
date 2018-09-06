package hello;

import java.util.Scanner;

class EmployeeNotFoundException extends Exception {

public EmployeeNotFoundException() {
		super("employee not available");
		// TODO Auto-generated constructor stub
	}
}


public class UserExceptions {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int code = 12344;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code");
		int c = sc.nextInt();
		try {
			if(c!=code)
				throw new EmployeeNotFoundException();
			System.out.println("Welcome to Virtusa");
		}
		catch (EmployeeNotFoundException e){
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
