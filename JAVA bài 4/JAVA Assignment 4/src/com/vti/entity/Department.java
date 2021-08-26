package com.vti.entity;

public class Department {
	private int id;
	private String name;





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

	// Question 1:
	// Tao constructor cho department: 
	// a) không có parameters
	public Department(){	
	}
	
	// b) Có 1 parameter là nameDepartment và default id của Department = 0
	public Department(String name){
		this.id = 0;
		this.name = name;
	}
	public String toString() {
		return "ID: " + id + "\n" + "Name: " + name ;	
	}
}
