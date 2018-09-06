
public class Student {
	protected int regno;
	protected String studentName;
	protected String group;
public Student() {
	// TODO Auto-generated constructor stub
}
//	public Student() {
//		
//		regno = 8049783;
//		studentName = "Gorakh";
//		group = "xLabs";
//	}
	
	public void Display() {
		System.out.println(regno+" "+studentName+" "+group);
	}
	public Student(int regno, String studentName, String group) {
	this.regno = regno;
	this.studentName = studentName;
	this.group = group;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lib = new Student();
		lib.Display();
	}

}
