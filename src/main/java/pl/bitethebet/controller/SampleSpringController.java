package pl.bitethebet.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleSpringController {
	
	@RequestMapping(value="/index")
	public ModelAndView index(){
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("msg", "Hello from Spring controller");
		return mav;
	}
}
