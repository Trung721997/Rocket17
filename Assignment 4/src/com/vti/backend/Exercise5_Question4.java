package com.vti.backend;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import ex5_Question4.Book;
import ex5_Question4.Magazine;
import ex5_Question4.Newspaper;
import ex5_Question4.ThuVien;

public class Exercise5_Question4 {
	static Scanner scanner = new Scanner(System.in);
	static	Random random = new Random();
	static ArrayList<ThuVien> listDanhSach = new ArrayList<ThuVien>();
	public static void chuongTrinh() {
		while(true) {
		System.out.println("Mời bạn chọn các chức năng:" + "\n"
				+"1) Thêm mới tài liêu: Sách, tạp chí, báo"  + "\n"
				+"2) Xoá tài liệu theo mã tài liệu"  + "\n"
				+"3) Hiện thị thông tin về tài liệu"  + "\n"
				+"4) Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo" + "\n"
				+"5) Thoát khỏi chương trình");
		int nhapChuongTrinh = scanner.nextInt();
		switch(nhapChuongTrinh) {
		case 1:
			themTaiLieuMoi();
			break;
		case 2:
		case 3:
			hienThongTinVeTaiLieu();
			break;
		case 4:
			tiemKiemtaiLieu();
			break;
		case 5:	
			System.out.println("Bạn đã thoát chương trình");
			return;
		default:
			System.out.println("Bạn nhập sai cú pháp mời bạn nhập lại");
			break;
		}
		System.out.println("\n");
		}
	}
		
	public static void themTaiLieuMoi() {
		while(true) {
		System.out.println("Mời bạn chọn chức năng: " + "\n"
							+ "1: thêm thông tin sách: " + "\n"
							+ "2: thêm thông tin tạp chí: " + "\n"
							+ "3: thêm thông tin bác: " + "\n"
							+ "4: thoát");
		int nhapSo0 = scanner.nextInt();
		switch(nhapSo0) {
		case 1:
			
			System.out.println("Mã sách: ");
			int maSach = random.nextInt(100);
			String enter = scanner.nextLine();
			System.out.println("Tên nhà xuất bản sách: ");
			String tenNhaXuatbanSach = scanner.nextLine();
			System.out.println("Số bản phát hành sách: ");
			int soBanPhatHanhSach = scanner.nextInt();
			String enter0 = scanner.nextLine();
			System.out.println("Tên tác giả sách: ");
			String tenTacGiaSach = scanner.nextLine();
			System.out.println("Số trang sách: ");
			int soTrangSach = scanner.nextInt();
			
			Book book = new Book(maSach, tenNhaXuatbanSach, soBanPhatHanhSach, tenTacGiaSach, soTrangSach);
			listDanhSach.add(book);	
			System.out.println(book);
			System.out.println("\n");
		break;
		case 2:		
			System.out.println("Mã tạp chí: ");
			int maTapChi = random.nextInt(100);
			String enter1 = scanner.nextLine();
			System.out.println("Tên nhà xuất bản tạp chí: ");
			String tenNhaXuatbanTC = scanner.nextLine();
			System.out.println("Số bản phát hành tạp chí: ");
			int soBanPhatHanhTC = scanner.nextInt();
			String enter2 = scanner.nextLine();
			System.out.println("Số phát hành tạp chí: ");
			int soPhatHanhTC = scanner.nextInt();
			System.out.println("Tháng phát hành tạp chí: ");
			int thangPhatHanhTC;
			do {
			thangPhatHanhTC = scanner.nextInt();
			if(thangPhatHanhTC > 0 && thangPhatHanhTC<13) {
			} else if (thangPhatHanhTC == 0 || thangPhatHanhTC >=13) {
				System.out.println("Nhập sai tháng , nhập lại");
			} 
			}while(thangPhatHanhTC == 0 || thangPhatHanhTC >=13 );		
			Magazine magazine = new Magazine(maTapChi, tenNhaXuatbanTC, soBanPhatHanhTC, soPhatHanhTC, thangPhatHanhTC);
			listDanhSach.add(magazine);
			System.out.println("\n");
			break;
		case 3:
			System.out.println("Mã báo: ");
			int maBao= random.nextInt(100);
			String enter3 = scanner.nextLine();
			System.out.println("Tên nhà xuất bản báo: ");
			String tenNhaXuatbanBao = scanner.nextLine();
			System.out.println("Số bản phát hành báo: ");
			int soBanPhatHanhBao = scanner.nextInt();
			String enter4 = scanner.nextLine();
			System.out.println("Ngày phát hành báo: ");
			int ngayPhatHanhBao;
			do {
				ngayPhatHanhBao = scanner.nextInt();
				if(ngayPhatHanhBao > 0 && ngayPhatHanhBao<32) {
				} else if (ngayPhatHanhBao == 0 || ngayPhatHanhBao >=32) {
					System.out.println("Nhập sai ngày , nhập lại");
				} 
				}while(ngayPhatHanhBao == 0 || ngayPhatHanhBao >=32 );
			Newspaper newspaper = new Newspaper(maBao, tenNhaXuatbanBao, soBanPhatHanhBao, ngayPhatHanhBao);
			listDanhSach.add(newspaper);
			System.out.println("\n");
			break;
		case 4:
			System.out.println("bạn đã thoát");
			System.out.println("\n");
			return;
		default: 
			System.out.println("Bạn đã nhập sai cú pháp, mời nhập lại: ");
			System.out.println("\n");
			break;
		}
		}
	}
	
	public static void hienThongTinVeTaiLieu() {
		for (ThuVien thuVien : listDanhSach) {
			System.out.println(thuVien);
			System.out.println("\n");
		}		
	}
	
	public static void tiemKiemtaiLieu() {
		while(true) {
		System.out.println("Nhập 1 để tiếp tục, nhập 2 để thoát: ");
		int nhapSo = scanner.nextInt();
		switch(nhapSo) {
		case 1:
		System.out.println("Nhập tên sách, tạp chí, báo cần tiềm: ");
		String ten = scanner.nextLine();				
		for (ThuVien thuVien : listDanhSach) {
			if(thuVien.getNameSupplier().equals(ten)) {
				System.out.println(thuVien);
				System.out.println("\n");
			} else 
				System.out.println("Sách, tạp chí, báo này " + ten + " không có trong thư viện");
		}
		break;
		case 2:
			System.out.println("Bạn đã thoát");
			System.out.println("\n");
			return;
		default: 
			System.out.println("Bạn đã nhập sai cú pháp, nhập lại");
			System.out.println("\n");
			break;
		}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
