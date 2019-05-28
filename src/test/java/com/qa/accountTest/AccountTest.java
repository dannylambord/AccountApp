package com.qa.accountTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.qa.app.Account;
import com.qa.app.AccountRepositoryMap;



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
		AccountRepositoryMap arm = new AccountRepositoryMap();
		int id = 2;
		account.setID(id);
		account.setFName("Danny");
		arm.add(account);
		Account retrieved = arm.retrieve(2);
		assertEquals("Wrong account retrieved", "Danny", retrieved.getFName());
		assertSame("Wrong account", account, retrieved); //checks that account and retrieved are the same 
		
		
	}
	

}
