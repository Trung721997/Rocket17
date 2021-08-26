package com.vti.entity;

import java.time.LocalDate;

public class Group {
	private int id;
	private String name;
	private Account creator;
	private LocalDate createDate;
	private Account [] accounts;
	private String[] usernames;

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

	public Account getCreator() {
		return creator;
	}

	public void setCreator(Account creator) {
		this.creator = creator;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public Group(){	
	}
	
	public Group(String name, LocalDate createDate, Account [] accounts){
	this.name = name;
	this.createDate	= createDate;
	this.accounts = accounts;
	}
	
	public Group(String name, LocalDate createDate, Account [] accounts,String[] usernames ){
		this.name = name;
		this.createDate	= createDate;
		this.accounts = accounts;
		this.usernames = usernames;
		}
	

	public String toString() {
		return "ID: " + id + "\n" + "Name: " + name + "\n" + "CreateDate: " +
				createDate + "\n" + "Accounts: " + accounts + "\n" +  "Usernames: " + "usernames" ;
		
	}

}
 