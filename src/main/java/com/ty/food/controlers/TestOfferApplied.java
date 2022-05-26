package com.ty.food.controlers;

import com.ty.food.servicers.FoodOrderService;

public class TestOfferApplied {

	public static void main(String[] args) {

		FoodOrderService foodOrderService=new FoodOrderService();
		double amount=foodOrderService.billGenerate(1);
		double offeredAmount=foodOrderService.offerApplied(amount);
		System.out.println("Offer Applied Ammount is: "+offeredAmount);
	}

}
