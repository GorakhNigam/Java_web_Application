
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = args[0];
		StringBuffer sb = new StringBuffer(s);
		if((sb.reverse()).equals(s))
			System.out.println("Palindrome");
		else
			System.out.println("nonPalindrome");
	}

}
