package com.sharad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sharad.model.User;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
	
	// hadler method for the User 
	@GetMapping("variable")
	public String variableExpression(Model model) {
		User user=new User("Sharad","sharad@gmail.com","Admin","Male");
		model.addAttribute("var", user);
		return "variable-expression";
	}
	@GetMapping("selection")
	public String selectionVariable(Model model){
		User user=new User("Sharad","sharad@gmail.com","Admin","Male");
		model.addAttribute("selection", user);
		return "selection-expession";

	}

	// handler method for the  Message Expression
	// http://localhost:8081/message
	@GetMapping("message")
	public String messageExpression(){
		return "message-expression";
	}

	//handler method to handle link expression
	@GetMapping("link")
	public  String linkExpression(){
		return  "link-expression";
	}
	@GetMapping("linkId")
	public  String linkExpressionwithId(Model model){
		model.addAttribute("id",1);
		return  "link-expression";
	}

	//handler method for the fragment expression
	@GetMapping("fragment")
	public String fragmentExpression(){
		return "fragment-expression";
	}

	// for th:each
	@GetMapping("user-each")
	public String users(Model model){
		User admin=new User("Sharad","sharad@gmail.com","Admin","Male");
		User ramesh = new User("Ramesh", "ramesh@gmail.com", "USER", "Male");
		User Manish = new User("Manish", "manish@gmail.com", "USER", "Male");
		List<User> users=new ArrayList<>();
		users.add(admin);
		users.add(ramesh);
		users.add(Manish);
		model.addAttribute("admin",users);
		return "userss";
	}

	//handler method for the th:if attribute
	@GetMapping("ifUnless")
	public String ifUnless(Model model){
		User admin=new User("Sharad","sharad@gmail.com","ADMIN ","Male");
		User ramesh = new User("Ramesh", "ramesh@gmail.com", "USER", "Male");
		User Manish = new User("Manish", "manish@gmail.com", "USER", "Male");
		List<User> users=new ArrayList<>();
		users.add(admin);
		users.add(ramesh);
		users.add(Manish);
		model.addAttribute("admin",users);
		return "ifunless";
	}

}
