package com.example.usermanagementrestfulapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.usermanagementrestfulapi.entity.User;
import com.example.usermanagementrestfulapi.model.dto.UserDto;

@Service
public interface UserService {
	public List<UserDto> getListUser();
	
	public UserDto getUserById(int id);
	
	public List<UserDto> searchUser(String keyword);
}
