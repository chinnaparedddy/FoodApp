package com.ty.menu.controlers;

import com.ty.food.dto.Menu;
import com.ty.food.servicers.MenuServices;

public class TestUpdateById {

	public static void main(String[] args) {

		MenuServices menuServices=new MenuServices();
		
		Menu menu=new Menu();
		menu.setName("Dall Rice");
		menu.setDescription("Dall,Rice");
		menu.setCost(200);
		menu.setType("veg");
		menu.setOffer(10);
		menu.setImage("https://media.istockphoto.com/photos/butter-chicken-curry-with-tender-chicken-breast-cream-butter-honey-picture-id673858790?b=1&k=20&m=673858790&s=170667a&w=0&h=o1SRSlz9OVeY5AXK7iAa8F7i1nUJqad-XH1HML3AeJo=");
		menuServices.validateById(4, menu);
		System.out.println("Updateit");
		
	}

}
