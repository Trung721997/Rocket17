package com.vti.entity;


import java.time.LocalDate;



public class Account {
	private int id;
	private String 	email;
	private String 	userName;
	private String	firstName;
	private String	lastName;
	private String 	fullName;
	private Department 	department;
	private Position 	position;
	private LocalDate 	createDate;
	private Group[] 	groups;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public Group[] getGroups() {
		return groups;
	}

	public void setGroups(Group[] groups) {
		this.groups = groups;
	}

	// Tạo constructor cho Account: 
		// a) Không có parameters
	public Account() {
	
	}
	
		// b) Có các parameter là id, Email, Username, FirstName, 
		// LastName (với FullName = FirstName + LastName)
		
	public Account(int id,	String 	email,	String 	userName,	
		String	firstName,String lastName, String 	fullName)	{
			this.id = id;
			this.email = email;
			this.userName = userName;
			this.firstName = firstName;
			this.lastName = lastName;
			this.fullName = fullName;	
			}
		
		// c) Có các parameter là id, Email, Username, FirstName, 
		// LastName (với FullName = FirstName + LastName) và 
		// Position của User, default createDate = now
	public Account(int id,	String 	email,	String 	userName,	
		String	firstName,String lastName, String 	fullName, Position	position){
			this.id	= id;
			this.email = email;
			this.userName = userName;
			this.firstName = firstName;
			this.lastName = lastName;
			this.fullName = fullName;
			this.position = position;
			this.createDate = LocalDate.now();
		}
		
		// d) Có các parameter là id, Email, Username, FirstName, 
		// LastName (với FullName = FirstName + LastName) và 
		// Position của User, createDate
	public Account(int id,	String 	email,	String 	userName,	
		String	firstName,String lastName, String 	fullName, Position	position,
		LocalDate	createDate){
			this.id	= id;
			this.email = email;
			this.userName = userName;
			this.firstName = firstName;
			this.lastName = lastName;
			this.fullName = fullName;
			this.position = position;
			this.createDate = createDate;
		}
		
	public String toString(){ 
			return	"id: " + id + "\n" + "email: " + email + "\n" +  "Username; "
		+ userName + "\n" + "FirstName: " + firstName + "\n" + "LastName: " + 
		lastName + "\n" + "LastName: " + lastName + "\n" + "Department: " 
		+  department + "\n" + "Position: " + position
		+ "\n" + "CreateDate: " +  createDate + "Group: " + groups;
		}
	
}
