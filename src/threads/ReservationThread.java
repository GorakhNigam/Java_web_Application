package threads;

public class ReservationThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reservation res = new Reservation();
		Thread t1 = new Thread(res);
		t1.start();
		Thread t2 = new Thread(res);
		t2.start();
		Thread t3 = new Thread(res);
		t3.start();
//		t1.setName("Welcome A");
//		t2.setName("Welcome B");
//		t3.setName("Welcome C");
		
		
		
	}

}
