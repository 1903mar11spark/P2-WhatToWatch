package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.beans.Users;
import com.project.services.UsersService;

@Controller
public class UserController {
	
	private UsersService us;
	
	@Autowired //setter injection
	public void setUserService(UsersService us) {
		this.us = us;
	}
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public ResponseEntity<List<Users>> getAllUsers(){
		return new ResponseEntity<>(us.getAllUsers(), HttpStatus.OK);
	}
	
}
