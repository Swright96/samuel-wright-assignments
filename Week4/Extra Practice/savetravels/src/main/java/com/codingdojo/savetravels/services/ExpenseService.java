package com.codingdojo.savetravels.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.savetravels.models.Expense;
import com.codingdojo.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	private final ExpenseRepository expenseRepository;
	
	//dependency injection
	public ExpenseService (ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}
	//find all expenses for table
	public List<Expense> allExpenses() {
		return expenseRepository.findAll();
	}
	//create expense
	public Expense createExpense(Expense expense) {
		return expenseRepository.save(expense);
	}
	
}
