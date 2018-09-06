package IOStream;

import java.io.Serializable;

public class Customer implements Serializable{
	 private static final long serialVersionUID = 1L;
	 private int code;
	 private String name;
	 private double commn;
	public Customer(int code, String name, double commn) {
		this.code = code;
		this.name = name;
		this.commn = commn;
	}
	public Customer() {
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCommn() {
		return commn;
	}
	public void setCommn(double commn) {
		this.commn = commn;
	}
	 
	 
}
