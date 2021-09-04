package Front_end;

import Entity2.Que1_MyMath;
import Entity2.Que2_PrimaryStudent;
import Entity2.Que2_SecondaryStudent;
public class Program2 {
	public static void main(String[] args) {
		
		Que1_MyMath myMath = new Que1_MyMath();
		myMath.sum(2);
		System.out.println(myMath.sum(2));
//----------------------------------------------------------		
		Entity2.Que2_PrimaryStudent.study();
		Entity2.Que2_SecondaryStudent.study();
		
	}
}
