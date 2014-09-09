package com.conversation.dao;

import com.conversation.po.User;

public interface UserDao {
	public int addUser(User user);

	public User getUser(int id);

}
