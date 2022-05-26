package com.ty.food.controlers;

import java.util.ArrayList;
import java.util.List;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Items;
import com.ty.food.servicers.FoodOrderService;

public class TestFoodAndItems {

	public static void main(String[] args) {

		FoodOrderService foodOrderService=new FoodOrderService();
		FoodOrder foodOrder= new FoodOrder();
		foodOrder.setName("Parota");
		foodOrder.setPhone(89797564);
		foodOrder.setTotal(3);
		
		
		Items items=new Items();
		items.setName(" Dall ");
		items.setQuntity("two plates");
		items.setCost(250);
		items.setFoodOrder(foodOrder);
		
		Items items1=new Items();
		items1.setName("lemon Rice");
		items1.setQuntity("two plates");
		items1.setCost(210);
		items1.setFoodOrder(foodOrder);
		
		Items items2=new Items();
		items2.setName("Tamota bath");
		items2.setQuntity("two plates");
		items2.setCost(150);
		items2.setFoodOrder(foodOrder);
		List<Items> itemss=new ArrayList<Items>();
		itemss.add(items1);
		itemss.add(items2);
		itemss.add(items);
		foodOrder.setItems(itemss);
		foodOrderService.SaveFoodOrder(foodOrder);
		
		
	}

}
