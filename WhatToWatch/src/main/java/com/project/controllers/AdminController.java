package com.project.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.beans.Admin;
import com.project.beans.Tier;
import com.project.beans.User;
import com.project.service.AdminService;

public class AdminController {
	
	private AdminService aService;
	
	@GetMapping(value = "/{tier}") // from the admin side
	public ResponseEntity<List<User>> getFlashcardById(@PathVariable Tier tier) {
		List<User> users = new ArrayList<>();
		users = aService.getAllUsersByTier(tier);
		if (users == null) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<>(users, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUser(){
		return new ResponseEntity<>(aService.getAllUsers(), HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<String> deleteFlashcard(@RequestBody Admin admin){
		ResponseEntity<String> resp = null;
		try {
			aService.deleteUser();
			resp = new ResponseEntity<>("FLASHCARD DELETED SUCCESSFULLY", HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>("FAILED TO DELETE FLASHCARD", HttpStatus.BAD_REQUEST);
		}
		return resp;
	}

}
