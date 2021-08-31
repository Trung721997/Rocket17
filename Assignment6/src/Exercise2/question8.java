package Exercise2;

import Entity_Exercise2.Question8;
import Entity_Exercise2.question7;

import java.util.Scanner;

public class question8 {
    static Scanner scanner = new Scanner(System.in);
    static Question8 qu8 = new Question8();
    public void inputFloat() {
        while (true) {
            System.out.println("Nhập điểm");
            String diem = scanner.next();
            try {
                qu8.inputFloat(diem);
                return;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void inputDouble() {
        while (true) {
            System.out.println("Nhập điểm");
            String diem = scanner.next();
            try {
                qu8.inputDouble(diem);
                return;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
