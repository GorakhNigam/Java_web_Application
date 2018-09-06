
public class Rectangle extends Shape {
	

	public Rectangle(int length, int breadth) {
		super(length, breadth);
		// TODO Auto-generated constructor stub
		this.length = length;
		this.breadth = breadth;
	}
	void FindArea() {
		System.out.println(length*breadth);
	}
	public static void main(String[] args) {
		Rectangle samp = new Rectangle(2,4);
		samp.FindArea();
	}
}
