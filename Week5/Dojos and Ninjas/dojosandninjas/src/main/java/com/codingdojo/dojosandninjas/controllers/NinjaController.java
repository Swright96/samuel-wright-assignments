package com.codingdojo.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.models.Ninja;
import com.codingdojo.dojosandninjas.services.DojoService;
import com.codingdojo.dojosandninjas.services.NinjaService;

@Controller
public class NinjaController {
	
	@Autowired
	DojoService dojoService;
	@Autowired
	NinjaService ninjaService;
	
	//show page to create new ninjas
	@GetMapping("/ninjas")
	public String ninja(@ModelAttribute("newNinja") Ninja ninja, Dojo dojo, Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojo", dojos);
		return "newninja.jsp";
	}
	
	@PostMapping("/ninjas")
	public String createNinja (@Valid @ModelAttribute("newNinja") Ninja ninja, Model model) {
			ninjaService.createNinja(ninja);
			return "redirect:/dojos";
		}
}
