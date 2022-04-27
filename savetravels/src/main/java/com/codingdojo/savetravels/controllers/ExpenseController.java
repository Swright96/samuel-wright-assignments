package com.codingdojo.savetravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.savetravels.models.Expense;
import com.codingdojo.savetravels.services.ExpenseService;

@Controller
public class ExpenseController {
	@Autowired
	ExpenseService expenseService;
	
	@GetMapping("/")
	public String redirect() {
		return "redirect:/expenses";
	}
	
	@RequestMapping("/expenses")
	public String index(@ModelAttribute("newExpense") Expense expense, Model model) {
		List<Expense> expenses = expenseService.allExpenses();
		model.addAttribute("expense", expenses);
		return "index.jsp";
	}
	
	
	@PostMapping("/expenses")
	public String create(@Valid @ModelAttribute("newExpense") Expense expense, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Expense> expenses = expenseService.allExpenses();
			model.addAttribute("newExpense", expenses);
			return "index.jsp";
		}
		else {
			expenseService.createExpense(expense);
			return "redirect:/expenses";
		}
	}
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		Expense expenses = expenseService.findExpense(id);
		model.addAttribute("newExpense", expenses);
		return "edit.jsp";
	}
	
	@PutMapping("/edit/{id}")
	public String update(@PathVariable("id") Long id, Model model, @Valid @ModelAttribute("newExpense") Expense expense, BindingResult result) {
		if (result.hasErrors()) {
			return "redirect:/edit/{id}";
		}
		else {
			expenseService.updateExpense(expense);
			return "redirect:/expenses";
		}
	}
}
