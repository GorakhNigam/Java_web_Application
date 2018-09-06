package threads;

import java.util.Scanner;

public class Reservation implements Runnable{

	static int availble = 10;
	public synchronized void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		
		Scanner sc = new Scanner(System.in);
		//int required = sc.nextInt();
		if(availble >= 0) {
			System.out.println("Available Birth = "+availble);
			int required = sc.nextInt();
			availble -= required;
			System.out.println("Birth alloted to you = "+required);
			
		}

	}

}
