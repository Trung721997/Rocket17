package Bai_2;
import java.text.SimpleDateFormat;
import java.util.Date;

public class nhap {
public static void main (String[] args) {
	int i = 5;
	System.out.printf("%d\n", i);
	
	int i1 = 100000000;
	System.out.printf("%,d\n", i1);
	
	float i2 = 5.123223213f;
	System.out.printf("%5.4f\n",i2 );
	
	String s = "Nguyễn Văn A";
	System.out.printf("Tên tôi là \" " + s + " \" và tôi đang độc thân \n");
	
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy : hh-mm-ss");
	String tg = sdf.format(date);
	System.out.println(tg);
	}
}