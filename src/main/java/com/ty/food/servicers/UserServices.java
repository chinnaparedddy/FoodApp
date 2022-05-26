package com.ty.food.servicers;

import java.util.List;

import com.ty.food.dao.UserDao;
import com.ty.food.dto.User;

public class UserServices {
	UserDao userDao=new UserDao();
	public User saveUser(User user) {
		return userDao.saveUser(user);
	}
	public List< User> getAll(){
		return userDao.getAll();
	}
	public User getById(int id) {
		return userDao.getById(id);
	}
}
