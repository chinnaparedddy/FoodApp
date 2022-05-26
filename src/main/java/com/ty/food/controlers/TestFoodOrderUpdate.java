package com.ty.food.controlers;

import java.util.ArrayList;
import java.util.List;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.servicers.FoodOrderService;

public class TestFoodOrderUpdate {

	public static void main(String[] args) {

		FoodOrderService foodOrderService = new FoodOrderService();

		Item items = new Item();
		items.setName("rice");
		items.setQuntity(2);
		items.setCost(150);
		
		foodOrderService.updateOrder(3, items);

	}

}
