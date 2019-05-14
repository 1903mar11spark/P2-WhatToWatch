package com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {
	
	private UserService userService;
	
	@Autowired
	public 
	
	@GetMapping(value="/profile")
	public ModelAndView getProfilePage(@ModelAttribute("username") String username, ModelMap map) {
		map.addAttribute("username", username);
		return new ModelAndView("profile", map);
	}
	
}
