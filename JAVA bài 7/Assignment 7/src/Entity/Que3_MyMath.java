
package Entity;

public class Que3_MyMath {
	public static int layMax(int a, int b) {
		if(a >= b) {
			System.out.println("Giá trị max: " + a);
			return a;
		}
		System.out.println(b);
		return b;
	} 

	public static int layMin(int a, int b) {
		if(a >= b) {
			System.out.println("Giá trị max: " + b);
			return b;
		}
		System.out.println(a);
		return a;
	}	
	
	public static int laySum(int a, int b) {
		System.out.println("Tổng của a+b: " + (a+b));
		return a+b;
	}
	
}
