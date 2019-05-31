package com.qa.app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

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

	public void createWithTasks(Account a) 
	{
		et.begin();
		em.persist(a);
		et.commit();
	}

	public List<Account> retrieveByName(String name) 
	{
		TypedQuery<Account> q = em.createQuery("Select acc from Account acc where acc.fName = '" + name + "'",
				Account.class);
		List<Account> a = q.getResultList();

		for (Account account : a) {
			System.out.println(account.getFName());
		}
		return a;
	}

}
