package Exercise2;

import Entity_Exercise2.Question10;
import Entity_Exercise2.Question10_Group;

import java.util.ArrayList;
import java.util.Scanner;

public class question9 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Question10> question9ArrayList = new  ArrayList<Question10>();
    static ArrayList<Question10_Group> question9_groupsArrayList = new  ArrayList<Question10_Group>();

    public void Que9_Chay(){

    }
    public void Question9_A(){
        System.out.println("Nhập id");
        int id = scanner.nextInt();
        System.out.println("Nhập name");
        String name = scanner.nextLine();
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        Question10 ques9 = new Question10(id, name, email);
        question9ArrayList.add(ques9);
        for (Question10 que9:question9ArrayList) {
            System.out.println("Thông tin của tất cả account");
            System.out.println(que9);
            System.out.println("---------------------------------");
        }
    }

    public void Question9_G(){
        System.out.println("Nhập id");
        int id = scanner.nextInt();
        System.out.println("Nhập name");
        String name = scanner.nextLine();
        System.out.println("Bạn muốn thêm account vào group không");
        System.out.println("|                1: có               |");
        System.out.println("|                2: không            |");
        System.out.println("--------------------------------------");
        int chon = scanner.nextInt();
        if (chon == 1) {
            System.out.println("Nhập số lượng accout bạn muốn thêm");
            int soLuongAcc = scanner.nextInt();
            Question10[] acc = new Question10[question9ArrayList.size()];
            Question10 acc1 = new Question10();
            for (int i = 0; i < soLuongAcc; i++) {
                acc[i] = acc1;
                Question10[] acc2 = {acc1};
            }
        } else if (chon == 2){
            System.out.println("Không có acc");
        }

        Question10_Group que9_d = new Question10_Group(id, "name",);




    }
}
