package jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao extends JdbcDaoSupport{
	@Autowired
	Employee emp;
	@Autowired
	EmployeePSS pss;
	@Autowired
	public EmployeeDao(DriverManagerDataSource dataSource) {
		setDataSource(dataSource);
	}
	public void addEmployee() {
		String sql = "insert into employee values(empl.getEmpcode(),empl.getEmpname(),empl.getSalary(),empl.getJob(),empl.getDoj())";
		getJdbcTemplate().execute(sql);
	}
	public int insert(Employee empl) {
		Object args[] = {empl.getEmpcode(), empl.getEmpname(),empl.getJob(),empl.getSalary(),empl.getDoj()};
		int row = getJdbcTemplate().update(EmplDBQueries.addempl,args);
		return row;
	}
	public int delete(int code) {
		Object args[] = {code};
		int row = getJdbcTemplate().update(EmplDBQueries.delEmp,args);
		return row;
	}
	public int update() {
		Object args[] = {emp.getSalary(),emp.getEmpcode()};
		int row = getJdbcTemplate().update(EmplDBQueries.getUpdate,pss);
		return row;
	}
	public List <Employee> getEmpls(){
		List<Employee> empList = getJdbcTemplate().query(EmplDBQueries.getAllEmpls,
		new BeanPropertyRowMapper<Employee>(Employee.class));
		return empList;
	}
	
	public int updateEmpls(Employee empl) {
		Object args[] = {empl.getEmpname(),empl.getJob(),empl.getSalary(),empl.getEmpcode()};
		int row = getJdbcTemplate().update(EmplDBQueries.getUpdate,args);
		return row;
	}
	
	public Employee getEmp(int code) {
		Object args[] = {code};
		Employee emp = getJdbcTemplate().queryForObject(EmplDBQueries.getEmpl,args,new BeanPropertyRowMapper<Employee>(Employee.class));
		return emp;
	}
}

