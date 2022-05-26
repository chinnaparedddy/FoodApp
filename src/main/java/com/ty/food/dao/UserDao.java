package com.ty.food.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.food.dto.User;

public class UserDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public User saveUser(User user) {
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}

	public List<User> getAll() {
		entityTransaction.begin();
		String sql = "select u from User u";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}
	public User getById(int id) {
		entityTransaction.begin();
		 User user=entityManager.find(User.class, id);
		 return user;
	}

}
