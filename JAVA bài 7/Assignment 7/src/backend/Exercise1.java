package backend;

import java.util.ArrayList;
import java.util.Scanner;

import Entity.Que1_2_Student;
import Entity.Que3_MyMath;
import Entity.Question7;

public class Exercise1 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Que1_2_Student> arrayStudent = new ArrayList<Que1_2_Student>();
    static Que1_2_Student stu = new Que1_2_Student();
    // static int nhap;

    public void Question1() {
        thongTinSinhVien();
        System.out.println("------------------------------------------");
        for (Que1_2_Student student : arrayStudent) {
            System.out.println(student);
            System.out.println("Tổng tiền quỹ của lớp: " + Que1_2_Student.getTienQuyLop());
           System.out.println("Trường: " + Que1_2_Student.getCollege());
            System.out.println("-------------------");
        }
        String enter = scanner.nextLine();
        System.out.println("Nhập tên trường cần chuyển");
        String tenTruong = scanner.nextLine();
        Que1_2_Student.setCollege(tenTruong);
        for (Que1_2_Student student : arrayStudent) {
            System.out.println(student);
        }
        System.out.println("------------------------------------------");

        System.out.println("Nhập msv học sinh đi mua bim bim và kẹo");
        int id1 = scanner.nextInt();
        for (Que1_2_Student student : arrayStudent) {
            if (student.getMsv() == id1) {
                System.out.println("Nhập số tiền đi mua bim bim và kẹp");
                int soTien = scanner.nextInt();
                student.muaBBvaKeo(soTien);
            }
        }
        System.out.println("-------------------");
        System.out.println("Nhập msv học sinh đi mua bánh mỳ");
        int id2 = scanner.nextInt();
        for (Que1_2_Student student : arrayStudent) {
            if (student.getMsv() == id2) {
                System.out.println("Nhập số tiền đi mua bánh mỳ");
                int soTien = scanner.nextInt();
                student.muaBanhMy(soTien);
            }
        }
        System.out.println("-------------------");
        System.out.println("Nhập msv học sinh đi mua đồ dùng học tập");
        int id3 = scanner.nextInt();
        for (Que1_2_Student student : arrayStudent) {
            if (student.getMsv() == id3) {
                System.out.println("Nhập số tiền đi mua đồ dùng học tập");
                int soTien = scanner.nextInt();
                student.muaDoDungHocTap(soTien);
            }
        }
        System.out.println("Tiền quỹ còn lại: " + Que1_2_Student.getTienQuyLop());
        System.out.println("------------------------------------------");
        System.out.println("Tiền quỹ gần hết yêu cầu mỗi sinh viên đóng thêm ...k");
        int k1 = scanner.nextInt();
        int tienQuyLop1 = (k1 * arrayStudent.size());
        Que1_2_Student student = new Que1_2_Student();
        student.dongThemTienQuy(tienQuyLop1);
        System.out.println("Tổng quỹ sau khi đóng: " + Que1_2_Student.getTienQuyLop());
        System.out.println("Số lượng Student: " + arrayStudent.size());
        System.out.println("\n");
    }

    public void thongTinSinhVien() {
        while (true) {
            System.out.println("Chọn 1 để tiếp tục, 2 để thoát");
            int nhapSo = scanner.nextInt();
            switch (nhapSo) {
                case 1:
                    String enter = scanner.nextLine();
                    System.out.println("Nhập msv");
                    int msv = scanner.nextInt();
                    String enter1 = scanner.nextLine();
                    System.out.println("Nhập tên sinh viên");
                    String ten = scanner.nextLine();
                    System.out.println("Nhập nghành học");
                    String nghanhHoc = scanner.nextLine();
                    System.out.println("Nhập khóa học năm");
                    String khnam = scanner.nextLine();
                    System.out.println("Đóng tiền quỹ lớp");
                    int dongTienQuy = scanner.nextInt();
                    Que1_2_Student student = new Que1_2_Student(msv, ten, nghanhHoc, khnam, dongTienQuy);
                    stu.tienQuyLop(dongTienQuy);
                    arrayStudent.add(student);
                    System.out.println("-------------------");
                    break;
                case 2:
                    System.out.println("Thoát");
                    return;
                default:
                    System.out.println("Sai cú pháo, nhập lại");
                    break;
            }
        }
    }

//--------------------------------------------------------------------------

    public void minMax() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("Nhập giá trị cho a");
        int a = scanner.nextInt();
        System.out.println("Nhập giá trị cho b");
        int b = scanner.nextInt();
        Que3_MyMath ex1_que3 = new Que3_MyMath();
        ex1_que3.layMax(a, b);
        ex1_que3.layMin(a, b);
        ex1_que3.laySum(a, b);

    }

    // -----------------------------------------------------------------------------
    public int So() {
        while (true) {
            String nhap1 = scanner.next();
            String nhap2 = nhap1.trim();
            try {
                int nhap3 = Integer.parseInt(nhap2);
                if (nhap3 > 0) {
                    return nhap3;
                } else if (nhap3 == 0) {
                    System.out.println("Sai cú pháp, nhập lại");
                }
            } catch (Exception e) {
                System.out.println("Sai cú pháp, nhập lại");
            }
        }
    }

    public void user() {
        ArrayList<Question7> question7ArrayList = new ArrayList<Question7>();
        while (true) {
            System.out.println("1 tiếp tục");
            System.out.println("2 in thông tin");
            System.out.println("3 thoát");
            int chon = So();
            switch (chon) {
                case 1:
                    String enter = scanner.nextLine();
                    int[] id = new int[7];
                    for (int i = 0; i < id.length; i++) {

                        System.out.print("Nhập msv: ");
                        int msv = So();
                        String enter1 = scanner.nextLine();
                        System.out.print("Nhập name: ");
                        String name = scanner.nextLine();
                        Question7 question7 = new Question7(msv, name);
                        question7ArrayList.add(question7);
                    }
                    break;
                case 2:
                    for (Question7 question7 : question7ArrayList) {
                        System.out.println("Thông tin");
                        System.out.println(question7);
                    }
                case 3:
                    System.out.println("Đã thoát");
                    return;
                default:
                    System.out.println("Sai cú pháp nhập lại");
                    break;
            }
        }
    }


}
	
	


