package com.restfulapi.restfulapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping(value = "/hello-world", method = RequestMethod.GET)
	public ResponseEntity<?> helloWorld() {
		User user = new User(1, "Nguyễn Thị Mộng Mơ");
		//return ResponseEntity.status(HttpStatus.OK).body(user);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(user);
	}
//	public User helloWorld() {
//		User user = new User(1, "Nguyễn Thị Mộng Mơ");
//		return user;
//	}
}
