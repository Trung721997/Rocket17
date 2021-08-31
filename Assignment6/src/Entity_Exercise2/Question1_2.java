package Entity_Exercise2;

import java.util.Scanner;

public class Question1_2 {
	int a;
	int b;
	
	public float divede(int a, int b) {
		float giaTriPhepChia = a/b;
		return giaTriPhepChia;
	}

	public void dividezzzz() {
		while(true) {
			Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Nhập giá trị a: ");
			int a = scanner.nextInt();
			System.out.println("Nhập giá trị b: ");
			int b = scanner.nextInt();
			divede(a,b);
			System.out.println("Giá trị phép chia: " + divede(a,b));
			return;
		}catch (Exception e){
			System.out.println("Giá trị b phải khác o, nhập lại");
		}finally {
			System.out.println("divide completed!");
		}
		}
	}

	
	
}
