package com.codingdojo.bookclub.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.bookclub.models.Book;
import com.codingdojo.bookclub.models.User;
import com.codingdojo.bookclub.services.BookService;
import com.codingdojo.bookclub.services.LoginService;
import com.codingdojo.bookclub.services.UserService;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	@Autowired
	UserService userService;
	@Autowired
	LoginService loginService;
	
	//dashboard page to view books and header containing user name and links to create new books
	@GetMapping("/dashboard")
	public String books(@ModelAttribute("newBook")Book book, Model model, HttpSession session) {
		System.out.println(session.getAttribute("userId"));
		List<Book> books = bookService.allBooks();
		User user = userService.findById((Long)session.getAttribute("userId"));
		model.addAttribute("user", user);
		model.addAttribute("book", books);
		return "dashboard.jsp";
	}
	//individual book page by book id
	@GetMapping("/books/{id}")
	public String showBook(@PathVariable("id")Long id, Model model) {
		Book book = bookService.findBook(id);
		User user = userService.findById(id);
		model.addAttribute("newBook", book);
		model.addAttribute("newUser", user);
		return "show.jsp";
	}
	//get method for a new book page to create the book form needed to post
	@GetMapping("/books/new")
	public String newBook(@ModelAttribute("newBook") Book book, Model model, HttpSession session) {
		List<Book> books = bookService.allBooks();
		User user = userService.findById((Long)session.getAttribute("userId"));
		model.addAttribute("user", user);
		model.addAttribute("book", books);
		return "newbook.jsp";
	}
	
	//post method
	@PostMapping("/books/new")
	public String createBook(@Valid @ModelAttribute("newBook") Book book, Model model, BindingResult result) {     
		bookService.createBook(book);
		return "redirect:/dashboard";
	}


}