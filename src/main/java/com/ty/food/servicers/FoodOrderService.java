package com.ty.food.servicers;

import java.util.List;

import com.ty.food.dao.FoodOrderdao;
import com.ty.food.dto.FoodOrder;

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

}
