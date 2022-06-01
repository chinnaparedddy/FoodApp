package com.ty.food.servicers;

import java.util.List;

import com.ty.food.dao.FoodOrderdao;
import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.dto.Menu;
import static com.ty.utill.Tax.*;
public class FoodOrderService {
	FoodOrderdao foodOrderdao = new FoodOrderdao();

	public FoodOrder SaveFoodOrder(FoodOrder foodOrder) {
		return foodOrderdao.saveFood(foodOrder);
	}

	public FoodOrder getByid(int id) {
		return foodOrderdao.getById(id);
	}

	public List<FoodOrder> getAll() {
		return foodOrderdao.getAll();
	}

	public FoodOrder deleteByid(int id) {
		return foodOrderdao.getById(id);
	}
	public FoodOrder updateOrder(int id, Item item) {
		
		return foodOrderdao.updateOrder(id, item);
	}

	public List<FoodOrder> getByName(String name){
		return foodOrderdao.getByName(name);
	}
	public List<FoodOrder> getByPhone(long phone){
		return foodOrderdao.getByPhone(phone);
	}
	public double billGenerate(double amount) {
		//double total=0;
		// FoodOrder foodOrder=foodOrderdao.genrateBill(id);
	//	double amount= foodOrder.getTotal()+(foodOrder.getTotal()*cgst/100);
		//amount+=amount*sgst/100;
		// return amount;
		amount=amount+(amount*cgst/100);
		amount =amount +(amount*sgst/100);
		return amount;
	}
	public double offerApplied(double amount) {
	Menu menu=new Menu();
//		double offer=menu.getOffer();
	return (amount-(amount*menu.getOffer()/100));
		 
	}
}
