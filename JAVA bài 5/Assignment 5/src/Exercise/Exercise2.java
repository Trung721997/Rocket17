package Exercise;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Exercise2_Question1.Student;
import Exercise2_Question2.GioiTinh;
import Exercise2_Question2.Person;
import Exercise2_Question2.Student1;

public class Exercise2 {
	static Scanner scanner = new Scanner(System.in);
	static Random random = new Random();
	static ArrayList<Student> arrayStudent = new ArrayList<Student>();
	static ArrayList<Student1> arrayStudent1 = new ArrayList<Student1>();

	//---------------------------------------------------------------------------------------
	public void question1() {
		themThongTin();
		chuongTrinh();
	}

	public void themThongTin() {
		while (true) {
			System.out.println("---------------Chọn------------------");
			System.out.println("|	Chọn 1: Thêm thông tin học sinh	|");
			System.out.println("|	Chọn 2: Thoát					|");
			System.out.println("-------------------------------------");
			System.out.println("Chọn chức năng");
			int chonChucNang = scanner.nextInt();
			switch (chonChucNang) {
				case 1:
					String enter = scanner.nextLine();
					System.out.println("Nhập tên học sinh");
					String ten = scanner.nextLine();
					System.out.println("Group gồm 3 nhóm: 0 1 2");
					int g = scanner.nextInt(3);
					int g1 = (g + 1);
					Student student = new Student(ten, g1);
					arrayStudent.add(student);
					break;
				case 2:
					System.out.println("Thoát");
					return;
				default:
					System.out.println("Sai cú pháp, nhập lại");
					break;
			}
		}
	}

	public void chuongTrinh() {
		while (true) {
			System.out.println("-----------------Chọn----------------");
			System.out.println("|	Chọn 1: Học sinh điểm danh		|");
			System.out.println("|	Chọn 2: Học sinh đi học bài		|");
			System.out.println("|	Chọn 3: Học sinh đi dọn vệ sinh	|");
			System.out.println("|	Chọn 4: Thoát					|");
			System.out.println("-------------------------------------");
			System.out.println("Chọn chức năng");
			int chonChucnang = scanner.nextInt();
			switch (chonChucnang) {
				case 1:
					System.out.println("Cả lớp điểm danh");
					for (Student student : arrayStudent) {
						student.diemDanh();
					}
					break;
				case 2:
					System.out.println("Chọn group đi học bài: 1 2 3");
					int g = scanner.nextInt();
					if (g == 1) {
						for (Student student : arrayStudent) {
							if (student.getGroup() == 1) {
								student.hocBai();
							}
						}
					} else if (g == 2) {
						for (Student student : arrayStudent) {
							if (student.getGroup() == 2) {
								student.hocBai();
							}
						}
					} else if (g == 3) {
						for (Student student : arrayStudent) {
							if (student.getGroup() == 3) {
								student.hocBai();
							}
						}
					}
					break;
				case 3:
					System.out.println("Chọn group đi học bài: 1 2 3");
					int g1 = scanner.nextInt();
					if (g1 == 1) {
						for (Student student : arrayStudent) {
							if (student.getGroup() == 1) {
								student.donVeSinh();
							}
						}
					} else if (g1 == 2) {
						for (Student student : arrayStudent) {
							if (student.getGroup() == 2) {
								student.donVeSinh();
							}
						}
					} else if (g1 == 3) {
						for (Student student : arrayStudent) {
							if (student.getGroup() == 3) {
								student.donVeSinh();
							}
						}
					}
					break;
				case 4:
					System.out.println("Thoát");
					return;
				default:
					System.out.println("Sai cú pháp, nhập lại");
					break;
			}
		}
	}


	//---------------------------------------------------------------------------------------
	public void question2() {
		while (true) {
			System.out.println("------------------Chọn------------------");
			System.out.println("|	Chọn 1: Thêm student				|");
			System.out.println("|	Chọn 2: Hiển thị danh sách student	|");
			System.out.println("|	Chọn 3: Học bổng					|");
			System.out.println("|	Chọn 4: Thoát						|");
			System.out.println("-----------------------------------------");
			System.out.println("Chọn chức năng");
			int chonChucnang = scanner.nextInt();
			switch (chonChucnang) {
				case 1:
					inputInfo();
					break;
				case 2:
					showInfo();
					break;
				case 3:
					hocBong();
					break;
				case 4:
					System.out.println("Thoát");
					break;
				default:
					System.out.println("Nhập sai cú pháp, nhập lại");
					break;
			}
		}
	}

	public void inputInfo() {
		while (true) {
			System.out.println("-----------------Chọn----------------");
			System.out.println("|	Chọn 1: Nhập thông tin			|");
			System.out.println("|	Chọn 2: Thoát					|");
			System.out.println("-------------------------------------");
			System.out.println("Chọn chức năng");
			int chonChucnang = scanner.nextInt();
			switch (chonChucnang) {
				case 1:
					String enter = scanner.nextLine();
					System.out.println("Nhập tên ");
					String ten = scanner.nextLine();
					System.out.println("-----------Chọn-----------");
					System.out.println("|	Chọn 0: NAM			 |");
					System.out.println("|	Chọn 1: NỮ			 |");
					System.out.println("|	Chọn 2: KHÁC		 |");
					System.out.println("--------------------------");
					int chon_gt;
					GioiTinh gioitinh = null;
					do{
						chon_gt = scanner.nextInt();
						if (chon_gt == 0){
							gioitinh = GioiTinh.NAM;
						} else if (chon_gt == 1) {
							gioitinh = GioiTinh.NU;
						}else if (chon_gt == 2) {
							gioitinh = GioiTinh.KHAC;
						}
					}while (chon_gt > 2);
					String enter1 = scanner.nextLine();
					System.out.println("Nhập ngày sinh theo dạng yyyy/MM/dd");
					String ngaySinh = scanner.nextLine();
					System.out.println("Nhập địa chỉ");
					String diaChi = scanner.nextLine();
					int msv = scanner.nextInt();
					System.out.println("Nhập diemtrungbinh");
					float diemTrungBinh = scanner.nextFloat();
					String enter2 = scanner.nextLine();
					System.out.println("Nhập email");
					String email = scanner.nextLine();
					Student1 student1 = new Student1(ten, gioitinh, ngaySinh, diaChi, diemTrungBinh, email);
					arrayStudent1.add(student1);
					System.out.println("--------------------------");
					break;
				case 2:
					System.out.println("Thoát");
					System.out.println("----------------------------------------------------");
					return;
				default:
					System.out.println("Nhập sai cú pháp, nhập lại");
					break;
			}
		}
	}

	public void showInfo(){
		System.out.println("Thông tin của tất cả person");
		for (Student1 student1:arrayStudent1){
			System.out.println(student1);
		}
	}

	public void hocBong() {
		for (Student1 student1:arrayStudent1){
			if (student1.getDiemTrungBinh() >= 8) {
				System.out.println("Student " + student1 + " được học bổng");
			}System.out.println("Student " + student1 + " không được học bổng");
		}
	}




}