package Entity3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Question9 {
    static Scanner scanner = new Scanner(System.in);
    public void cppyFile(String file, String filee, String fileee) throws IOException {
        File file1 = new File(file);
        File file2 = new File(filee);
        File file3 = new File(fileee);
        if (file1.exists()) {
            if (file1.isFile()) {
                file1.renameTo(file2);
                System.out.println("Đã coppy fileCoppy");
            } else {
                System.out.println("Không phải là file");
            }
        } else if (file1.createNewFile()) {
            System.out.println("Đã tạo 1 file Test.txt");
            file1.renameTo(file2);
            System.out.println(" Đã coppy fileCoppy1");
            file2.renameTo(file3);
            System.out.println(" Đã đổi tên fileCoppy1 thành fileee");
        }
        System.out.println("Xóa file vừa coppy");
        if(file2.delete()){
            System.out.println("Đã xóa được file vừa coppy là fileCoppy/fileCoppy1");
        }
    }
}
