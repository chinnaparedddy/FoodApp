package com.ty.user.controlers;

import com.ty.food.dto.User;
import com.ty.food.servicers.UserServices;

public class TestUserSave {

	public static void main(String[] args) {
		UserServices userServices=new UserServices();
		User user=new User();
		user.setName("suresh");
		user.setMail("suresh@gmail.com");
		user.setPassword("suri74");
		user.setPhone(9989452181l);
		userServices.saveUser(user);
	}
}
