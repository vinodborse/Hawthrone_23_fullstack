package com.ts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Zakas {

	@GetMapping("/chai")
	public ModelAndView color() {
		System.out.println("EKDUM KADAK..!!!!");
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("data", "EKDUM KADAK..!!!!");
		mv.setViewName("index.jsp");
		return mv;
	}
}
