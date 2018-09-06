/*package hello;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

class AccountNotFoundException extends Exception {

public AccountNotFoundException() {
		super("Account not available");
		// TODO Auto-generated constructor stub
	}
}

class BalanceLessException extends Exception {

public BalanceLessException() {
		super("Balance not adequate");
		// TODO Auto-generated constructor stub
	}
}

public class AccountOperations {
	
	//private Accounts account[] = new Accounts[10];
	private ArrayList<Accounts> account = new ArrayList<>();
	private int count = 0;
	
	public AccountOperations() {
		account.add(new Accounts(11111, "g1", 5000));
		account.add(new Accounts(22222, "g2", 4000));
		account.add(new Accounts(33333, "g3", 3000));
		count = 3;
	}
	public void deposite(int acno, int amt) {
		int flag = 0;
		try {
			for(Accounts acc: account) {
				if(acc.getAcno() == acno) {				
					acc.setBalance(acc.getBalance() + amt); 
					flag++;
				}
			}
			if(flag == 0)
				throw new AccountNotFoundException();
		}
		catch (AccountNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	public void withdraw(int acno, int amt) {
		int flag = 0;
		int k = 0;
		try {
			for(Accounts acc: account) {
			if(acc.getAcno() == acno && acc.getBalance() >= amt) {				
				acc.setBalance(acc.getBalance() - amt); 
				flag++;
				k++;
			}
		}
		if(flag == 0)
			throw new AccountNotFoundException();
		if(account[k+1].getBalance() < amt)
			throw new BalanceLessException();
	}
	catch (AccountNotFoundException e) {
		System.out.println(e.getMessage());
	}
	catch(BalanceLessException e) {
		System.out.println(e.getMessage());
	}
}
	public void balanceCheck(int acno) {
		int flag = 0;
		try {
			for(int i = 0; i<account.length; i++) {
				if(account[i].getAcno() == acno) {
					System.out.println(account[i].getAcno()+" "+account[i].getCustomerName()+" "+account[i].getBalance());
					flag++;
				}
			}
			if(flag == 0)
				throw new AccountNotFoundException();
	}
	catch (AccountNotFoundException e) {
		System.out.println(e.getMessage());
	}
}
	public int newAccount(String name, int amt) {
		account[count++] = new Accounts((int)Math.random()*1000000, name, amt);
		return account[count].getAcno();
	}
	public void listAccount() {
		for(int i = 0; i<account.length; i++) {
			System.out.println(account[i].getAcno()+" "+account[i].getCustomerName()+" "+account[i].getBalance());
		}
	}

}
*/
package hello;

import java.util.ArrayList;
import java.util.Collections;

public class AccountOperations {
		private ArrayList<Account> acc = new ArrayList<>();
		private boolean check;
		
		public AccountOperations() {
			acc.add(new Account(1,"SaiCharan",456223));
			acc.add(new Account(2,"Sonic",456223));
			acc.add(new Account(3,"SoniPrasad",125466));
			acc.add(new Account(4,"probro",5148545));
			acc.add(new Account(5,"Virtusa",487544548));
			check = false;
		}
		public void deposit(int accno,double amount)
		{
			for (Account acc : acc)
			{
				if(acc.getAccountNumber()==accno)
				{
					check =true;
					acc.setBalance(acc.getBalance()+amount);
					break;
				}
			}

			try {
				if(check==false)
				{
					throw new AccountNotFoundException();
					//System.out.println("The given account does not exist try again");
				}}
				catch(AccountNotFoundException e) {
					//e.printStackTrace();
					System.out.println(e.getMessage());
				}
			check =false;
		}
		
		public void withdraw(int accno,double amount)
		{
			for(Account acc:acc)
			{
				if(acc.getAccountNumber()==accno)
				{
					check=true;
					try {
					if(acc.getBalance()>=amount)
						acc.setBalance(acc.getBalance()-amount);
					else
					{
						throw new InsufficientBalanceException();
					}}
					catch(InsufficientBalanceException e)
					{
						System.out.println(e.getMessage());
					}
				}
			}
			try {
				if(check==false)
				{
					throw new AccountNotFoundException();
					//System.out.println("The given account does not exist try again");
				}}
				catch(AccountNotFoundException e) {
					//e.printStackTrace();
					System.out.println(e.getMessage());
				}
			check =false;
		}
		
		public void balanceCheck(int accno)
		{
	
				for(Account acc:acc)
				{
					if(acc.getAccountNumber()==accno)
					{
						System.out.println("Account Number: "+acc.getAccountNumber());
						System.out.println("Name of the customer: "+acc.getCustomerName());
						System.out.println("Account balance is: "+acc.getBalance());
						check=true;
					}
				}
			    
				try {
					if(check==false)
					{
						throw new AccountNotFoundException();
						//System.out.println("The given account does not exist try again");
					}}
					catch(AccountNotFoundException e) {
						//e.printStackTrace();
						System.out.println(e.getMessage());
					}
				check =false;
			
		}
		public int createAccount(String name,double amount)
		{
			acc.add(new Account(acc.size()+1,name,amount));
			return acc.size();
		}
		public void displayAccounts()
		{
			Collections.sort(acc, new SortByAccountNumber());
			for(Account acc:acc)
			{
				System.out.println("Account Number: "+acc.getAccountNumber());
				System.out.println("Name of the customer: "+acc.getCustomerName());
				System.out.println("Account balance is: "+acc.getBalance());
				System.out.println();
			}
		}
}
