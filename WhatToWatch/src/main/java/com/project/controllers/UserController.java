package com.project.controllers;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.service.*;
import com.project.beans.*;
import com.project.dao.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/user")
public class UserController {
	
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	//BRINGS BACK A LIST OF ALL USERS
	@GetMapping(value="/all")
	public ResponseEntity<List<User>> getAllUsers(){
		return new ResponseEntity<>(userService.allUsers(), HttpStatus.OK);
	}
	
	//CREATES A NEW USER IN THE DATABASE
	@PostMapping
	public ResponseEntity<String> createUser(@RequestBody User user){
		ResponseEntity<String> response = null;
		userService.createUser(user);
		response = new ResponseEntity<>("You have successfully created a new account", HttpStatus.OK);
		return response;
	}
	
	//DELETES USER BY ID
	public ResponseEntity<String> deleteUser(@RequestBody User user){
		ResponseEntity <String> response = null;
			 userService.deleteUser(user);
			 response = new ResponseEntity<>("You have successfully deleted your account", HttpStatus.OK);
			 return response;
	
	}
	
}
