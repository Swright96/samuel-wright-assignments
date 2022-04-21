package com.codingdojo.counter.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	
	//Request Mapping to the index page
	@RequestMapping("/")
	public String index(HttpSession session, Model model) {
		if (session.getAttribute("visits") == null) {
			session.setAttribute("visits", 0);
		}
		else {				//visitCount is taking the Integer value of visits
			Integer visitCount = (Integer) session.getAttribute("visits");
			visitCount++;		//adding one to visitCount
			session.setAttribute("visits", visitCount);		//setting the value of visits == visitCount
		}
		return "index.jsp";
	}
	@RequestMapping("/counter")
	public String showCount(HttpSession session, Model model) {
		Integer visitCount = (Integer) session.getAttribute("visits");
		model.addAttribute("visits", visitCount);
		return "counter.jsp";
	}
	
}
