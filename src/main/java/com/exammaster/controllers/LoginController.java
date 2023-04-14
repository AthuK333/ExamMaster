package com.exammaster.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.exammaster.LoginRepo;
import com.exammaster.entities.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {

	@Autowired
	private LoginRepo rep;
	
	@GetMapping(path = "/reg")
	public String getReg() {
		return "register";
	}
	
	@PostMapping(path = "/regpage")
	public String register(HttpServletRequest req) {
		
		String uname= req.getParameter("username");
		String pass= req.getParameter("password");
		String role= req.getParameter("role");
		User u = new User(uname, pass, role);
		
		rep.save(u);
		return "login";
		
		
	}
	@GetMapping(path = "/login")
	public String getLogin() {
		return "login";
		
		
	}
	
	@PostMapping(path = "/loginpage")
	public String login(HttpServletRequest req, Model model) {
		
		HttpSession session = req.getSession();
		
		String username= req.getParameter("username");
		String pass= req.getParameter("password");
		
		User u= rep.validLogin(username, pass);
		if(u!=null) {
			model.addAttribute("unm",username);
			
			if(u.getRole().equalsIgnoreCase("user")) {
				return "userdash";
			}
			else {
				
				return "admindash";
			}
			
		}
		else 
			model.addAttribute("login","Login failed...");
			return "login";
	}
	
}
