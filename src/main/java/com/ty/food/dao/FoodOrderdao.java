package com.ty.food.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;

public class FoodOrderdao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public FoodOrder saveFood(FoodOrder foodOrder) {
		entityTransaction.begin();
		List<Item> items = foodOrder.getItems();
		for (Item item : items) {
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
	public FoodOrder updateOrder(int id,Item item) {
		entityTransaction.begin();
		FoodOrder foodOrder=entityManager.find(FoodOrder.class, id);
		foodOrder.getItems().add(item);
		double total=0;
		for(Item items:foodOrder.getItems()) {
			total=total+(items.getCost()*items.getQuntity());
			items.setFoodOrder(foodOrder);
		}
		foodOrder.setTotal((int)total);
		entityManager.merge(foodOrder);
		entityTransaction.commit();
		return foodOrder;
	}
	public List<FoodOrder> getByName(String name) {
		String  sql="select f from FoodOrder f where name=?1";
		 Query query=entityManager.createQuery(sql);
		 query.setParameter(1, name);
		 return query.getResultList();
	}
	public List<FoodOrder> getByPhone(long phone) {
		String sql="select f from FoodOrder f where phone=?1";
		Query query=entityManager.createQuery(sql);
		query.setParameter(1, phone);
		return query.getResultList();
	}
	public FoodOrder genrateBill(int id) {
		FoodOrder foodOrder=entityManager.find(FoodOrder.class, id);
		//List<Item> items=foodOrder.getItems();
		return foodOrder;
	}
	
	
}
