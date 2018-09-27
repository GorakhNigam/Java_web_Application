package studentmvc;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	private int custcode;
	private String custname;
	private double commission;
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public int getCustcode() {
		return custcode;
	}
	public void setCustcode(int custcode) {
		this.custcode = custcode;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
}
