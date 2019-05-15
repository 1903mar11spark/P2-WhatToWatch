package com.project.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class LoginController {
	//deliever static resources from the endpoing "/login"
		@GetMapping(value="/login")
		public String getStaticLoginPage() {
			return "forward:/login.html";
		}
		
		//handle form data sent to "/login"
		@PostMapping(value="/login", consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)//default is JSON
		public RedirectView handFormRequest(@RequestBody MultiValueMap<String, String> formParam, RedirectAttributes attributes) {
			attributes.addFlashAttribute("username", formParam.getFirst("username"));
			attributes.addFlashAttribute("password", formParam.getFirst("password"));
			//could also grab password, do some authentication
			return new RedirectView("profile");
		}
}
