
public class StringBufferPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("Hyderabna");
		System.out.println(sb);
		sb.append("veirteghl");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.delete(5,8));
		String s1= "hyd";
		StringBuffer sb2 = new StringBuffer(s1);
		String str = sb.toString();
		System.out.println(str+" "+sb);
		
	}

}
