package Entity_Exercise2;

public class Question3 {
	public void array() {
		try {
			int[] a = {1,2,3,4};
			System.out.println(a[10]);
		}catch (Exception e) {
			System.out.println("Không có giá trị này");
		} finally {
			System.out.println("finally: Ahihi");
		}
		System.out.println("Chương trình vẫn chạy tiếp");
	}

}
