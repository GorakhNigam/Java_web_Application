
public class FindVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = 	"CheckingVowelandConsonents" ;
		for(int i = 0; i<s.length(); i++) {
			
			String p = s.toLowerCase();
			char c = p.charAt(i);
			switch(c) {
			case 'a':
			case 'i':
			case 'o':
			case 'u':
			case 'e':
				System.out.println(c+" is Vowel"); break;
				default :
					System.out.println(c+" is Consonant");
			}
		}
	}

}
