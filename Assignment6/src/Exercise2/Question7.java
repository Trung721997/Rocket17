package Exercise2;

import Entity_Exercise2.question7;

import java.util.Scanner;

public class Question7 {
    static Scanner scanner = new Scanner(System.in);
    public void question7() {
        question7 qu7 = new question7();
        while (true) {
            System.out.println("Nhập tuổi");
            String tuoi = scanner.next();
            try {
                qu7.inputInt(tuoi);
                return;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
