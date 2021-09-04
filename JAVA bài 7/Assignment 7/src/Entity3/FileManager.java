package Entity3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManager {
//	"C:\\Users\\Trung\\Desktop\\Test.txt"
	public void createNewFile(String pathFile) throws IOException {
		File file = new File(pathFile);
		if(!file.exists()) {
			if (file.createNewFile()){
				System.out.println("Đã tạo được file");
				String noiDungCanThem = "Nội dung số 1";
				FileOutputStream fileOutputStream = new FileOutputStream(pathFile,true);
				fileOutputStream.write(noiDungCanThem.getBytes());
				if (file.isDirectory()){
					System.out.println("Đường dẫn");
				}else {
					System.out.println("Là file");
				}
			}
			}else System.out.println("File đã tồn tại");
			}


}



