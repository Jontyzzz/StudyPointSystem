package com.studypointsystem.studypoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.studypointsystem.studypoint.entity.User;
import com.studypointsystem.studypoint.repository.UserRepository;
import com.studypointsystem.studypoint.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	public UserService userService;
	
	@GetMapping("/user")
	@ResponseBody
	public List<User> getAllUser(){
		return this.userService.getAllUser();
	}
//	public String test() {
//		
//		return "User list";
//	}
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		
		return this.userService.addUser(user);
	}
		

}
