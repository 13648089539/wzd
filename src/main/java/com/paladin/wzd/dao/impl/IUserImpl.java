package com.paladin.wzd.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.paladin.wzd.dao.ITuserDao;
import com.paladin.wzd.dto.User;

@Component("userDao")
public class IUserImpl extends BaseDao implements ITuserDao{

	@Override
	public List<User> getUsers() {
		return query4List("getUser", null);
	}

	@Override
	public void addUser(User user) {
		 insert("addUser", user);
		
	}
}
