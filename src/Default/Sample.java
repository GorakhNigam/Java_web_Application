
public abstract class Sample {
	int x;
	public Sample() {
		x = 50;
	}
	void method1() {
		System.out.println("concrete method");
	}
	abstract void display();
}
