package com.codingdojo.hellohuman.samuel;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanName {
	@RequestMapping("/")
	public String index(@RequestParam(value="q", required=false)String inputName) {
		if (inputName == null) {
			return "Hello, Human!";
		}
		else {
			return "Greetings, " + inputName;
		}
		
	}
}
