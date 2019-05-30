package com.qa.app;

public interface AccountRepository {
	
	public void add(Account account);

	public Account retrieve( int id);
	
	public Account updateFName(int id, String FName);
	
	public void remove(int id);



}
