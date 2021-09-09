package Back_end;

import Entity.eq2_Student;
import Font_end.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise2 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<eq2_Student> eq2_studentArrayList = new ArrayList<eq2_Student>();

    public int Number() {
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
    //--------------------------
    public float Diem() {
        while (true) {
            String nhap1 = scanner.next();
            String nhap2 = nhap1.trim();
            try {
                float nhap3 = Float.parseFloat(nhap2);
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
    //--------------------------
    public String ngaySinh() {
        while (true) {
            String ngaySinh = scanner.nextLine();
            Pattern p = Pattern.compile("^[0-9]{2}/[0-9]{2}/[0-9]{4}$");
            if (p.matcher(ngaySinh).find()) {
                return ngaySinh;
            } else {
                System.out.println("Sai định dạng nhập lại");
            }
        }
    }


    public void Question1() {
        themThongTinStudent();

        Collections.sort(eq2_studentArrayList);
//      Collections.sort(eq2_studentArrayList, new comparator());

        for (eq2_Student stu:eq2_studentArrayList) {
            System.out.println(stu);
        }
    }

    public void themThongTinStudent() {
        while (true) {
            System.out.println("-------------------------");
            System.out.println("|   Chọn 1 để tiếp tục  |");
            System.out.println("|   Chọn 2 để thoát     |");
            System.out.println("-------------------------");
            System.out.print("Chọn Chức Năng: ");
            int chonChucNang = Number();
            switch (chonChucNang) {
                case 1:
                    System.out.print("Nhập ID student: ");
                    int id = Number();
                    String enter = scanner.nextLine();
                    System.out.print("Nhập FullName student: ");
                    String fullName = scanner.nextLine();
                    String fullName1 = fullName.trim();
                    int so = fullName1.lastIndexOf(" ");
                    String name = fullName1.substring(so + 1);
                    String lastName = fullName1.substring(0, so);
                    System.out.print("Nhập ngày sinh student theo dạng dd/MM/yyyy: ");
                    String ngaySinh = ngaySinh();
                    System.out.print("Nhập điểm student: ");
                    float diem = Diem();
                    eq2_Student student = new eq2_Student(id, lastName, name, fullName1, ngaySinh, diem);
                    eq2_studentArrayList.add(student);
                    break;
                case 2:
                    System.out.println("Đã thoát");
                    return;
                default:
                    System.out.println("Sai cú pháp, nhập lại");
                    break;
            }
        }
    }



}
