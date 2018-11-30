package com.cart.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greetings", "Welcome to spring web mvc application");
		return mv;
	}
	
	/*@RequestMapping(value = "test")
	public ModelAndView index(@RequestParam("greetings") String greetings) {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greetings", greetings);
		return mv;
	}*/
	
	@RequestMapping(value = "/test/{greetings}")
	public ModelAndView index(@PathVariable("greetings") String greetings) {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greetings", greetings);
		return mv;
	}
}
