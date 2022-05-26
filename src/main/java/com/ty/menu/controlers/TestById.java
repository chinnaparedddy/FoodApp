package com.ty.menu.controlers;

import com.ty.food.dto.Menu;
import com.ty.food.servicers.MenuServices;

public class TestById {

	public static void main(String[] args) {
		MenuServices menuServices=new MenuServices();
		if(menuServices!=null) {
			Menu menu=menuServices.getById(3);
			System.out.println("Menu id :"+menu.getId());
			System.out.println("Item Name :"+menu.getName());
			System.out.println("Item Description :"+menu.getDescription());
			System.out.println("item cost :"+menu.getCost());
			System.out.println("item type :"+menu.getType());
			System.out.println("item Offer :"+menu.getOffer());
			System.out.println("item Image  :"+menu.getImage());
			System.out.println("***************************8");
			
		}else {
			System.err.println("Id Not Found...!!!!!");
		}
	}
}
