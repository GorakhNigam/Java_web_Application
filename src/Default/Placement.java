
public class Placement extends ExamDetail{

	private int drive;
	private int selected;
	
	
	
	public Placement(int regno, String studentName, String group, int sub1, int sub2, int sub3, int drive,
			int selected) {
		super(regno, studentName, group, sub1, sub2, sub3);
		this.drive = drive;
		this.selected = selected;
	}


	public void Disp() {
		String Res;
		if(average < 40)
			Res = "pass";
		else
			Res = "fail";
		System.out.println(drive+"\n"+selected);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Placement lib = new Placement(123," gorakh"," virtusa",40,40,50,1,1);
		lib.Disp();
	}

}
