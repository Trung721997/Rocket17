package Entity_Exercise2;

import java.util.Scanner;

public class Question5_6 {
    static Scanner scanner = new Scanner(System.in);
    public int inputInt() {
       while (true) {
           try {
               System.out.println("Mời nhập tuổi");
               String nhapTuoi = scanner.nextLine();
               String nhapTuoi1 = nhapTuoi.trim();
               int tuoi = Integer.parseInt(nhapTuoi1);
               if (tuoi > 0) {
                   System.out.println("Tuổi của bạn: " + tuoi);
                   return tuoi;
               } else if (tuoi == 0){
                   System.out.println("Tuổi phải khác 0");
               }
           } catch (Exception e) {
               System.out.println("Sai cú pháp, nhập lại");
           }
       }
    }


}
