package com.ty.food.controlers;

import java.util.ArrayList;
import java.util.List;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.servicers.FoodOrderService;

public class TestSaveFoodAndItems {

	public static void main(String[] args) {

		FoodOrderService foodOrderService=new FoodOrderService();
		FoodOrder foodOrder= new FoodOrder();
		foodOrder.setName("karthik");
		foodOrder.setPhone(9989452181l);
		
		
		
		Item items=new Item();
		items.setName(" kabbab ");
		items.setQuntity(2);
		items.setCost(120);
		items.setFoodOrder(foodOrder);
		
		Item items1=new Item();
		items1.setName("biryani");
		items1.setQuntity(2);
		items1.setCost(250);
		items1.setFoodOrder(foodOrder);
		
		Item items2=new Item();
		items2.setName("bindu");
		items2.setQuntity(2);
		items2.setCost(50);
		items2.setFoodOrder(foodOrder);
		List<Item> itemss=new ArrayList<Item>();
		itemss.add(items1);
		itemss.add(items2);
		itemss.add(items);
		foodOrder.setItems(itemss);
		double total=0;
		for(Item item:itemss) {
			
			total=total+(item.getCost()*item.getQuntity());
		}
		foodOrder.setTotal((int) total);
		foodOrder.setStatus("start preparing");
		foodOrderService.SaveFoodOrder(foodOrder);
		
		
	}

}
