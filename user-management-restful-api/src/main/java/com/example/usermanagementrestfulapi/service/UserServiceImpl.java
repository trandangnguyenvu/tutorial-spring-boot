package com.example.usermanagementrestfulapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.usermanagementrestfulapi.entity.User;
import com.example.usermanagementrestfulapi.model.dto.UserDto;
import com.example.usermanagementrestfulapi.model.mapper.UserMapper;

@Component
public class UserServiceImpl implements UserService {
	private static ArrayList<User> users = new ArrayList<User>(); // thay cho database
	
	static {
		users.add(new User(1, "Nguyễn Thị Mộng Mơ", "momo@gmail.com", "09053579111", "avatar.img", "123"));
		users.add(new User(2, "Bùi Như Lạc", "laclac@gmail.com", "0905615559", "avatar1.img", "345"));
		users.add(new User(3, "Phan Thị Lan", "lanlittle@gmail.com", "0935415009", "avatar2.img", "789"));
		users.add(new User(3, "Bành Thị Tèo", "teo@gmail.com", "0935415225", "avatar3.img", "123"));
	}

	@Override
	public List<UserDto> getListUser() {
		List<UserDto> result = new ArrayList<UserDto>();
		for (User user : users) {
			result.add(UserMapper.toUserDto(user));
		}
		return result;
	}

	@Override
	public UserDto getUserById(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return UserMapper.toUserDto(user);
			}
		}
		return null;
	}

	@Override
	public List<UserDto> searchUser(String keyword) {
		List<UserDto> result = new ArrayList<>();
		for (User user : users) {
			if (user.getName().contains(keyword)) {
				result.add(UserMapper.toUserDto(user));
			}
		}
		return result;
	}
	
}
