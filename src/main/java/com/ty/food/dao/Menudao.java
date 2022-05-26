package com.ty.food.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.food.dto.Menu;

public class Menudao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Menu saveMenu(Menu menu) {
		entityTransaction.begin();
		entityManager.persist(menu);
		entityTransaction.commit();
		return menu;
	}

	public List<Menu> getAll() {
		String sql = "select m from Menu m";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

	public Menu getById(int id) {
		Menu menu = entityManager.find(Menu.class, id);
		return menu;

	}

	public Menu updateById(int id, Menu menu) {
		menu = entityManager.find(Menu.class, id);
		if(menu!=null) {
	    menu.setId(id);
		entityTransaction.begin();
		entityManager.merge(menu);
		entityTransaction.commit();
		}else {
			System.out.println("Id not found");
		}
		return menu;

	}
	public Menu deleteById(int id) {
		Menu menu= entityManager.find(Menu.class, id);
		entityManager.remove(menu);
		return menu;
	}
}
