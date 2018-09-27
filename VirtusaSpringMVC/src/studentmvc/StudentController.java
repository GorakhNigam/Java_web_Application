package studentmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc.Login;

@Controller
public class StudentController {
	@Autowired
	ModelAndView mav;
	
	@RequestMapping(value="/student", method=RequestMethod.GET)
	public String showPage() {
		return "Student";
	}
	
	@RequestMapping(value="/student", method=RequestMethod.POST)
	public ModelAndView validate(@ModelAttribute("student") Student student) {
		String msg = "welcome Student";
		mav.addObject("message",msg);
		mav.addObject("student",student);
		
		mav.setViewName("Welcome");
		return mav;
	}
	
}
