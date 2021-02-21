package in.edac;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/my-jsp")
public class MyJspAction{
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/")
	public String firstJsp() {
		
		return "first";
	}
	
	@GetMapping("/second")
	public ModelAndView secondJsp() {
		ModelAndView mv = new ModelAndView("second");
		
		
		
		return mv;
	}

	@GetMapping("/register")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView("register");
		return mv;
	}
}
  