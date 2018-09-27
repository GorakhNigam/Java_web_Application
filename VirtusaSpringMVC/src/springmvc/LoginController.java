package springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@Autowired
	ModelAndView mav;
	@RequestMapping(value="/loginpage", method=RequestMethod.GET)
	public String showPage() {
		return "Login";
	}
	
	@RequestMapping(value="/loginpage", method=RequestMethod.POST)
	public ModelAndView checkDetails(@ModelAttribute("login") Login login) {
		if(login.getUsername().equals("admin")) {
			mav.addObject("username",login.getUsername());
			mav.setViewName("Welcome");
		}
		else {
			String msg = "Invalid Username";
			mav.addObject("message",msg);
			mav.setViewName("Failure");
		}
		return mav;
	}
}
