package hello;

import java.util.Scanner;


public class AccountAppln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountOperations appln = new AccountOperations();
		Scanner sc = new Scanner(System.in);
	System.out.println("Please enter d- for deposit / w- for withdraw /b- for balance check/ x for exit");
			String code = sc.next();
			
		while(!code.equals("x"))
		{
			//Scanner sc1 =new Scanner(System.in);
			if(code.equals("c"))
			{
				System.out.println("Input Accountholder name");
				String name= sc.next();
				System.out.println("Input Account Balance");
				int balance = sc.nextInt();
				int x = appln.createAccount(name, balance);
				System.out.println(x);
				
			}
			else if(code.equals("l"))
			{
				appln.displayAccounts();
			}
			else
			{
			System.out.println("Input Account Number");
			int accno = sc.nextInt();
			
			if(code.equals("b")) {
			appln.balanceCheck(accno);}
			else
			{
				
			switch(code)
			{
			case "d":
				System.out.println("Input Deposit amount");
				double amount =sc.nextDouble();
				appln.deposit(accno, amount);break;
			case "w":
				System.out.println("Input Withdraw amount");
				double amount1 =sc.nextDouble();
				appln.withdraw(accno, amount1);break;
				default:
					System.out.println("Please enter d- for deposit / w- for withdraw /b- for balance check/ x for exit");
			}
		}
			
	}
			System.out.println("Please enter d- for deposit / w- for withdraw /b- for balance check/ x for exit");
			code = sc.next();
			}

}

	

}