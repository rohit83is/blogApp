package org.rohit.java.blogapp;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	
	private int id;
	private String name;
	private String UserName;
	private String password;
	
	public User()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String UserName) {
		this.UserName = UserName;
	}
	
	

}
