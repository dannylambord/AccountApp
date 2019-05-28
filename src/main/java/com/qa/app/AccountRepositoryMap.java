package com.qa.app;

import java.util.HashMap;

public class AccountRepositoryMap {
	
	public HashMap<Integer,Account> map = new HashMap<Integer, Account>();
	
	public void add(Account account)
	{
		map.put(account.getID(), account);
	}
	
	public Account retrieve(int accNum)
	{
		return map.get(accNum);
		
	}

}
