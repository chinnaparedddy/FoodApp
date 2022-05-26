package com.ty.food.controlers;

import java.util.List;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Items;
import com.ty.food.servicers.FoodOrderService;

public class TestGetById {

	public static void main(String[] args) {

		FoodOrderService foodOrderService=new FoodOrderService();
		 FoodOrder foodOrder=foodOrderService.getByid(1);
		 if(foodOrder!=null) {
		 System.out.println("Food Id :"+foodOrder.getId());
		 System.out.println("Food Name :"+foodOrder.getName());
		 System.out.println("Food Phone:"+foodOrder.getPhone());
		 System.out.println("Food Total :"+foodOrder.getTotal());
		 System.out.println("========================");
		 
		 List<Items> items=foodOrder.getItems();
		 for(Items item:items) {
			 System.out.println("Item Id:"+item.getId());
			 System.out.println("Item name:"+item.getName());
			 System.out.println("Item Quantity:"+item.getQuntity());
			 System.out.println("Item Cost:"+item.getCost());
			 System.out.println("**********************************");
		 }
		 }else {
			 System.out.println("No one Can Order Food");
		 }
	}

}