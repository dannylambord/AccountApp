package com.qa.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String fName;
	private String lName;
	private int accNum;

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
