package com.codingdojo.daikichi.samuel;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {
	@RequestMapping("/daikichi")
	public String welcome() {
		return "Welcome!";
	}
	@RequestMapping("/daikichi/today")
	public String daikichi() {
		return "Today you will find luck in all your endeavors!";
	}
	@RequestMapping("/daikichi/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	@RequestMapping("/daikichi/travel/{location}")
	public String travelLocation(@PathVariable("location") String location) {
		return "You will soon be traveling to " + location;
	}
	@RequestMapping("/daikichi/lotto/{number}")
	public String lottoNumber(@PathVariable("number")Integer number) {
		if(number % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers." ;
		}
		else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend with family and friends";
		}
		
	}
}
