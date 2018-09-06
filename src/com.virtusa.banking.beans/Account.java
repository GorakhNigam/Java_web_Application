package banking;

public class Account {
	private int accountNo;
	private String cutomerName;
	private double balance;
	private String dateOpened;
	public Account() {
	}
	public Account(int accountNo, String cutomerName, double balance, String dateOpened) {
		this.accountNo = accountNo;
		this.cutomerName = cutomerName;
		this.balance = balance;
		this.dateOpened = dateOpened;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getCutomerName() {
		return cutomerName;
	}
	public void setCutomerName(String cutomerName) {
		this.cutomerName = cutomerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getDateOpened() {
		return dateOpened;
	}
	public void setDateOpened(String dateOpened) {
		this.dateOpened = dateOpened;
	}
	
}
