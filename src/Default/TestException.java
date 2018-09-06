
public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4;
		int y = 0; 
		int a[] = {1,2,2,3,4};
		try {
			int r = x/y;
			System.out.println("Result"+r);
			System.out.println("element"+a[3]);
		}
		catch(ArithmeticException e) {
			System.out.println("division cant be performed");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("value not available");
		}
		System.out.println("success");
	}

}
