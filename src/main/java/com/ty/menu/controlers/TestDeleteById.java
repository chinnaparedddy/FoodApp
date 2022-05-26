package com.ty.menu.controlers;

import com.ty.food.servicers.MenuServices;

public class TestDeleteById {

	public static void main(String[] args) {

		MenuServices menuServices=new MenuServices();
		menuServices.deleteById(1);
		System.out.println("deleted");
	}

}
