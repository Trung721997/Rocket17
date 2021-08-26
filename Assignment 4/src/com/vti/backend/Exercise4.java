package com.vti.backend;
import java.util.Scanner;

import com.vti.entity.Student;



public class Exercise4 {
	static Student stu = new Student();
	public static void main(String[] args) {
		thongTinStuden();
	}
	public static void thongTinStuden() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập ID của sinh viên: ");
		int iD = scanner.nextInt();
		
		String enter = scanner.nextLine();
		System.out.println("Nhập name của sinh viên: ");
		String namE = scanner.nextLine();
		
		System.out.println("Nhập hometown của sinh viên: ");
		String homeTown = scanner.nextLine();
	
		
		System.out.println("Nhập điểm đầu vào cho sinh viên: ");
		float diemDauVao = scanner.nextInt();

		System.out.println("Nhập điểm cộng thê: ");	
		float diemCongThem = scanner.nextInt();		
		
		Student stu = new Student(iD, namE, homeTown, diemDauVao);
		stu.themDiem(diemCongThem);
		stu.danhGiaHocLuc();
		System.out.println("\n");
		

		System.out.println(stu);
		System.out.println("\n");
		System.out.println("\n");

		
	}
		
		
			
		
		
		




	
	
}
