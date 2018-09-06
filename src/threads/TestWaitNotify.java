package threads;

public class TestWaitNotify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transactions trans = new Transactions();
		new Thread() {
			public void run() {
				trans.withdraw(7000);
			}
		}.start();
		new Thread() {
			public void run() {
				trans.deposite(5000);
			}
		}.start();
	}

}
