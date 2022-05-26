package com.ty.food.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.food.dto.Taxs;

public class TaxsDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Taxs saveTaxs(Taxs taxs) {
		entityTransaction.begin();
		entityManager.persist(taxs);
		entityTransaction.commit();
		return taxs;
	}
}
