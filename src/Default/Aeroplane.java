
public class Aeroplane implements Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle samp = new Aeroplane();
		samp.engines();
		samp.wheels();
	}
	public void engines() {
		System.out.println("2 Engines");
	}
	public void wheels() {
		System.out.println("3 Wheels");
	}

}
