package com.example.usermanagementrestfulapi.model.mapper;

import com.example.usermanagementrestfulapi.entity.User;
import com.example.usermanagementrestfulapi.model.dto.UserDto;

public class UserMapper {
	public static UserDto toUserDto(User user) {
		UserDto tmp = new UserDto();
		tmp.setId(user.getId());
		tmp.setName(user.getName());
		tmp.setEmail(user.getEmail());
		tmp.setPhone(user.getPhone());
		tmp.setAvatar(user.getAvatar());
		
		return tmp;
	}
}
