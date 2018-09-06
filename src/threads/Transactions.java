package threads;

public class Transactions {

	int balance = 5000;
	synchronized void withdraw(int amt) {
		System.out.println("Available balance = "+this.balance);
		System.out.println("Request Amout ..."+amt);
		System.out.println("Trying to withdraw...");
		if(this.balance < amt) {
			System.out.println("Less balance; waiting for deposite...");
			try {
				wait();
				Thread.sleep(8000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.balance -= amt;
		System.out.println("Withdraw completed...bal;ance is : "+this.balance);
	}
	
	synchronized void deposite(int amt) {
		System.out.println("trying to depositre ..");
		this.balance +=amt;
		try {
			Thread.sleep(2000);
			
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Deposite completed ...balance is : "+ this.balance);
		notify();
	}
	

}
