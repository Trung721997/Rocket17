package Entity_Exercise2;

import java.util.Scanner;

public class question7 {
	static Scanner scanner = new Scanner(System.in);

	public void  inputInt(String errorMessage) throws Exception {
		String errorMessage1 = errorMessage.trim();
		int errorMessage2 = Integer.parseInt(errorMessage1);
		if (errorMessage2 > 0) {
			System.out.println("Tuổi vừa nhập là: " + errorMessage2);
			return;
		} else if (errorMessage2 == 0){
			System.out.println("Lỗi cú pháp nhập lại");
		}
		throw new ChuyenXuLyLoiString("Lỗi cú pháp, nhập lại");
	}

	//Cách 2-----------------------------------------------------
	public int checkAge() {
		while (true) {
			System.out.println("Nhập tuổi: ");
			String nhapTuoi = scanner.next();
			String nhapTuoi1 = nhapTuoi.trim();

			try {
				int tuoi = Integer.parseInt(nhapTuoi1);
				if (tuoi != 0) {
					return tuoi;
				} else if (tuoi == 0) {
					System.out.println("Tuổi phải khác 0, nhập lại");
				}
			} catch (Exception e) {
				System.out.println("Sai định dạng mời nhập lại");
			}
		}
	}


}
