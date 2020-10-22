package org.hcltrainingdemo.controller;

import org.hcltrainingdemo.model.Address;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {
	@GetMapping("/contact")
	public String contactUs(Model model) {
		Address address = new Address();
		address.setLine1("2/112 Street");
		address.setLine2("abc Colony");
		address.setCity("Chennai");
		address.setState("Tamilnadu");
		address.setZip("5000010");
		address.setContactNo("2597252052");
		model.addAttribute("address",address);
		return "contact";
		
}
}
