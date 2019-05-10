package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.beans.User;
import com.project.service.AdminService;
import com.project.service.CredsService;
import com.project.service.UserService;

@Controller
@ResponseBody
@RequestMapping
//@RequestMapping(value="/view")//homepage
public class UserController {

	private UserService uService;
	private CredsService cService;
	private AdminService aService;
	
	@Autowired//setting injection
	public void setUserService(UserService uService) {
		this.uService = uService;
	}

	@PostMapping
	public ResponseEntity<String> addUser(@RequestBody User user) {
		ResponseEntity<String> resp = null;
		user.setUserId(0);
		cService.createCreds(user.getCreds());
		try {
			uService.createUser(user);
			resp = new ResponseEntity<>("ACCOUNT CREATED SUCCESSFULLY", HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>("FAILED TO CREATE ACCOUNT", HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
	
	@PutMapping
	public ResponseEntity<String> updateFlashcard(@RequestBody User user){
		ResponseEntity<String> resp = null;
		try {
			uService.updateUser(user);
			resp = new ResponseEntity<>("FLASHCARD UPDATED SUCCESSFULLY", HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>("FAILED TO UPDATE FLASHCARD", HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
	
	@DeleteMapping
	public ResponseEntity<String> deleteFlashcard(@RequestBody User user){
		ResponseEntity<String> resp = null;
		try {
			uService.deleteUser(user);
			resp = new ResponseEntity<>("FLASHCARD DELETED SUCCESSFULLY", HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>("FAILED TO DELETE FLASHCARD", HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
	

	

}
