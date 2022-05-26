package com.ty.food.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Items;

public class FoodOrderdao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public FoodOrder saveFood(FoodOrder foodOrder) {
		entityTransaction.begin();
		List<Items> items = foodOrder.getItems();
		for (Items item : items) {
			entityManager.persist(item);
		}
		entityManager.persist(foodOrder);
		entityTransaction.commit();
		return foodOrder;
	}

	public FoodOrder getById(int id) {
		FoodOrder foodOrder = entityManager.find(FoodOrder.class, id);

		return foodOrder;
	}

	public List<FoodOrder> getAll() {
		String sql = "select f from FoodOrder f";
		Query query = entityManager.createQuery(sql);
		List<FoodOrder> foodOrders = query.getResultList();
		return foodOrders;
	}

	public FoodOrder deleteById(int id) {
		entityTransaction.begin();
		FoodOrder foodOrder = entityManager.find(FoodOrder.class, id);
		entityManager.remove(foodOrder);
		entityTransaction.commit();
		
		return foodOrder;
	}

}
