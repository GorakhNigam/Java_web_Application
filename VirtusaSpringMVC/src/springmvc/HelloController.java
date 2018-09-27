package springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@Autowired
	ModelAndView mav;
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome";
	}
	
	@RequestMapping("/loginvalidate")
	public ModelAndView validate(@RequestParam("username") String user, @RequestParam("password") String pass) {
		String msg = "welcome to virtusa";
		mav.addObject("message",msg);
		mav.addObject("username",user);
		mav.setViewName("Welcome");
		return mav;
	}
	
	@RequestMapping("/loginvalidate")
	public String loginValidate(@RequestParam("username") String user, @RequestParam("password") String pass) {
		if(user.equals("admin") && pass.equals("admin"))
			return "Welcome";
		else
			return "Failure";
	}
	@RequestMapping("/login")
	public String showLoginPage() {
		return "Login";
	}
}
