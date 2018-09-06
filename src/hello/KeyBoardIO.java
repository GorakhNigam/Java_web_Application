package hello;

import java.util.Scanner;

public class KeyBoardIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input");
		int code = sc.nextInt();
		String name = sc.next();
		double sal = sc.nextDouble();
		System.out.println(code+" "+name+" "+sal);
	}

}
