package Bai_3;
import java.time.LocalDate;

public class 	Account {
	String		email;
	String		username;
	String		fullName;
	LocalDate	createDate;

	public String toString() {
		return 	"Email: " + email + "\n" 
				+ "Username: " + username + "\n" 
				+ "Fullname: " + fullName + "\n" 
				+ "CreateDate: " + createDate;
		
	
		
	}

}
