package Entity3;

import java.io.File;

public class Question6 {
    public void layThongTinFile(String pathFile){
        File file = new File(pathFile);
        if (file.exists()){
            try {
                if (file.isDirectory()) {
                    for (File file1 : file.listFiles()) {
                        System.out.println(file1.getName());
                    }
                }
            }catch (Exception e){
                System.out.println("Error! Path is not folder.");
            }
        }else {
            System.out.println("File không tồn tại");
        }
    }
}
