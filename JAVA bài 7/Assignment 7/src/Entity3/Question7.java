package Entity3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Question7 {
    static Scanner scanner = new Scanner(System.in);
//    public void cppyFile(String file) throws IOException {
//        File file1 = new File(file);
//        File file2 = new File("C:\\Users\\Trung\\Desktop\\Test1.txt");
//        if (file1.exists()) {
//            if (file1.isFile()) {
//                    file1.renameTo(file2);
//                System.out.println("Đã coppy fileCoppy");
//            } else {
//                System.out.println("Không phải là file");
//            }
//        } else if (file1.createNewFile()) {
//            System.out.println("Đã tạo 1 file Test.txt");
//            file1.renameTo(file2);
//            System.out.println(" Đã coppy fileCoppy1");
//        }
//        System.out.println("Xóa file vừa coppy");
//        if(file2.delete()){
//            System.out.println("Đã xóa được file vừa coppy là fileCoppy/fileCoppy1");
//        }
//    }

    public void cppyFile1(File file1, File file2) throws Exception {
        File file = new File(String.valueOf(file1));
        File filee = new File(String.valueOf(file2));
        if (file.exists()){
            cppyFile1(file, filee);
            System.out.println("đã coppy thành công1");
        } else if(file.createNewFile()){
            cppyFile1(file, filee);
            System.out.println("đã coppy thành công2");
        }
    }


}
