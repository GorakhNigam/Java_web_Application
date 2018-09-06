
public class ExamDetail extends Student{

	protected int sub1;
	protected int sub2;
	protected int sub3;
	
	protected int total;
	protected int average;
	protected String Result;
	
	public void displayInfo() {
		total = sub1+sub2+sub3;
		average = total/3;
		if(sub1>=40 && sub2>=40 &&sub3>=40)
			Result = "pass";
		else
			Result = "fail";
			
		System.out.println(regno+"\n"+studentName+"\n"+group+"\n"+total+"\n"+average+"\n"+Result+"\n");
	}
	public ExamDetail(int regno, String studentName, String group, int sub1, int sub2, int sub3) {
		super(regno, studentName, group);
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamDetail lib = new ExamDetail(123, "something", "ss", 40,50,60);
		lib.displayInfo();
	}

}