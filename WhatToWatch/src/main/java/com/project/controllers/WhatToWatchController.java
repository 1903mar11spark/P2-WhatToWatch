package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.project.service.UserService;

@Controller
//@RequestMapping(value="/view")//homepage
public class WhatToWatchController {
	
	private UserService userService;
	
	@Autowired //setter injection
	public void setUserService(UserService userService) {
		this.userService=userService;
	}
	
	
	

}
