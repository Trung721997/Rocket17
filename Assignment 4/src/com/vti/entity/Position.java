package com.vti.entity;

public class Position {
	private int id;
	private PositionName name;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PositionName getName() {
		return name;
	}
	public void setName(PositionName name) {
		this.name = name;
	}
	public Position(int id, PositionName name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "ID: " + id + "\n" + "PositionName: " + name;		
	}

}
