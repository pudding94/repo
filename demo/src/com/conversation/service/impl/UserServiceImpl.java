package com.conversation.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.conversation.dao.UserDao;
import com.conversation.po.User;
import com.conversation.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	private UserDao userDao;
	public UserDao getUserDao() {
		return userDao;
	}
	@Resource(name="userDao")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return this.userDao.addUser(user);
	}
	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return this.userDao.getUser(id);
	}
	
}
