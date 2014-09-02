package com.isax.diplay;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageA {
	
	@RequestMapping("/")
	public String handle(Model model) {
		model.addAttribute("message", "This is PageA!");
		return "pagea";
	}
}
