package Quan_Ly_Can_Bo;

import java.util.ArrayList;

public class Can_Bo {
	private String fullName;
	private int age;
	private Gioi_Tinh goithinh;
	private String diaChi;
	

	public enum Gioi_Tinh {
		NAM,NU, KHAC
	}
	public Gioi_Tinh getGoithinh() {
		return goithinh;
	}
	public void setGoithinh(Gioi_Tinh goithinh) {
		this.goithinh = goithinh;
	}	
	public String getFullName() {
		return fullName;
	}
	public Can_Bo(String fullName, int age, Gioi_Tinh goithinh, String diaChi) {
		super();
		this.fullName = fullName;
		this.age = age;
		this.goithinh = goithinh;
		this.diaChi = diaChi;
	}
	
	
	
	public String toString() {
		return "FullName: " + fullName + "\n" + "Age: " + age + "\n" 
				+ "Goithinh: " + goithinh + "\n" + "DiaChi: " + diaChi;
		
	}

}
