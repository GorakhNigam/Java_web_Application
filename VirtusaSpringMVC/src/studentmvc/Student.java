package studentmvc;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String stdname;
	private int stdroll;
	private int stdtotal;
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public int getStdroll() {
		return stdroll;
	}
	public void setStdroll(int stdroll) {
		this.stdroll = stdroll;
	}
	public int getStdtotal() {
		return stdtotal;
	}
	public void setStdtotal(int stdtotal) {
		this.stdtotal = stdtotal;
	}
	
}
