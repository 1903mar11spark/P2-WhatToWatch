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

@RequestMapping(value="/admin")
public class AdminController {
	
	private AdminService aService;
	

	
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUser(){
		return new ResponseEntity<>(aService.getAllUsers(), HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<String> deleteAdmin(@RequestBody Admin admin){
		ResponseEntity<String> resp = null;
		try {
			aService.deleteAdmin(admin);
			resp = new ResponseEntity<>("ADMIN DELETED SUCCESSFULLY", HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>("FAILED TO DELETE ADMIN", HttpStatus.BAD_REQUEST);
		}
		return resp;
	}

}
