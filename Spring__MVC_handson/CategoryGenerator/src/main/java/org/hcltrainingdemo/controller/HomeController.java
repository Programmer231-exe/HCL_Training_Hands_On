package org.hcltrainingdemo.controller;

import java.util.Map;

import org.hcltrainingdemo.model.Category;
import org.hcltrainingdemo.services.CategoryManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping("/")	
	public String welcomeHome() {
		return "index";
	}
	
	@PostMapping("/display")
	public String display(Model model)
	{
		model.addAttribute("categories",CategoryManager.getAllCategory());
		return "display";
	}
	
	@PostMapping("/create")
	public String createCategory(@RequestParam("name")String name,Model model)
	{
		if(!name.trim().equals("")) {
			Category category = new Category();
			category.setName(name);
			if(CategoryManager.createCategory(category))
			model.addAttribute("message","Successfully created Category");
		}else {
			model.addAttribute("message","Please enter a valid name");
		}
		
		return "index";
		
		
	}
	
	@PostMapping("/delete")
	public ModelAndView delete(@RequestParam("option")int id) {
		System.out.println(id);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display");
		Map<String,Object> model = mav.getModel();
		CategoryManager.deleteCategory(id);
		model.put("message", "Record successfully deleted");
		model.put("categories",CategoryManager.getAllCategory());
		return mav;
		
	}
	
	@PostMapping("/edit")
	public ModelAndView edit(@RequestParam("option")int id) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("edit");
		Map<String,Object> model = mav.getModel();
		model.put("id", id);
		return mav;
		
	}
	
	@PostMapping("/update")
	public ModelAndView update(@RequestParam("id")int id,@RequestParam("name")String username) {
		
		ModelAndView mav = new ModelAndView();
		Map<String,Object> model = mav.getModel();
		if(!username.trim().equals("")) {
			System.out.println(id);
			System.out.println(username);
			CategoryManager.updateCategory(new Category(id,username));
			model.put("message","Successfully updated Category");
			model.put("categories",CategoryManager.getAllCategory());
			mav.setViewName("display");
			return mav;
		}else {
			model.put("message","Please enter a valid name");
			model.put("id",id);
			mav.setViewName("edit");
			return mav;
		}
		
	}
	
}
