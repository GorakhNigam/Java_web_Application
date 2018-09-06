
public class Account {
	int code;
	String name;
	int salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Account() {}
	public Account(int code, String name, int salary) {
		this.code = code;
		this.name = name;
		this.salary = salary;
	}
	
}
