package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.project.beans.Creds;
import com.project.service.CredsService;

@RestController
@RequestMapping(value="/login")
public class LoginController {
	
	private CredsService credsService;
	
	@Autowired
	public LoginController(CredsService credsService) {
		this.credsService = credsService;

	}
	
	@GetMapping (value="/{login}")
	public ResponseEntity<Integer> getUserId(@PathVariable Creds creds){
		int userId = credsService.getUserId(creds);
		return new ResponseEntity<>(userId, HttpStatus.OK);
	};
	
	@PostMapping
	(value="/login", consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public RedirectView handleFormRequest(@RequestBody MultiValueMap<String, String> formParams, RedirectAttributes attributes) {
		attributes.addFlashAttribute("username", formParams.getFirst("username"));
		// could grab password, do some authentication
		return new RedirectView("profile");
	}
	
	
}
