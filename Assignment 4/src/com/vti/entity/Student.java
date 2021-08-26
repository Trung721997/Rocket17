package com.vti.entity;

import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private String hometown;
	private float diemHocLuc;
	private String danhgiaHocLuc;


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

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	
	public float getDiemHocLuc() {
		return diemHocLuc;
	}

	public void setDiemHocLuc(float diemHocLuc) {
		this.diemHocLuc = diemHocLuc;
	}

	public void themDiem(float diemCongThem) {
		this.diemHocLuc += diemCongThem;
	}
	
	public Student() {	
	}
	
	public Student(int id, String name, String hometown){
		this.id = id;
		this.name = name;
		this.hometown = hometown;
		this.diemHocLuc = 0;
	}
	
	public Student(int id, String name, String hometown, float diemHocLuc){
		this.id = id;
		this.name = name;
		this.hometown = hometown;
		this.diemHocLuc = diemHocLuc;
	}
	
	public void danhGiaHocLuc() {
		if(diemHocLuc <= 4) {
			danhgiaHocLuc = "Học lực yếu";
		} else if(diemHocLuc <= 6) {
			danhgiaHocLuc = "Học lực Trung Bình";
		} else if(diemHocLuc < 8) {
			danhgiaHocLuc = "Học lực Khá";
		} else 
			danhgiaHocLuc = "Học lực Giỏi";
	}
	
	public String toString() {
//		String danhgiaHocLuc= null;
//		if(diemHocLuc <= 4) {
//			danhgiaHocLuc = "Học lực yếu";
//		} else if(diemHocLuc <= 6) {
//			danhgiaHocLuc = "Học lực Trung Bình";
//		} else if(diemHocLuc < 8) {
//			danhgiaHocLuc = "Học lực Khá";
//		} else 
//			danhgiaHocLuc = "Học lực Giỏi";
		return "ID: " + id + "\n" + "Name: " + name + "\n" + "Hometown: " +
					hometown + "\n" + "Điểm học lực: " + diemHocLuc + "\n" + 
		"Đánh giá học lực: " + danhgiaHocLuc;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
