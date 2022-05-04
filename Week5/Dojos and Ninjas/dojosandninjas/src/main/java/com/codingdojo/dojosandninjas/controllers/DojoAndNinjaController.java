package com.codingdojo.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.models.Ninja;
import com.codingdojo.dojosandninjas.services.DojoService;
import com.codingdojo.dojosandninjas.services.NinjaService;

@Controller
public class DojoAndNinjaController {
	@Autowired
	DojoService dojoService;
	@Autowired
	NinjaService ninjaService;
	
	//redirect to main page
	@GetMapping("/")
	public String redirect() {
		return "redirect:/dojos";
	}
	
	//main page, display dojos and the small form to create a form
	@GetMapping("/dojos")
	public String index(@ModelAttribute("newDojo") Dojo dojo, Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojo", dojos);
		return "index.jsp";
	}
	
	//show page to create new ninjas
	@GetMapping("/ninjas")
	public String ninja(@ModelAttribute("newNinja") Ninja ninja, Dojo dojo, Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojo", dojos);
		return "newninja.jsp";
	}
	
	//show dojo and the ninjas within
	@GetMapping("/show/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Dojo dojo = dojoService.findDojo(id);
		List<Ninja> ninja = ninjaService.inDojo(dojo);
		model.addAttribute("newDojo", dojo);
		model.addAttribute("newNinja", ninja);
		return "show.jsp";
	}
	
	@PostMapping("/dojos")
	public String createDojo (@Valid @ModelAttribute("newDojo") Dojo dojo, Model model) {
			dojoService.createDojo(dojo);
			return "redirect:/dojos";
		}
	
	@PostMapping("/ninjas")
	public String createNinja (@Valid @ModelAttribute("newNinja") Ninja ninja, Model model) {
			ninjaService.createNinja(ninja);
			return "redirect:/dojos";
		}
	}
