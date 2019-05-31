package com.qa.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Task {
	
	@Id
	@GeneratedValue
	int id;
	String todo;
	
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setToDo(String todo)
	{
		this.todo = todo;
	}
	
	public String getToDo()
	{
		return todo;
	}
	
	public int getID()
	{
		return id;
	}
	
	
	

}
