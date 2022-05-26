package com.ty.food.controlers;

import com.ty.food.servicers.FoodOrderService;

public class TestGenraterBill {

	public static void main(String[] args) {

		FoodOrderService foodOrderService=new FoodOrderService();
	     double billAmount=foodOrderService.billGenerate(1);
	    double amount= foodOrderService.offerApplied(billAmount);
	     System.out.println(amount);
	}

}
