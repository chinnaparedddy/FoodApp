package com.ty.user.controlers;

import com.ty.food.dto.User;
import com.ty.food.servicers.UserServices;

public class TestGetAllUsers {

	public static void main(String[] args) {

		UserServices userServices=new UserServices();
		if(userServices!=null) {
			for(User user:userServices.getAll()) {
				System.out.println("User Id: "+user.getId());
				System.out.println("User Name: "+user.getName());
				System.out.println("User Email: "+user.getMail());
				System.out.println("User Password: "+user.getPassword());
				System.out.println("User Phone: "+user.getPhone());
				System.out.println("********************");
			}
		}else {
			System.out.println("No Users Found");
		}
	}

}
