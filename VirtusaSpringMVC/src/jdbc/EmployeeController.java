package jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeValidation validate;
	@Autowired
	EmployeeDao dao;
	@Autowired
	Employee employee;
	@Autowired
	ModelAndView mav;
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public ModelAndView showHomeForm() {
		
		mav.setViewName("HomePage");
		return mav;
	}
	
	@RequestMapping(value="/addempl",method=RequestMethod.GET)
	public ModelAndView showCustomerForm() {
		mav = new ModelAndView();
		mav.addObject(employee);
		mav.setViewName("AddEmployee");
		return mav;
	}
	@RequestMapping(value="/addempl",method=RequestMethod.POST)
	public ModelAndView addEmployee(@ModelAttribute("employee") Employee empl, BindingResult result) {
		mav = new ModelAndView();
		//employee.setEmpcode(empl.getEmpcode());
		validate.validate(empl, result);
		if(result.hasErrors()) {
			mav.setViewName("AddEmployee");			
		}
		else {
			mav.addObject("employee",empl);			
			dao.insert(empl);
			mav.setViewName("Welcome");
		}
		return mav;
	}
	@RequestMapping(value="/viewempl",method=RequestMethod.GET)
	public ModelAndView showEmpls(@ModelAttribute("employee") Employee empl/*, BindingResult result*/) {
		mav = new ModelAndView();
		//employee.setEmpcode(empl.getEmpcode());
		/*validate.validate(empl, result);
		if(result.hasErrors()) {
			mav.setViewName("ViewEmployees");			
		}
		else {	*/		
			List<Employee> empList = dao.getEmpls();
			mav.addObject("empList",empList);
			mav.setViewName("ViewEmployees");
	//}
		return mav;
	}
	
	@RequestMapping(value="/updateempl",method=RequestMethod.GET)
	public ModelAndView getEmpls(int code/*@ModelAttribute("employee") Employee empl, BindingResult result*/) {
		mav = new ModelAndView();
		//employee.setEmpcode(empl.getEmpcode());
		/*validate.validate(empl, result);
		if(result.hasErrors()) {
			mav.setViewName("ViewEmployees");			
		}
		else {	*/		
			Employee emp = dao.getEmp(code);
			mav.addObject("empls",emp);
			mav.setViewName("UpdateEmpl");
	//}
		return mav;
	}
	
	@RequestMapping(value="/updateempl",method=RequestMethod.POST)
	public ModelAndView updateEmpls(@ModelAttribute("employee") Employee empl, BindingResult result) {
		mav = new ModelAndView();
		//employee.setEmpcode(empl.getEmpcode());
		validate.validate(empl, result);
		if(result.hasErrors()) {
			mav.setViewName("AddEmployee");			
		}
		else {			
			dao.updateEmpls(empl);
			//mav.addObject("empList",empList);
			mav.setViewName("redirect:viewempl");
		}
		return mav;
	}
	@RequestMapping(value="/deleteempl",method=RequestMethod.GET)
	public ModelAndView deleteEmpls(int code/*@ModelAttribute("employee") Employee empl, BindingResult result*/) {
		mav = new ModelAndView();
		//employee.setEmpcode(empl.getEmpcode());
		/*validate.validate(empl, result);
		if(result.hasErrors()) {
			mav.setViewName("ViewEmployees");			
		}
		else {	*/		
			dao.delete(code);
			//mav.addObject("empls",emp);
			mav.setViewName("redirect:viewempl");
	//}
		return mav;
	}
}
