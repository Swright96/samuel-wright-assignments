package com.codingdojo.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.services.BookService;



@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@RequestMapping("/books/{bookID}")
	public String index(@PathVariable("bookID")Long bookID, Model model) {
		Book book = bookService.findBook(bookID);
		
		model.addAttribute("book", book);
		
		return "index.jsp";
	}
}
