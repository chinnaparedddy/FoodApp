package com.ty.food.controlers;

import com.ty.food.servicers.FoodOrderService;

public class TestDeleteById {

	public static void main(String[] args) {

		FoodOrderService foodOrderService=new FoodOrderService();
		foodOrderService.deleteByid(1);
		System.out.println("Deleted");
	}

}
