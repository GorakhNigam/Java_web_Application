package hello;

public class AccountNotFoundException extends Exception {
	
  public AccountNotFoundException() {
	  super("Account pertaining to the input account number is not found");
  }

}