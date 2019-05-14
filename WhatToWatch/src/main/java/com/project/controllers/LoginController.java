package com.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.project.beans.Creds;
import com.project.dao.*;
import com.project.service.CredsService;

@RestController
public class LoginController {
	//private CredsDAOImpl credsDAOImpl;
	//@Autowired
	//public LoginController(CredsDAOImpl credsDAOImpl) {
	//	this.credsDAOImpl = credsDAOImpl;
	//}
	@CrossOrigin(origins = "http://localhost:4200")
	//@RequestMapping(value="/login", method = RequestMethod.GET, produces = "application/json")
	@RequestMapping(value="/login", method = RequestMethod.POST)
	//public void recoverUsername(@RequestParam("username") String username) {
	public String recoverUsername(@RequestBody Login login) {
	System.out.println(login);
	String username = login.getUsername();
	System.out.println(username);
	String password = login.getPassword();
	System.out.println(password);
	return  "true";
    }
	
}

/*@RestController
@RequestMapping(value="/login")
public class LoginController {

	private CredsService credsService;
	
	@Autowired
	public LoginController(CredsService credsService) {
		this.credsService = credsService;
		System.out.println("frickin print plz");
	}*/
	
//	@CrossOrigin
//	@GetMapping(value="/{userName}/{password}")
//	public ResponseEntity<Integer> getUserId(@PathVariable String userName, @PathVariable String password){
//		int userId = credsService.getUserId(userName, password);
//		return new ResponseEntity<>(userId, HttpStatus.OK);
//	};
	
	/*@CrossOrigin
	@GetMapping(value="/all")
	public ResponseEntity<List<Creds>> getAllCreds() {
		return new ResponseEntity<>(credsService.allCreds(), HttpStatus.OK);
	}*/
	
//	@RequestMapping("/login")
//	public Creds creds()	{
//		Creds creds = new Creds();
//		return creds;
//		
//	}
//	
//	@PostMapping
//	(value="/login", consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//	public RedirectView handleFormRequest(@RequestBody MultiValueMap<String, String> formParams, RedirectAttributes attributes) {
//		attributes.addFlashAttribute("username", formParams.getFirst("username"));
//		// could grab password, do some authentication
//		return new RedirectView("profile");
//	}
//	
	
	
//}
