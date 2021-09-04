package backend;
import Entity3.FileManager;
import Entity3.Question4;
import Entity3.Question6;
import Entity3.Question7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise3<fileManager> {

    static Scanner scanner = new Scanner(System.in);
    public void Question1() throws IOException {
        FileManager fileManager = new FileManager();
        System.out.println("Đường linh tới file");
        String duongLink = scanner.nextLine();
        fileManager.createNewFile(duongLink);
        System.out.println("-------------------------------");
    }
    public void Question_4(){
        Question4 question4 = new Question4();
        System.out.println("Đường linh tới file");
        String duongLink = scanner.nextLine();
        question4.deleteFile(duongLink);
        System.out.println("-------------------------------");
    }

    public void Question_6() {
        Question6 question6 = new Question6();
        System.out.println("Đường linh tới file");
        String duongLink = scanner.nextLine();
        question6.layThongTinFile(duongLink);
        System.out.println("-------------------------------");
    }

    public  void Question_7() throws Exception {
        System.out.println("Nhập đường link1");
        File duongLinh = new File(scanner.nextLine());
        System.out.println("Nhập đường link2");
        File duongLinh1 = new File(scanner.nextLine());
        Question7 question7 = new Question7();
        question7.cppyFile1(duongLinh, duongLinh1);

    }

}

