
public abstract class Shape {
	protected int length;
	protected int breadth;
	protected int radius;
	
	public Shape(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public Shape(int radius) {
		this.radius = radius;
	}

	abstract void FindArea();
}
