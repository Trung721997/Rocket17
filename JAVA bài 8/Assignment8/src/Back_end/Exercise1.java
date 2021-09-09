package Back_end;

import Entity.eq1_Student;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.*;

public class Exercise1 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<eq1_Student> eq1_studentArrayList = new ArrayList<eq1_Student>();
    static Stack<Object> stack = new Stack<Object>();
    static Set<Object> setA = new HashSet<Object>();
    //   static Queue<Object> queue = (Queue<Object>) new HashSet<Object>();


    public int Number(){
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

    public void Question1(){
       themThongTinStudent();
        System.out.println("Câu a: Hiển thị số lượng student-----------------------------------------------------");
        System.out.print("Tổng số student: " + eq1_studentArrayList.size());
        System.out.println("\n");

        System.out.println("Câu b: Hiển thị thông tin student thứ 4----------------------------------------------");
        System.out.println("Thông tin student thứ 4. " + eq1_studentArrayList.get(3).toString());
        System.out.println("\n");

        System.out.println("Câu c: Hiển thị thông tin student đầu và cuối-----------------------------------------");
        System.out.println("Thông tin student thứ nhất. " + eq1_studentArrayList.get(0).toString());
        System.out.println("Thông tin student cuối cùng. " + eq1_studentArrayList.get(eq1_studentArrayList.size()-1).toString());
        System.out.println("\n");

        System.out.println("Câu d: Chèn thêm 1 student vào đầu danh sách------------------------------------------");
        System.out.print("Nhập ID student: ");
        int id = Number();
        String enter = scanner.nextLine();
        System.out.print("Nhập FullName student: ");
        String fullName = scanner.nextLine();
        eq1_Student student = new eq1_Student(id, fullName);
        eq1_studentArrayList.add(0,student);
        for (eq1_Student stu:eq1_studentArrayList) {
            System.out.println("Danh sách student mới thêm là.");
            System.out.println(stu);
        }
        System.out.println("\n");

        System.out.println("Câu e: Chèn 1 student vào cuối danh sách---------------------------------------------");
        System.out.print("Nhập ID student: ");
        int id1 = Number();
        String enter1 = scanner.nextLine();
        System.out.print("Nhập FullName student: ");
        String fullName1 = scanner.nextLine();
        eq1_Student student1 = new eq1_Student(id1, fullName1);
        eq1_studentArrayList.add(student1);
        for (eq1_Student stu:eq1_studentArrayList) {
            System.out.println("Danh sách student khi thêm lần 2");
            System.out.println(stu);
        }
        System.out.println("\n");

        System.out.println("Câu f: Đảo ngược sắp xếp của danh sách-----------------------------------------------");
        Collections.reverse(eq1_studentArrayList);
        for (eq1_Student stu:eq1_studentArrayList) {
            System.out.println("Mảng đảo ngược");
            System.out.println(stu);
        }
        System.out.println("\n");

        System.out.println("Câu g: Tìm thông tin student theo id-------------------------------------------------");
        System.out.println("\n");

        System.out.println("Câu i: Tìm thông tin student theo FullName--------------------------------------------");
        timStudentTheoFullName();
        System.out.println("\n");

        System.out.println("Câu i: Tìm thông tin student theo name------------------------------------------------------------");
//        timStudentTheoName();
        System.out.println("\n");

        System.out.println("Câu i: Xóa thông tin student theo id------------------------------------------------------------");
        xoaStudentTheoID();
        System.out.println("\n");

        System.out.println("Câu i: Xóa thông tin student theo FullName------------------------------------------------------------");
        xoaStudentTheoFullName();
        System.out.println("\n");
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
                    eq1_Student student = new eq1_Student(id, fullName);
                    eq1_studentArrayList.add(student);
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

    public void timStudentTheoID(){
        System.out.print("Nhập id Student cần tìm: ");
        int id = Number();
        for (eq1_Student stu:eq1_studentArrayList){
            if (stu.getId() ==  id){
                System.out.println("Thông tin student có id =  " + id +" là");
                System.out.println(stu);
            }
        }
    }

    public void timStudentTheoFullName(){
        String enter = scanner.nextLine();
        System.out.print("Nhập FullName Student cần tìm: ");
        String ten = scanner.nextLine();
        System.out.println("Thông tin student có tên là: " + ten);
        for (eq1_Student stu:eq1_studentArrayList){
            if (stu.getName().equals(ten) ){
                System.out.println(stu);
            } else {
                System.out.println("Không có student này trong danh sách.");
            }
        }
    }

    public void timStudentTheoName(){
        String enter = scanner.nextLine();
        System.out.print("Nhập name Student cần tìm: ");
        String ten = scanner.nextLine();
        System.out.println("Thông tin student có tên là: " + ten);
        for (eq1_Student stu:eq1_studentArrayList){
           int khoangTrangCuoi =  stu.getName().lastIndexOf(" ");
           String name = stu.getName().substring(khoangTrangCuoi + 1);
            if (name.equals(ten) ){
                System.out.println(stu);
            } else {
                System.out.println("Không có student này trong danh sách.");
            }
        }
    }

    public void xoaStudentTheoID() {
        String enter = scanner.nextLine();
        System.out.print("Nhập ID Student cần xóa: ");
        int so = Number();
        for (int i = 0; i < eq1_studentArrayList.size(); i++) {
            if (eq1_studentArrayList.get(i).getId() == so) {
                eq1_studentArrayList.remove(i);
                System.out.println("Đã xóa student có id = " + so);
            } else {
                System.out.println("Không có student này trong danh sách.");
            }
        }
    }

    public void xoaStudentTheoFullName() {
        String enter = scanner.nextLine();
        System.out.print("Nhập ID Student cần xóa: ");
        String name = scanner.nextLine();
        for (int i = 0; i < eq1_studentArrayList.size(); i++) {
            if (eq1_studentArrayList.get(i).getName().equals(name)) {
                eq1_studentArrayList.remove(i);
                System.out.println("Đã xóa student có name là " + name);
            } else {
                System.out.println("Không có student này trong danh sách.");
            }
        }
    }


    //------------------------------------------------------------------------------------------------------------------
    public void Question2(){
        themThongTinStudent1();
        for (Object student1:stack) {
            System.out.println(student1);
        }
    }

    public void themThongTinStudent1() {
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
                    eq1_Student student = new eq1_Student(id, fullName);
                    stack.add(student.getName());
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

    //------------------------------------------------------------------------------------------------------------------
    public void Question3() {
        themThongTinStudent2();
        for (Object stu:setA) {
            System.out.println(stu);
        }
    }

    public void themThongTinStudent2() {
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
                    eq1_Student student = new eq1_Student(id, fullName);
                    setA.add(student.getName());
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
