package com.vti.backend;
import java.util.Scanner;

import ex6_Question1.VietnamesePhone;
public class Exercise6_Question1 {
	VietnamesePhone snf = new VietnamesePhone();
	static Scanner scanner = new Scanner(System.in);
	public static void demoPhone() {
		System.out.println("Chọn 1 để thêm thông tin phone" + "\n"
							+ "2 để xóa thông tin phone" + "\n"
							+ "3 để update phone" + "\n"
							+ "4 để tìm kiếm phone");
		int chonSo = scanner.nextInt();
		switch(chonSo) {
		case 1:
			System.out.println("Mời bạn nhập sdt");
			int sdthoai = scanner.nextInt();
			System.out.println("Mời bạn nhập tên");
			String ten = scanner.nextLine();
			ex6_Question1.Contacts ContactsMoi = new ex6_Question1.Contacts(ten, sdthoai);
		}
		
		
		
	}
}
