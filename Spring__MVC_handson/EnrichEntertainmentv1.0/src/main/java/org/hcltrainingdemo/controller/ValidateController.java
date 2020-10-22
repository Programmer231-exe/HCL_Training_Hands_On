package org.hcltrainingdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ValidateController {
	
	@RequestMapping("/validate")
	 public String validate(@RequestParam("username")String username, @RequestParam("password")String password,Model model) {
		 if(username.trim().equals("Adithya") && password.equals("adithya"))
			 {
			 model.addAttribute("name",username);
			 return "success";
			 }
			 
		 else
		 {
			 model.addAttribute("error","Usernaame and password provided does not match");
			 return "login";
		 }
			 
	 }
}
