package studentmvc;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class CustomerValidation implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return Customer.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		Customer customer = (Customer) obj;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "custname", "name.null");
		if(customer.getCustcode() <= 0)
			errors.rejectValue("custcode","code.err");
		if(customer.getCommission() <= 0)
			errors.rejectValue("commission","comm.err");
	}

}
