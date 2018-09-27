package studentmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	@Autowired
	CustomerValidation validate;
	@Autowired
	Customer customer;
	//@Autowired
	ModelAndView mav;
	@RequestMapping(value="/addcustomer",method=RequestMethod.GET)
	public ModelAndView showCustomerForm() {
		mav = new ModelAndView();
		mav.addObject(customer);
		mav.setViewName("AddCustomer");
		return mav;
	}
	@RequestMapping(value="/addcustomer",method=RequestMethod.POST)
	public ModelAndView addCustomer(@ModelAttribute("customer") Customer cust, BindingResult result) {
		mav = new ModelAndView();
		validate.validate(cust, result);
		if(result.hasErrors()) {
			mav.setViewName("AddCustomer");
			
		}
		else {
			mav.addObject("customer",cust);
			mav.setViewName("Welcome");
		}
		return mav;
	}
}
