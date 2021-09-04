package Entity3;

import java.io.File;

public class Question4 {
    public void deleteFile(String pathFile){
        File file = new File(pathFile);
        if (file.exists()){
            System.out.println("File tồn tại");
            file.delete();
            System.out.println("Đã xóa file");

        }else {
            System.out.println("File không tồn tại");
        }
    }
}
