package com.example.usermanagementrestfulapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.usermanagementrestfulapi.entity.User;
import com.example.usermanagementrestfulapi.model.dto.UserDto;
import com.example.usermanagementrestfulapi.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired 
	private UserService userService;
	
	@GetMapping("")
	public ResponseEntity<?> getListUser() {
		List<UserDto> users = userService.getListUser();
		return ResponseEntity.ok(users);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getUserById(@PathVariable int id) {
		//System.out.println(id);
		UserDto result = userService.getUserById(id);
		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/search")
	public ResponseEntity<?> searchUser(@RequestParam(name = "keyword", required = false, defaultValue = "") String name) {
		List<UserDto> result = userService.searchUser(name);			
		return ResponseEntity.ok(result);
	}
	
	@PostMapping("")
	public ResponseEntity<?> createUser() {
		return null;
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updateUser() {
		return null;
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteUser() {
		return null;
	}	
}
