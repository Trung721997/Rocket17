package com.vti.backend;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import Quan_Ly_Can_Bo.Can_Bo;
import Quan_Ly_Can_Bo.Can_Bo.Gioi_Tinh;
import Quan_Ly_Can_Bo.CapCongNhan;
import Quan_Ly_Can_Bo.CapCongNhan.Level;
import Quan_Ly_Can_Bo.CapKySu;
import Quan_Ly_Can_Bo.CapKySu.NganhDaoTao;
import Quan_Ly_Can_Bo.CapNhanVien;
import Quan_Ly_Can_Bo.CapNhanVien.CongViec;
import ex5.HighSchoolStuden;
import ex5.Person;

public class Exercise5 {
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Can_Bo> arrayCongNhan = new ArrayList<Can_Bo>();
	static ArrayList<Can_Bo> arrayKySu = new ArrayList<Can_Bo>();
	static ArrayList<Can_Bo> arrayNhanVien = new ArrayList<Can_Bo>();

	public  void Question2() {
		while (true) {
			System.out.println("==========================MENU==================================||");
			System.out.println("||	Chọn 1: Thêm mới cán bộ										||");
			System.out.println("||	Chọn 2: Tìm kiếm theo họ tên								||");
			System.out.println("||	Chọn 3: Hiện thị thông tin về danh sách các cán bộ			||");
			System.out.println("||	Chọn 4: Nhập vào tên của cán bộ và delete cán bộ đó			||");
			System.out.println("||	Chọn 5: Đăng xuất											||");
			System.out.println("||==============================================================||");
			System.out.println("Mời bạn chọn chức năng");
			String chonSoChucNang = scanner.nextLine();
			int nhapSoChucNang = Integer.parseInt(chonSoChucNang);
			switch (nhapSoChucNang) {
			case 1:
				themCanBoMoi();
				break;					
			case 2:
				timKiemTheoHoTen();
				break;
			case 3:
				 hienThiThongTinCanBo();				
				break;
		//	case 4:
			//	timVaXoaCanBo();
			//	break;
			case 5:
				System.out.println("thoát khỏi chương trình");
				return;
			default:
				System.out.println("Bạn đã nhập sai cú pháp mời bạn nhập lại: ");
				break;
			}
		}
	}

// Thêm cái bộ mới -------------------------------------------------------------		
	public void themCanBoMoi() {
		while (true) {
			System.out.println("Chọn chức năng thêm cán bộ: " + "\n" 
								+ "1: Thêm công nhân" + "\n" 
								+ "2: Thêm kỹ sư"+ "\n"
								+ "3: Thêm nhân viên" + "\n" 
								+ "4: Thoát");
			int chucNang = scanner.nextInt();
			switch (chucNang) {
			case 1:
				String enter = scanner.nextLine();
				System.out.println("Nhập tên công nhân: ");
				String full_name = scanner.nextLine();

				System.out.println("Nhập tuổi: ");
				int tuoi = scanner.nextInt();

				String enter21 = scanner.nextLine();
				System.out.println("Chọn giới tính: " + "\n" 
									+ "1: Nam" + "\n" 
									+ "2: Nữ" + "\n" 
									+ "3: Khác");
				int gioitinh;
				Gioi_Tinh goiTinh = null;
				 do {
					 gioitinh = scanner.nextInt();
					 if(gioitinh == 1) {
						 goiTinh = Gioi_Tinh.NAM;
					 } else if(gioitinh == 2) {
						 goiTinh = Gioi_Tinh.NU;
					 } else if(gioitinh == 3) {
						 goiTinh = Gioi_Tinh.KHAC;
					 } else if(gioitinh >3) {
						 System.out.println("Sai cú pháp mời nhập lại");
				 	 }
					 }while(gioitinh > 3);
					 
				String enter1 = scanner.nextLine();
				System.out.println("Nhập địa chỉ: ");
				String diaChi = scanner.nextLine();

				String enter3 = scanner.nextLine();
				System.out.println("Chọn level: " + "\n" 
									+ "1: level_1" + "\n" 
									+ "2: level_2" + "\n"
									+ "3: level_3" + "\n"
									+ "4: level_4");
				int nhapLV;
				Level vl = null;
				do {
					nhapLV = scanner.nextInt();
					if(nhapLV == 1) {
						vl = Level.ONE;
					} else if(nhapLV == 2) {
						vl = Level.TWO;
					} else if(nhapLV == 3) {
						vl = Level.THREE;
					} else if(nhapLV == 4) {
						vl = Level.FOUR;
					} else if(nhapLV >4) {
						 System.out.println("Sai cú pháp mời nhập lại");
					}
					}while(nhapLV > 4);
					 
				CapCongNhan congNhan = new CapCongNhan(full_name, tuoi, goiTinh, diaChi, vl);
				arrayCongNhan.add(congNhan);
				System.out.println(congNhan);
				System.out.println("\n");
				locten();
				break;
			case 2:
				String enter4 = scanner.nextLine();
				System.out.println("Nhập tên kỹ sư: ");
				String full_name1 = scanner.nextLine();
				System.out.println("Nhập tuổi: ");
				int tuoi2 = scanner.nextInt();
				
				System.out.println("Chọn giới tính: " + "\n" 
									+ "1: Nam" + "\n" 
									+ "2: Nữ" + "\n" 
									+ "3: Khác");
				int gioitinh1;			
				Gioi_Tinh goiTinh1 = null;
				 do {
					 gioitinh1 = scanner.nextInt();
					 if(gioitinh1 == 1) {
						 goiTinh1 = Gioi_Tinh.NAM;
					 } else if(gioitinh1 == 2) {
						 goiTinh1 = Gioi_Tinh.NU;
					 } else if(gioitinh1 == 3) {
						 goiTinh1 = Gioi_Tinh.KHAC;
					 } else if(gioitinh1 > 3) {
						 System.out.println("Sai cú pháp mời nhập lại");
					 }
					 } while(gioitinh1 > 3);
					 
				String enter6 = scanner.nextLine();
				System.out.println("Nhập địa chỉ: ");
				String diaChi1 = scanner.nextLine();

				String enter7 = scanner.nextLine();
				System.out.println("Chọn ngành đào tạo: " + "\n" 
										+ "1: Ký sư điện" + "\n" 
										+ "2: IT" + "\n"
										+ "3: Tự động hóa" 
										+ "4: Điện điện tử");
				int nhapNH;
				NganhDaoTao ndt = null;
				do {
					nhapNH = scanner.nextInt();
					if(nhapNH == 1) {
						ndt = NganhDaoTao.KYSUDIEN;
					} else if(nhapNH == 2) {
						ndt = NganhDaoTao.IT;
					} else if(nhapNH == 3) {
						ndt = NganhDaoTao.TUDONGHOA;
					} else if(nhapNH == 4) {
						ndt = NganhDaoTao.DIENDIENTU;
					} else if(nhapNH > 4) {
						 System.out.println("Sai cú pháp mời nhập lại");
					}
					} while(nhapNH > 4);
				
				CapKySu kySu = new CapKySu(full_name1, tuoi2, goiTinh1, diaChi1, ndt);
				arrayKySu.add(kySu);
				System.out.println(kySu);
				System.out.println("\n");
				break;

			case 3:
				String enter8 = scanner.nextLine();
				System.out.println("Nhập tên nhân viên: ");
				String full_name2 = scanner.nextLine();

				System.out.println("Nhập tuổi: ");
				int tuoi3 = scanner.nextInt();
				
				String enter9 = scanner.nextLine();
				System.out.println("Chọn giới tính: " + "\n" + "1: Nam" + "\n" + "2: Nữ" + "\n" + "3: Khác");
				int gioitinh3;
				Gioi_Tinh goiTinh3 = null;
				 do {
					 gioitinh3= scanner.nextInt();
					 if(gioitinh3 == 1) {
						 goiTinh3 = Gioi_Tinh.NAM;
					 } else if(gioitinh3 == 2) {
						 goiTinh3 = Gioi_Tinh.NU;
					 } else if(gioitinh3 == 3) {
						 goiTinh3 = Gioi_Tinh.KHAC;
					 } else if(gioitinh3 > 3) {
						 System.out.println("Sai cú pháp mời nhập lại");
					 }
				 	 } while(gioitinh3 > 3);
					 
				String enter10 = scanner.nextLine();
				System.out.println("Nhập địa chỉ: ");
				String diaChi2 = scanner.nextLine();

				String enter11 = scanner.nextLine();
				System.out.println("Chọn công việc: " + "\n" 
										+ "1: Hàn điện" + "\n" 
										+ "2: Điều khiển máy" + "\n"
										+ "3: Cấp đồ" 
										+ "4: Vệ sinh");
				int nhapCV;
				CongViec cv = null;
				do {
					nhapCV = scanner.nextInt();
					if(nhapCV == 1) {
						cv = CongViec.HANDIEN;
					} else if(nhapCV == 2) {
						cv = CongViec.DIEUKHIENMAY;
					} else if(nhapCV == 3) {
						cv = CongViec.CAPDO;
					} else if(nhapCV == 4) {
						cv = CongViec.DONVESINH;
					} else if(nhapCV > 4) {
						 System.out.println("Sai cú pháp mời nhập lại");
					}
					} while(nhapCV > 4);

				CapNhanVien nhanVien = new CapNhanVien(full_name2, tuoi3, goiTinh3, diaChi2, cv);
				arrayNhanVien.add(nhanVien);
				System.out.println(nhanVien);
				System.out.println("\n");
				break;

			case 4:
				System.out.println("Bạn đã thoát chương trình thêm thông tin cán bộ");
				return;
			default:
				System.out.println("Nhập sai cú pháp xin nhập lại");
				System.out.println("\n");
				break;
			}
		}
	}
	
	
// TIỀM KIẾM CÁN BỘ THEO TÊM --------------------------------------------------
	public void timKiemTheoHoTen() {
		while (true) {
			System.out.println("Chọn 1 để tìm kiếm công nhân" + "\n" + "2 để tìm kiếm kỹ sư" + "\n"
					+ "3 để tìm kiếm nhân viên" + "\n" + "4 để thoát");
			int chon = scanner.nextInt();

			switch (chon) {
			case 1:
				String ent1 = scanner.nextLine();
				System.out.println("Nhập họ tên của công nhân cần tìm: ");
				String nhapHoTenCongNhan = scanner.nextLine();
				for (Can_Bo canBoCongNhan : arrayCongNhan) {
					if (canBoCongNhan.getFullName().equals(nhapHoTenCongNhan)) {
						System.out.println(canBoCongNhan);
						System.out.println("\n");
					} else
						System.out.println("không có trong dnah sách");
					System.out.println("\n");
				}
				break;

			case 2:
				String ent2 = scanner.nextLine();
				System.out.println("Nhập họ tên của công nhân cần tìm: ");
				String nhapHoTenKySu = scanner.nextLine();
				for (Can_Bo canBoKySu : arrayKySu) {
					if (canBoKySu.getFullName().equals(nhapHoTenKySu)) {
						System.out.println(canBoKySu);
						System.out.println("\n");
					} else
						System.out.println("không có trong dnah sách");
					System.out.println("\n");
				}			
				break;
			case 3:
				String ent3 = scanner.nextLine();
				System.out.println("Nhập họ tên của công nhân cần tìm: ");
				String nhapHoTenNhanVien = scanner.nextLine();
				for (Can_Bo canBoNhanVien : arrayNhanVien) {
					if (canBoNhanVien.getFullName().equals(nhapHoTenNhanVien)) {
						System.out.println(canBoNhanVien);
						System.out.println("\n");
					} else
						System.out.println("không có trong dnah sách");
					System.out.println("\n");
				}
				break;
			case 4:
				System.out.println("Thoát");
				return;
			default:
				System.out.println("Bạn đã nhập sai cú pháp, mời nhập lại: ");
				break;
			}
		}

	}

	
// HIỂN THỊ THÔNG TIN CÁN BỘ----------------------------------------------------
		public void hienThiThongTinCanBo() {
			System.out.println("Chọn 1 để hiển thị thông tin Công Nhân" + "\n"
								+	"2 để hiển thị thông tin Kỹ sư" + "\n"
								+ 	"3 để hiển thị thông tin Nhân Viên" + "\n"
								+	"4 thoat");
			int nhapChon  = scanner.nextInt();
			switch(nhapChon) {
			case 1: 
				System.out.println("Thông tin của tất cả các Công Nhân");
				for (Can_Bo canBoCN : arrayCongNhan) {
				System.out.println(canBoCN);
				System.out.println("\n");					
				}
				break;
			case 2: 
				System.out.println("Thông tin của tất cả các Kỹ Sư");
				for (Can_Bo canBoKS : arrayKySu) {
				System.out.println(canBoKS);
				System.out.println("\n");
				}
				break;
			case 3: 
				System.out.println("Thông tin của tất cả các Kỹ Sư");
				for (Can_Bo canBoNV : arrayNhanVien) {
				System.out.println(canBoNV);
				System.out.println("\n");
				}
				break;
			case 4:
				System.out.println("Thoát");
				return;
			default:
				System.out.println("Sai cú pháp mời hập lại");
				break;	
			}
		}

		public void locten() {
			arrayCongNhan.sort(Comparator.comparing(Can_Bo::getFullName));
		}
		
		
// TÌM VÀ XÓA THÔNG TIN CÁN BỘ--------------------------------------------------	
//				public static void timVaXoaCanBo() {
//					while (true) {
//			System.out.println("Chọn 1 để tiếp tục, chọn 0 để thoát");
//			int chon = scanner.nextInt();
//			switch (chon) {
//			case 1:
//				String ent1 = scanner.nextLine();
//				System.out.println("Nhập tên nhân viên cần truy vấn: ");
//				String nhapHoTen = scanner.nextLine();
//				// array.removeIf(Can_Bo -> Can_Bo.getFullName().equals(nhapHoTen));
//				break;
//			case 0:
//				System.out.println("Đã thoát");
//				return;
//			default:
//				System.out.println("Bạn đã nhập sai cú pháp, mời nhập lại: ");
//				break;
//			}
//		}
//}
		
		public static void Question3() {

			ArrayList<Person> array1 = new ArrayList<Person>();
			HighSchoolStuden HSS = new HighSchoolStuden("Nguyễn Văn Trung", 1, "Chuyên Toán", "Đại học quốc gia");
			array1.add(HSS);
			HighSchoolStuden HSS1 = new HighSchoolStuden("Nguyễn Văn Cường", 2, "Chuyên Văn", "Đại học quốc gia");
			array1.add(HSS1);
			HighSchoolStuden HSS2 = new HighSchoolStuden("Nguyễn Văn Thức", 3, "Chuyên L", "Đại học quốc gia");
			array1.add(HSS2);
		}
	}

