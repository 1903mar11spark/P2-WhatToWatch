package com.project.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.project.beans.Creds;
import com.project.service.AdminService;
import com.project.service.UserService;

@Controller
public class ProfileController {
	
	private AdminService aService;
	private UserService uService;
	
	@GetMapping(value="/profile")
	public ModelAndView getProfilePage(@ModelAttribute("username") String username, @ModelAttribute("password") String password, ModelMap m) {
		m.addAttribute("username", username);
		m.addAttribute("password", password);
		
		Creds creds = new Creds(username, password);
		//Can be changed later
		if(aService.getAdminByCreds(creds) != null ) {
			return new ModelAndView("profile", m);
		}else {
			return new ModelAndView("profile", m);
		}
		
		
		
	}
	
	
}
