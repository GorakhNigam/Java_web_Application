
public class wordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = args[0];
		
		int count = 1;
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i) == ' ')
				count++;
		}
		System.out.println(count);
	}

}
