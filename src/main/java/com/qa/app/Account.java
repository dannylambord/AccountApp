package com.qa.app;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	@Column(unique=true, length = 3000)
	private String fName;
	private String lName;
	private int accNum;
	
	@OneToMany(cascade=CascadeType.PERSIST , fetch=FetchType.LAZY)
	@JoinColumn(name = "Foreign_Key")
	Set<Task> tasks = new HashSet<Task>();   

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

	public Set<Task> getTasks() {
		return tasks;
	}

	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}

}
