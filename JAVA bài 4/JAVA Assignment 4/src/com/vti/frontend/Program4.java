package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.Exercise4;


public class Program4 {
	public static void main(String[] args) {
		while(true) {
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Nhập số để tiếp tục: " + "\n" 
							+ "1: Nhập thông tin sinh viên" + "\n"
							+ "2: Thoát ");
		int nhapSo = scanner.nextInt();
		
		switch (nhapSo) {
		case 1:
			com.vti.backend.Exercise4.thongTinStuden();
			break;
		case 2:
			System.out.println("Bạn đã thoát chương trình");
			return;
		default: System.out.println("Bạn đã nhập sai cú pháp mời bạn nhập lại.");
				 System.out.println("\n");
		break;
		}		
		}
		
		
	}

}
