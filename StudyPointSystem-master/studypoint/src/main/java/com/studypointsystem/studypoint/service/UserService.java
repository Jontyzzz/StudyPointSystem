package com.studypointsystem.studypoint.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.studypointsystem.studypoint.entity.User;

public interface UserService {

	public List<User> getAllUser();
	
	public User getUser(String userId);

	public User addUser(User user);
	
	public User updateUser(User user);
	
	public void deleteUser(String userId);
}
