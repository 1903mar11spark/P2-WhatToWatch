package com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
		
		@GetMapping(value="/profile")
		public ModelAndView getProfilePage(@ModelAttribute("username") String username, ModelMap map) {
			map.addAttribute("username", username);
			return new ModelAndView("profile", map);
		}
	
}
