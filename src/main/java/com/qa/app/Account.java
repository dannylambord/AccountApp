package com.qa.app;

public class Account {

	int id;
	String fName;
	String lName;
	int accNum;

	public void setID(int id)
	{
		this.id = id;
	}
	
	public void setFName(String fName)
	{
		this.fName = fName;
	}
	
	public void setLName(String lName)
	{
		this.lName = lName;
	}
	
	public void setAccNum(int accNum)
	{
		this.accNum = accNum;
	}
	
	public int getID()
	{
		return id;
	}
	
	public String getFName()
	{
		return fName;
	}
	
	public String getLName()
	{
		return lName;
	}
	
	public int getAccNum()
	{
		return accNum;
	}

}
