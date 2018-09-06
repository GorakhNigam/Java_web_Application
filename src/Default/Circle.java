
public class Circle extends Shape {

	public Circle(int radius) {
		super(radius);
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}
	void FindArea() {
		System.out.println(3.14*radius*radius);
	}
	public static void main(String[] args) {
		Circle samp = new Circle(5);
		samp.FindArea();
	}
}
