package jdbc;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import studentmvc.Customer;

@Component
public class EmployeeValidation implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		return Employee.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		Employee employee = (Employee) obj;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "empname", "name.null");
		if(employee.getEmpcode() <= 0)
			errors.rejectValue("empcode","empcode.err");
		if(employee.getSalary() <=0)
			errors.rejectValue("salary","salary.err");
		
	}
}
