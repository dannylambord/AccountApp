package com.qa.app;

public interface AccountRepository {
	
	public void add(Account account);
	public Account retrieve(int accNum);
}
