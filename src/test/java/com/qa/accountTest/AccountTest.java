package com.qa.accountTest;

import static org.junit.Assert.*;

import javax.swing.text.TabableView;

import org.junit.Before;
import org.junit.Test;

import com.qa.app.Account;
import com.qa.app.AccountRepositoryDB;
import com.qa.app.AccountRepositoryMap;
import com.qa.app.Task;



public class AccountTest {

	
		
	
	@Test
	public void createID()
	{
		Account account = new Account();
		account.setID(0);
		int id = account.getID();
		assertEquals("Wrong ID", 0, id);
	}
		
		
		
	@Test
	public void createFName()
	{
		Account account = new Account();
		account.setFName("Danny");
		String firstName = account.getFName();
		assertEquals("Wrong first name", "Danny", firstName);
	}
	
	@Test
	public void createLName()
	{
		Account account = new Account();
		account.setLName("Lambord");
		String lastName = account.getLName();
		assertEquals("Wrong last name", "Lambord", lastName);
	}
	
	@Test
	public void createAccNum()
	{
		Account account = new Account();
		account.setAccNum(3);
		int accountNumber = account.getAccNum();
		assertEquals("Wrong acc number", 3, accountNumber);
	}
		
	@Test
	public void accountRepositoryMapTest()
	{
		Account account = new Account();
		AccountRepositoryDB arm = new AccountRepositoryDB();
		arm.add(account);
		int id = account.getID();
		Account retrieved = arm.retrieve(id);
		assertSame("Wrong account", account, retrieved); 
	}
	
	@Test
	public void DBupdate()
	{
		Account account = new Account();
		AccountRepositoryDB db = new AccountRepositoryDB();
		account.setFName("Adrian");
		db.add(account);
		int id = account.getID();
		db.updateFName(id, "Danny");
		String fName = account.getFName();
		assertEquals("Wrong name returned", "Danny", fName);
	}
	
	
	@Test
	public void DBdelete()
	{
		boolean x = false;
		Account account = new Account();
		AccountRepositoryDB db = new AccountRepositoryDB();
		db.add(account);
		int id = account.getID();
		db.retrieve(account.getID());
		db.remove(id);
		if (db.retrieve(id) == null)
		{
			x = true;
		}
		assertEquals("Wrong name returned", true, x);
	}
	
	@Test
	public void tasksAdd()
	{
		AccountRepositoryDB arDB = new AccountRepositoryDB();
		Account a = new Account();
		a.setFName("Hugo");
		Task t = new Task();
		t.setToDo("Dance");
		Task t2 = new Task();
		t2.setToDo("Dog");
		a.getTasks().add(t);
		a.getTasks().add(t2);
		arDB.createWithTasks(a);
	
	}
	
	@Test
	public void name()
	{
		AccountRepositoryDB arDB = new AccountRepositoryDB();
		//Account a = new Account();
		arDB.retrieveByName("Danny");
	}

}
