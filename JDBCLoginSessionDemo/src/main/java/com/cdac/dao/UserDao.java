package com.cdac.dao;

import com.cdac.pojo.User;

public interface UserDao {

	boolean checkUserCredentials(User user);
	boolean addNewUser(User user);
}
