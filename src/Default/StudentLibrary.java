
public class StudentLibrary extends Student {

	private int booksdue;
	

	public StudentLibrary(int regno, String studentName, String group, int booksdue) {
		super(regno, studentName, group);
		this.booksdue = booksdue;
	}


	public void info() {
		System.out.println(regno+studentName+group+booksdue);
	}
	
	
	public static void main(String[] args) {
		StudentLibrary lib  = new StudentLibrary(1354,"iygqehf","kawfb",5);
		lib.Display();
		lib.info();
	}

}
