import java.util.*;
public class StudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int registno = 10;
		double std[];
		std = new double[3];
		int sum=0,avg=0;
		for(int i = 0; i<3; i++) {
			double ra = Math.random();
			std[i]= ra*100;     //30*(i+1);
			sum += std[i];
		}
		avg = sum/3;
		System.out.println(avg);
		if(avg >= 60){
			System.out.println("First");
		}
		else if(avg >= 50) {
			System.out.println("Second");
		}
		else {
			System.out.println("Fail");
		}
	}

}
