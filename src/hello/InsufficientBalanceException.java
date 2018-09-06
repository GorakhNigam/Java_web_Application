package hello;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException() {
		  super("Account pertaining to the input account number is not found");
	  }

}
