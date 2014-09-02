package com.isax.diplay;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageB {
	@RequestMapping("/pageb")
	public String handle(Model model) {
		model.addAttribute("message", "This is PageB!");
		return "pageb";
	}
}
