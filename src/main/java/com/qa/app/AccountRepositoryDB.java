package com.qa.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AccountRepositoryDB implements AccountRepository {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public void add(Account account)
	{
		et.begin();
		em.persist(account);
		et.commit();
	}
	
	public Account retrieve(int id)
	{
		return em.find(Account.class, id);
	}
	
	public Account updateFName(int id, String fName)
	{
		et.begin();
		Account account = retrieve(id);
		account.setFName(fName);
		et.commit();
		return account;
	}
	
	public void remove(int id)
	{
		et.begin();
		Account account = retrieve(id);
		em.remove(account);
		et.commit();
	}

}
