package Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import Exercise1_Question_1.News;
import Exercise1_Question_1.INews;
import Exercise1_Question_2.ThongTinThiSinh;
import Exercise1_Question_2.ThongTinThiSinh.CacMonThi;
import Exercise1_Question_2.ThongTinThiSinh.TenKhoi;


public class Exercise1 {
	static Scanner scanner = new Scanner(System.in);

	// -------------------------------------------------------------------------
	// Question1: ---
	public void Question1_MyNews() {
		ArrayList<News> arrayListMyNews = new ArrayList<News>();
		while (true) {
			System.out.println("Mời bạn chọn số để vào chức năng: " + "\n" + "1	:Insert news" + "\n"
					+ "2	:View list news" + "\n" + "3	:Average rate" + "\n" + "4	:Exit");
			int i = scanner.nextInt();
			switch (i) {
			case 1:
				System.out.println("Nhập 1 để tiếp tục, nhập 2 để thoát: ");
				int nhap = scanner.nextInt();
				switch (nhap) {
				case 1:
					String enter = scanner.nextLine();
					System.out.println("Nhập giá trị cho Title: ");
					String title1 = scanner.nextLine();
					System.out.println("Nhập giá trị cho PublishDate: ");
					String publishDate1 = scanner.nextLine();
					System.out.println("Nhập giá trị cho Author: ");
					String author1 = scanner.nextLine();
					System.out.println("Nhập giá trị cho Content: ");
					String content1 = scanner.nextLine();
					System.out.println("Nhập đánh giá 1: ");
					int rates_1 = scanner.nextInt();
					System.out.println("Nhập đánh giá 2: ");
					int rates_2 = scanner.nextInt();
					System.out.println("Nhập đánh giá 3: ");
					int rates_3 = scanner.nextInt();
					int[] rates = { rates_1, rates_2, rates_2 };
					News news = new News(title1, publishDate1, author1, content1, rates);
					arrayListMyNews.add(news);
					System.out.println("Thông tin News: " + news);
					String enter1 = scanner.nextLine();
					System.out.println("\n");
					break;
				case 2:
					System.out.println("Bạn đã thoát");
					return;
				default:
					System.out.println("Bạn nhập sai cú pháp mời nhập lại: ");
					break;
				}
				break;
			case 2:
				for (News news : arrayListMyNews) {
					news.Display();
					System.out.println("\n");
				}
				break;
			case 3:
				for (News news : arrayListMyNews) {
					news.Calculate();
					System.out.println("Đánh giá trung bình: " + news.Calculate());
					news.Display();
					System.out.println("\n");
				}
				break;
			case 4:
				System.out.println("Bạn đã thoát");
				return;
			default:
				System.out.println("Bạn đã nhập sai cú pháp mời nhập lại: ");
				break;
			}
		}
	}


	// -------------------------------------------------------------------------
	public void Question2_TuyenSinh() {
		ArrayList<ThongTinThiSinh> arrayListThongTin = new ArrayList<ThongTinThiSinh>();
		while (true) {
			System.out.println("Bạn đã thoát" + "\n" + "1: Thêm mới thí sinh" + "\n"
					+ "2: Hiện thị thông tin của thí sinh và khối thi của thí sinh" + "\n"
					+ "3: Tìm kiếm theo số báo danh" + "\n" + "4: Thoát khỏi chương trình");
			int nhap1 = scanner.nextInt();
			switch (nhap1) {
			case 1:
				System.out.println("Nhập số báo danh: ");
				int sbd = scanner.nextInt();
				String enter1 = scanner.nextLine();
				System.out.println("Nhập họ tên thí sinh: ");
				String hoTen = scanner.nextLine();
				System.out.println("Nhập đia chỉ: ");
				String diaChi = scanner.nextLine();
				System.out.println("Nhập mức ưu tiên 1,2,3: ");
				int mucUuTien;
				do {
					mucUuTien = scanner.nextInt();
					if (mucUuTien >= 4) {
						System.out.println("nhap lai");
					}
				} while (mucUuTien >= 4);
				
				System.out.println("Nhập 1 để chọn khối A, Toán + Lý + Hóa" + "\n"
						+ "	2 để chọn khối B, Toán + Hóa + Sinh" + "\n" 
						+ "	3 để chọn khối C, Văn + Sử + Địa");
				int nhapChon;
				TenKhoi tenKhoiThi = null;
				CacMonThi cacMon = null;
				do {
					nhapChon = scanner.nextInt();
					if(nhapChon == 1) {
						tenKhoiThi = TenKhoi.A;
						cacMon = CacMonThi.TOAN_LY_HOA;
					} else if(nhapChon == 2) {
						tenKhoiThi = TenKhoi.B;
						cacMon = CacMonThi.TOAN_HOA_SINH;
					} else if(nhapChon == 3) {
						tenKhoiThi = TenKhoi.C;
						cacMon = CacMonThi.VAN_SU_DIA;
					} else System.out.println("Nhập sai cú pháp mời nhập lại");
					
				} while(nhapChon > 3);
				ThongTinThiSinh thogTin = new ThongTinThiSinh(sbd, hoTen, diaChi, mucUuTien, tenKhoiThi, cacMon);
				arrayListThongTin.add(thogTin);
				System.out.println(thogTin);
				break;
			case 2:
				for (ThongTinThiSinh thongTinThiSinh : arrayListThongTin) {
					System.out.println(thongTinThiSinh);
					System.out.println("\n");
				}
				break;
			case 3:
				System.out.println("Nhập số báo danh cần tìm: ");
				int nhapSoBaoDanh = scanner.nextInt();
				for (ThongTinThiSinh thongTinThiSinh : arrayListThongTin) {
					if (nhapSoBaoDanh == thongTinThiSinh.getSbd()) {
						System.out.println(thongTinThiSinh);
					} else
						System.out.println("Không có thí sinh nào có số báo danh này: " + nhapSoBaoDanh);
				}

			}

		}
	}

}
