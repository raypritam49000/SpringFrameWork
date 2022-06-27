package com.spring.mvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.dao.UserDao;
import com.spring.mvc.model.User;

@Service
public class UserServices {
    
	@Autowired
	private UserDao userDao;
	
	public int createUser(User user) {
	   int id =	(Integer)this.userDao.saveUser(user);
	   return id;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
		
}
