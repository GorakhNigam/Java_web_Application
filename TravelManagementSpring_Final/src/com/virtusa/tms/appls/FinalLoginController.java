package com.virtusa.tms.appls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.tms.beans.Employee;
import com.virtusa.tms.beans.EmployeeLogin;
import com.virtusa.tms.dao.AdminLoginSpringDao;
import com.virtusa.tms.dao.EmployeeLoginSpringDao;
import com.virtusa.tms.dao.EmployeeSpringDao;
import com.virtusa.tms.dao.LogisticLoginSpringDao;

@Controller
public class FinalLoginController {
//	@Autowired
//	EmployeeValidation validate;
	@Autowired
	AdminLoginSpringDao daoAdminLogin;
	@Autowired
	EmployeeLoginSpringDao daoEmpLogin;
	@Autowired
	EmployeeSpringDao daoEmp;
	@Autowired
	LogisticLoginSpringDao daoLogLogin;
	@Autowired
	EmployeeLogin employeeLogin;
	@Autowired
	Employee employee;
	@Autowired
	ModelAndView mav;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView showHomeForm() {
		mav.addObject(employeeLogin);
		mav.setViewName("FinalLogin");
		return mav;
	}
	
	/*@RequestMapping(value="/loginvalidate",method=RequestMethod.GET)
	public ModelAndView showLoginForm() {
		mav = new ModelAndView();
		//daoEmpLogin.getPass(username)
		mav.addObject(employeeLogin);
		mav.setViewName("EmpPage");
		return mav;
	}*/
	
	@RequestMapping(value="/loginvalidate",method=RequestMethod.GET)
	public ModelAndView showCustomerForm(@ModelAttribute("employeeLogin") EmployeeLogin emplLogin) {
		mav = new ModelAndView();
		EmployeeLogin empLogin = daoEmpLogin.getPass(emplLogin);
		if(emplLogin.getPassword().equals(empLogin.getPassword()) && empLogin.getRole().equals("Employee")) {
			mav.addObject("employeeLogin",emplLogin);
			mav.setViewName("EmpPage");
		}
		if(emplLogin.getPassword().equals(empLogin.getPassword()) && empLogin.getRole().equals("Admin")) {
			List<Employee> empList = daoAdminLogin.getAllEmpls();
			mav.addObject("empls",empList);
			mav.setViewName("AdminView");
		}
		if(emplLogin.getPassword().equals(empLogin.getPassword()) && empLogin.getRole().equals("Logistic")) {
			List<Employee> empListLog = daoLogLogin.getAllEmpls();
			mav.addObject("empls",empListLog);
			mav.setViewName("LogisticView");
		}
		return mav;
	}
	
	/*@RequestMapping(value="/viewemployee",method=RequestMethod.GET)
	public ModelAndView viewEmployee(){
		mav = new ModelAndView();
		mav.setViewName("EmpPage");
		//mav.addObject("empls",empList);
		//mav.setViewName("AdminView");
		return mav;
	}*/
	
	@RequestMapping(value="/addempl",method=RequestMethod.GET)
	public ModelAndView showaddEmplForm() {
		mav.addObject(employee);
		mav.setViewName("Employee");
		return mav;
	}
	
	@RequestMapping(value="/addempl",method=RequestMethod.POST)
	public ModelAndView addEmployee(@ModelAttribute("employee") Employee empl, BindingResult result) {
		mav = new ModelAndView();
		//employee.setEmpcode(empl.getEmpcode());
		//validate.validate(empl, result);
//		if(result.hasErrors()) {
//			mav.setViewName("AddEmployee");			
//		}
		//else {
			mav.addObject("employee",empl);			
			int row = daoEmp.addEmployee(empl);
			mav.setViewName("redirect:addempl");
		//}
		return mav;
	}
	@RequestMapping(value="/viewprevplan",method=RequestMethod.GET)
	public ModelAndView showEmpls(String username/*@ModelAttribute("employee") Employee empl, BindingResult result*/) {
		mav = new ModelAndView();
		//employee.setEmpcode(empl.getEmpcode());
		/*validate.validate(empl, result);
		if(result.hasErrors()) {
			mav.setViewName("ViewEmployees");			
		}
		else {	*/	
			//System.out.println(username);
			List<Employee> empList = daoEmp.getAllEmpls(username);
			mav.addObject("empls",empList);
			mav.setViewName("ViewPrevPlan");
	//}
		return mav;
	}
	
	@RequestMapping(value="/updateempl",method=RequestMethod.GET)
	public ModelAndView getEmpls(String username/*@ModelAttribute("employee") Employee empl, BindingResult result*/) {
		mav = new ModelAndView();
		//employee.setEmpcode(empl.getEmpcode());
		/*validate.validate(empl, result);
		if(result.hasErrors()) {
			mav.setViewName("ViewEmployees");			
		}
		else {	*/		
			List<Employee> empls = daoEmp.getAllEmpls(username);
			Employee lastemp = new Employee();
			for(Employee emp : empls) {
				lastemp = emp;
			}
			mav.addObject("empls",lastemp);
			mav.setViewName("Update");
	//}
		return mav;
	}
	
	@RequestMapping(value="/updateempl",method=RequestMethod.POST)
	public ModelAndView updateEmpls(@ModelAttribute("employee") Employee empl, BindingResult result) {
		mav = new ModelAndView();
		//employee.setEmpcode(empl.getEmpcode());
//		validate.validate(empl, result);
//		if(result.hasErrors()) {
//			mav.setViewName("AddEmployee");			
//		}
//		else {			
			daoEmp.updateAll(empl);
			//mav.addObject("empList",empList);
			mav.setViewName("redirect:updateempl");
		//}
		return mav;
	}
	
	@RequestMapping(value="/viewadmin",method=RequestMethod.GET)
	public ModelAndView viewAdmin(){
		mav = new ModelAndView();
		List<Employee> empList = daoAdminLogin.getAllEmpls();
		mav.addObject("empls",empList);
		mav.setViewName("AdminView");
		return mav;
	}
	
	@RequestMapping(value="/admin",method=RequestMethod.POST)
	public ModelAndView updateStatus(@RequestParam("serialNo") int code,@RequestParam("status") String status/*@ModelAttribute("employee") Employee empl, BindingResult result*/) {
		mav = new ModelAndView();
		//employee.setEmpcode(empl.getEmpcode());
		/*validate.validate(empl, result);
		if(result.hasErrors()) {
			mav.setViewName("ViewEmployees");			
		}
		else {	*/		
			daoAdminLogin.updateStatus(status,code);
			//mav.addObject("empls",emp);
			mav.setViewName("redirect:viewadmin");
	//}
		return mav;
	}
	
	@RequestMapping(value="/viewlogistic",method=RequestMethod.GET)
	public ModelAndView viewLogistic(){
		mav = new ModelAndView();
		List<Employee> empListLog = daoLogLogin.getAllEmpls();
		mav.addObject("empls",empListLog);
		mav.setViewName("LogisticView");
		return mav;
	}
	
	@RequestMapping(value="/logistic",method=RequestMethod.POST)
	public ModelAndView updateExpense(@RequestParam("serialNo") int code, @RequestParam("travelExpense") double expense/*@ModelAttribute("employee") Employee empl, BindingResult result*/) {
		mav = new ModelAndView();
		//employee.setEmpcode(empl.getEmpcode());
		/*validate.validate(empl, result);
		if(result.hasErrors()) {
			mav.setViewName("ViewEmployees");			
		}
		else {	*/		
			daoLogLogin.updateExpense(expense,code);
			//mav.addObject("empls",emp);
			mav.setViewName("redirect:viewlogistic");
	//}
		return mav;
	}
}
