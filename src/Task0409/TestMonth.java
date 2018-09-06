package Task0409;

import java.util.Scanner;

public class TestMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String mon = sc.next();
		Months month = Months.valueOf(mon.toLowerCase());
		switch(month) {
		case jan:
			System.out.println("Jan:31 days");
			break;
		case feb:
			System.out.println("Feb:28 days");
			break;
		case mar:
			System.out.println("March:31 days");
			break;
		case apr:
			System.out.println("April:30 days");
			break;
		case may:
			System.out.println("May:31 days");
			break;
		case june:
			System.out.println("June:30 days");
			break;
		case july:
			System.out.println("July:31 days");
			break;
		case aug:
			System.out.println("August:31 days");
			break;
		case sept:
			System.out.println("September:30 days");
			break;
		case oct:
			System.out.println("October:31 days");
			break;
		case nov:
			System.out.println("November:30 days");
			break;
		case dec:
			System.out.println("December:28 days");
			break;
			default:
				System.out.println("Invalid month");
		}
	}

}
