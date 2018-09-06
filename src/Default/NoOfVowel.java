
public class NoOfVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = args[0];
		String p = s.toLowerCase();
		int count = 0;
		for(int i = 0; i<s.length(); i++) {
			if(p.charAt(i) == 'a' || p.charAt(i) == 'e' || p.charAt(i) == 'i' || p.charAt(i) == 'o' || p.charAt(i) == 'u')
				count++;
		}
		System.out.println(count);
	}

}
