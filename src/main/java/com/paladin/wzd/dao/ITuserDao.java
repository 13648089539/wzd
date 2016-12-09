package com.paladin.wzd.dao;

import java.util.List;

import com.paladin.wzd.dto.User;


public interface ITuserDao {

	public List<User> getUsers();
	
	public void addUser(User user);

}
