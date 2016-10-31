package com.demo.dao;

import java.util.List;

import com.demo.entity.User;

public interface UserDao {

	public void getUserById(int id);
	
	public List<User> getUserList();
	
}
