package com.ty.food.controlers;

import java.util.List;

import com.ty.food.dto.Billgenratin;
import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.servicers.FoodOrderService;
import static com.ty.utill.Tax.*;

public class TestBillGenration {

	public static void main(String[] args) {

		Billgenratin billgenratin = new Billgenratin();
		FoodOrderService foodOrderService = new FoodOrderService();
		List<FoodOrder> foodorders = foodOrderService.getByName("Uday");
		int count = 0;
		for (FoodOrder foodOrder : foodorders) {
			List<Item> items = foodOrder.getItems();
			double amount = 0;
			for (Item item : items) {
				billgenratin.setId(item.getId());
				billgenratin.setItem(item.getName());
				billgenratin.setCost(item.getCost());
				billgenratin.setQuntity(item.getQuntity());
				billgenratin.setTotal(item.getCost() * item.getQuntity());

				if (count == 0) {
					System.out.println("id\t item\tcost\tquntity\ttotal");
					count++;
				}
				System.out.print(billgenratin.getId());
				System.out.print("\t" + billgenratin.getItem());
				System.out.print("\t" + billgenratin.getCost());
				System.out.print("\t" + billgenratin.getQuntity());
				System.out.println("\t" + billgenratin.getTotal());

				amount += billgenratin.getTotal();

			}
			
			double amounts=foodOrderService.billGenerate(amount);
			System.out.println("\n\t\ttTotall Amount: "+amounts);
			amounts=foodOrderService.offerApplied(amounts);
			
			System.out.println("\n\t\tAdd Add offerTotall: "+amounts);
// 
//			double a=amount*cgst/100;
//			 a=a+(a*sgst/100);
//			System.out.println("\n\t\tAdd gstTotall: "+a);
//			System.out.println("\n\t\ttTotall Amount: "+(a+amount));
//			
		}
	}
}
