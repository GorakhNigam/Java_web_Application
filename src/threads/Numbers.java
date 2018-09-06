package threads;

public class Numbers implements Runnable {
public void run() {
	System.out.println(Thread.currentThread().getName());
	for(int i = 0; i<=10; i++) {
		System.out.print(i+" ");
	
	try {
		Thread.sleep(2000);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	}
}
}
