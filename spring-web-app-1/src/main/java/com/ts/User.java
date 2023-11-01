package com.ts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class User {

	@GetMapping("/we")
	public void msg() {
		System.out.println("HUM HAI DON...!!");
	}
	
	@GetMapping("/gauru")
	public ModelAndView test() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "GAURU HAI KON...!!");
		mv.setViewName("index.jsp");
		return mv;
	}
	
	@PostMapping("/hi")
	public void hello() {
		System.out.println("BYE...!!");
	}
	
	
	public int add() {
		
		return 23+7;
		
	}
	
	public String name() {
	
		return "Vinod";
		
	}

	
	public User usr() {
		User u = new User();
		return u;
		
	}
}




//@Component
//
//@Controller
//@Repository
//@Service