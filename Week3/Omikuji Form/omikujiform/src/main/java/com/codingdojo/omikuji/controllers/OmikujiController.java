package com.codingdojo.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiController {
	@RequestMapping("/omikuji")
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping("/process")
	public String process( 
		@RequestParam(value="number") Integer number,
		@RequestParam(value="cityName") String cityName,
		@RequestParam(value="personName") String personName,
		@RequestParam(value="endeavor") String endeavor,
		@RequestParam(value="livingThing") String livingThing,
		@RequestParam(value="somethingNice")String somethingNice,
		HttpSession session) {
		
		String omikujiSentence = String.format("In %s years you will be living in %s with %s pursuing %s and making great money off of it, "
				+ "living alongside your trusty %s companion, who says to you '%s'.", number, cityName, personName, endeavor, livingThing, somethingNice);
		session.setAttribute("omikujiSentence", omikujiSentence);
		
		return "redirect:/omikuji/show";
	}
	
	@RequestMapping("/omikuji/show")
	public String omikuji(HttpSession session, Model model) {
		String omikuji = (String) session.getAttribute("omikujiSentence");
		model.addAttribute("omikuji", omikuji);
		return "omikuji.jsp";
	}
}
