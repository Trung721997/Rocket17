package Bai_2;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Program {
	static Scanner scanner = new Scanner(System.in);
	static Random random = new Random();
	static Position pos1 = new Position();
	static Position pos2 = new Position();
	static Position pos3 = new Position();
	public static void main (String [] args) {
		
		// create department-------------------------------------------
		Department dep1 = new Department();
		dep1.id = 1;
		dep1.name = "Sale";
		
		Department dep2 = new Department();
		dep2.id = 2;
		dep2.name = "Marketting";

		Department dep3 = new Department();
		dep3.id = 3;
		dep3.name = "BaoVe";
		
		// create position---------------------------------------------
		Position pos1 = new Position();
		pos1.id = 1;
		pos1.name = PositionName.DEV;
		
		Position pos2 = new Position();
		pos2.id = 2;
		pos2.name = PositionName.TEST;
		
		Position pos3 = new Position();
		pos3.id = 3;
		pos3.name = PositionName.PM;
		
		// create account----------------------------------------------
		Account acc1= new Account();
		acc1.id = 1;
		acc1.email = "Nguyenvana@gmail.com";
		acc1.userName = "NguyenA";
		acc1.fullName = "NguyenVanA";
		acc1.department = dep1;
		acc1.position = pos1;
		acc1.createDate = LocalDate.of(2020,3,4);

		Account acc2= new Account();
		acc2.id = 2;
		acc2.email = "Nguyenvanb@gmail.com";
		acc2.userName = "NguyenB";
		acc2.fullName = "NguyenVanB";
		acc2.department = dep2;
		acc2.position = pos2;
		acc2.createDate = LocalDate.of(2020, 4, 3);

		Account acc3= new Account();
		acc3.id = 3;
		acc3.email = "Nguyenvanc@gmail.com";
		acc3.userName = "NguyenC";
		acc3.fullName = "NguyenVanC";
		acc3.department = dep3;
		acc3.position = pos3;
		acc3.createDate = LocalDate.of(2020, 4, 3);	
		
		// create Group------------------------------------------------
		Group grup1 = new Group();
		grup1.id = 1;
		grup1.name = "Group1";
		grup1.creator = acc1;
		grup1.createDate = LocalDate.of(2020, 5, 5);
		
		Group grup2 = new Group();
		grup2.id = 2;
		grup2.name = "Group2";
		grup2.creator= acc2;
		grup2.createDate = LocalDate.of(2020, 5, 5);
		
		Group grup3 = new Group();
		grup3.id = 3;
		grup3.name = "Group3";
		grup3.creator = acc3;
		grup3.createDate = LocalDate.of(2020, 6, 5);
		
		// create TypeQuestion-----------------------------------------
		TypeQuestion tyque1 = new TypeQuestion();
		tyque1.id = 1;
		tyque1.name = TypeName.ESSAY;
		
		TypeQuestion tyque2 = new TypeQuestion();
		tyque2.id = 2;
		tyque2.name = TypeName.MULTIPLECHOICE;
		
		TypeQuestion tyque3 = new TypeQuestion();
		tyque3.id = 3;
		tyque3.name = TypeName.MULTIPLECHOICE;
		
		// create CategoryQuestion-------------------------------------
		CategoryQuestion caQue1 = new CategoryQuestion();
		caQue1.id = 1;
		caQue1.name = CategoryName.JAVA;
		
		CategoryQuestion caQue2 = new CategoryQuestion();
		caQue2.id = 2;
		caQue2.name = CategoryName.NET;
		
		CategoryQuestion caQue3 = new CategoryQuestion();
		caQue3.id = 3;
		caQue3.name = CategoryName.SQL;
		
		// create Question---------------------------------------------
		Question que1 = new Question();
		que1.id = 1;
		que1.content = "Hoi thi hoi khong hoi thi hoi";
		que1.category = caQue2;
		que1.type = tyque1;
		que1.creator = acc1;
		que1.createDate = LocalDate.of(2020, 3, 4);
		
		Question que2 = new Question();
		que2.id = 2;
		que2.content = "Hoi thi hoi khong hoi thi hoi 12";
		que2.category = caQue2;
		que2.type = tyque2;
		que2.creator = acc2;
		que2.createDate = LocalDate.of(2020, 5, 4);
		
		Question que3 = new Question();
		que3.id = 3;
		que3.content = "Hoi thi hoi khong hoi thi hoi 123";
		que3.category = caQue3;
		que3.type = tyque3;
		que3.creator = acc3;
		que3.createDate = LocalDate.of(2020, 1, 8);
		
		
		// create Answer----------------------------------------------
		Answer an1 = new Answer();
		an1.id = 1;
		an1.content = "Tra loi thi tra loi kho thi van tra loi";
		an1.question = que1;
		an1.isCorreet = true;
		
		Answer an2 = new Answer();
		an2.id = 2;
		an2.content = "Tra loi thi tra loi kho thi van tra loi 1";
		an2.question = que1;
		an2.isCorreet = false;
		
		Answer an3 = new Answer();
		an3.id = 3;
		an3.content = "Tra loi thi tra loi kho thi van tra loi 2";
		an3.question = que1;
		an3.isCorreet = false;
		
		// create exam------------------------------------------------
		Exam exam1 = new Exam();
		exam1.id = 1;
		exam1.code = 123;
		exam1.title = "De thi toan";
		exam1.category = caQue2;
		exam1.creator = acc1;
		exam1.createDate = LocalDate.of(2020, 2 ,9);		

		Exam exam2 = new Exam();
		exam2.id = 2;
		exam2.code = 124;
		exam2.title = "De thi ly";
		exam2.category = caQue3;
		exam2.creator = acc2;
		exam2.createDate = LocalDate.of(2020, 2 ,9);
		
		Exam exam3 = new Exam();
		exam3.id = 3;
		exam3.code = 125;
		exam3.title = "De thi van";
		exam3.category = caQue1;
		exam3.creator = acc3;
		exam3.createDate = LocalDate.of(2020, 1 ,1);
		
		
		// G??n gruop v?? account---------------------------------------
		Group[] accG1 = {grup1, grup3};
		acc1.groups = accG1;
		
		Group[] accG2 = {grup1, grup2, grup3};
		acc2.groups = accG2;
		
		// G??n account v??o group-------------------------------------
		Account[] grupA1 = {acc1, acc2, acc3 };
		grup1.accounts = grupA1;
		
		Account[] grupA2 = {acc3, acc2 };
		grup2.accounts = grupA2;
		
		// g??n Exam v??o question-------------------------------------	
		Exam [] queE1 = {exam2, exam3};
		que1.exams = queE1;
	
		Exam [] queE3 = {exam1, exam3};
		que3.exams = queE3;
		
		// g??n question v?? exam--------------------------------------
		Question[] exQue1 = {que2, que3};
		exam1.questions = exQue1;
		
		Question[] exQue2 = {que2, que3};
		exam2.questions = exQue2;
		
		
		
		// Exercise_1-----------------------------------------------------------
		// S??? d???ng IF----------------------------------------------------------
		// question 1 ---------------------------------------------------------
		System.out.println("Question 1");
		if (acc2.department == null) {
			System.out.println("Nh??n vi??n n??u ch??a c?? ph??ng ban");
		} else {
			System.out.println("Ph??ng ban c???a nh??n vi??n n??y l??: " + acc2.department.name);
		}
		System.out.println("\n");
		 
		// questiong2 ---------------------------------------------------------
		System.out.println("Question 2");
		if (acc2.groups.length == 0) {
			System.out.println("Nh??n vi??n n??y ch??a c?? group");
		} else if (acc2.groups.length == 1 || acc2.groups.length == 2) {
			for (Group Group : accG2) {
				System.out.println("Group c???a nh??n vi??n n??y l??: " + Group.name);
			}
		} else if (acc2.groups.length == 3) {
			for (Group Group : accG2) {
				System.out.println("Nh??n vi??n n??y quan tr????ng v?? thu???c c??c group: " + Group.name);
			}
		} else if (acc2.groups.length == 4) {
				for (Group Group : accG2) {
					System.out.println("Nh??n vi??n n??y h??ng chuy???n trong t???t c??? c??c group" + Group.name);
			}
		}
		System.out.println("\n");
		
		// question 3 ---------------------------------------------------------
		System.out.println("Question 3");
		System.out.println(acc2.department == null ? "Nh??n vi??n n??y ch??a c?? ph??ng ban": "Nh??n vi??n n??y c?? ph??ng ban l??: " + acc2.department.name);
		System.out.println("\n");
		
		// question 4 s??? d???ng TERNARY ---------------------------------------------------------
		System.out.println("Question 4");
		System.out.println( acc1.position.id == 1 ? "??????y l?? Developer" : "Ng??????i n??y kh??ng ph???i l?? Developer" + acc1.position.name);
		System.out.println("\n");
		
		
		// S??? d???ng SWITCH CASE
		// question 5 ---------------------------------------------------------
		System.out.println("Question 5");
		if (grup1.accounts == null) {
			System.out.println("Nh??m n??y ch??a c?? nh??n vi??n n??o");
		} else {
		int a = grup1.accounts.length;
		switch (a) {
		case 1:
			System.out.println("Nh??m c?? 1 th??nh vi??n");
			break;
		case 2:
			System.out.println("Nh??m c?? hai th??nh vi??n");
			break;
		case 3:
			System.out.println("Nh??m c?? ba th??nh vi??n");
			break;
		default: System.out.println("nh??m c?? nhi????u th??nh vi??n");
			break;
		}
		}
		System.out.println("\n");
		
		// question 6----------------------------------------------------------
		System.out.println("Question 6");
		if (acc2.groups == null) {
			System.out.println("Nh??n vi??n n??y ch??a c?? group");
		} else {
			int b = acc2.groups.length;
			switch (b) {
			case 1:
				System.out.println("Group c???a nh??n vi??n n??y l?? Java Fresher, C# Fresher");
				break;
			case 2:
				System.out.println("Group c???a nh??n vi??n n??y l?? Java Fresher, C# Fresher");
				break;
			case 3:
				System.out.println("Nh??n vi??n n??y quan tr????ng, tham gia nhi????u group");
				break;
			case 4:
				System.out.println("Nh??n vi??n n??y h??ng chuy???n v?? tham gia t???t c??? c??c group");
				break;
				default: System.out.println("Nh??n vi??n n??y tham gia qu?? nhi????u nh??m");
				break;
		}
		}
		System.out.println("\n");
		
		
		// question 7 ---------------------------------------------------------
		System.out.println("Question 7");
		String c   = acc1.position.name.name();
	
		switch(c) {
		case "DEV":
			System.out.println("??????y l?? Developer");
			break;
		case "TEST":
			System.out.println("??????y kh??ng ph???i l?? Developer");
			break;
			default: System.out.println("??????y kh??ng ph???i Developer");
			break;
		}
		System.out.println("\n");
		
		// question 8 ---------------------------------------------------------
		System.out.println("Question 8");
		Account[] accArray = {acc1, acc2, acc3};
		for (Account account : accArray) {
			System.out.println("Email: " + account.email);
			System.out.println("Full Name: " + account.fullName);
			System.out.println("Department: " + account.department.name);
		}
		System.out.println("\n");
		
		// question 9 ---------------------------------------------------------
		System.out.println("Question 9");
		Department[] dep = {dep1, dep2, dep3};
		for (Department department : dep) {
			System.out.println("ID: " + department.id);
			System.out.println("Name: " + department.name);
		}
		System.out.println("\n");
		
		// question 10 ---------------------------------------------------------
		System.out.println("Question 10");
		Account[] acArray = {acc1, acc2, acc3};
		for (int i = 0; i < acArray.length; i++) {
			Account account = acArray[i];
			System.out.println("Th??ng tin account th??? " + (i + 1) + " l??");
			System.out.println("Email: " + acArray[i].email );	
			System.out.println("Full Name: " + acArray[i].fullName);
			System.out.println("Ph??ng Ban: " + acArray[i].department.name);
			
		}
		System.out.println("\n");
		
		// question 11 ---------------------------------------------------------
		System.out.println("Question 11");
		Department[] depaert = {dep1, dep2, dep3};
		for (int i = 0; i < depaert.length; i++) {
			Department department = depaert[i];
			System.out.println("Th??ng tin Department th??? " + (i+1) + " l??");
			System.out.println("ID: " + depaert[i].id);
			System.out.println("Name: " + depaert[i].name);
		}
		System.out.println("\n");
		
		// question 12 l???y ra th??ng tin id v?? name c???a ph??ng ban 1 v?? 2 --------
		System.out.println("Question 12");
		Account[] accArr = {acc1, acc2, acc3};
		for (int i = 0; i < accArr.length; i++) {
			if(accArr[i].department.id == 1 || accArr[i].department.id == 2) {
			System.out.println("Th??ng tin ph??ng ban account th??? " + (i+1) + " l??");
			System.out.println("ID: " + accArr[i].department.id);
			System.out.println("Name: " + accArr[i].department.name);
			} else {
				System.out.println( " Account n??y ch???a ph??ng ban kh??c");
			}
		}
		System.out.println("\n");
		
		// question 13 ---------------------------------------------------------
		System.out.println("Question 13");
		Account[] acArr = {acc1, acc2, acc3};
		for (int i = 0; i < acArr.length; i++) {
			Account account = acArr[i];
			if(acArr[i].department.id != 2) {
			System.out.println("Th??ng tin ph??ng ban account th??? " + (i+1) + " l??");
			System.out.println("ID: " + acArr[i].department.id);
			System.out.println("Name: " + acArr[i].department.name);
			} else {
				System.out.println( " Account n??y ch???a ph??ng ban kh??c");
			}
		}
		System.out.println("\n");
		
		// question 14 ---------------------------------------------------------
		System.out.println("Question 14");
		Account[] accoArr = {acc1, acc2, acc3};
		for (int i = 0; i < accoArr.length; i++) {
			Account account = accoArr[i];
			if(accoArr[i].department.id <=4) {
			System.out.println("Th??ng tin ph??ng ban account th??? " + (i+1) + " l??");
			System.out.println("ID: " + accoArr[i].department.id);
			System.out.println("Name: " + accoArr[i].department.name);
			} else {
				System.out.println( " Account n??y ch???a ph??ng ban kh??c");
			}
		}
		System.out.println("\n");
		
		// question 15 ---------------------------------------------------------
		System.out.println("Question 15");
		for (int i = 0; i <= 20; i++) {
			if( i%2 == 0) {
			System.out.println( i);
			} else {
				
			}
		}
		System.out.println("\n");
		
		// question 16 S??? d???ng WHILE -------------------------------------------
		System.out.println("Question 16");
		// 1--------------------------------------------------
		System.out.println("B??i 1");
		Account[] ar = {acc1, acc2, acc3};
		int d = 0;
		Account account = ar[d];
		while (d < ar.length) {
			System.out.println("Th??ng tin account th??? " + (d+1) +" l??");
			System.out.println("Email: " + ar[d].email);
			System.out.println("Full Name: " + ar[d].fullName);
			System.out.println("Ph??ng Ban: " + ar[d].department.name);
			d++;
		}
		System.out.println("\n");
		//2--------------------------------------------------
		System.out.println("B??i 2");
		Department[] dmp = { dep1, dep2, dep3};
		int e = 0;
		Department Department = dmp[e];
		while (e < 3) {
			System.out.println("Th??ng tin c???a Department th??? " + (e+1) + " l??");
			System.out.println("ID: " + dmp[e].id);
			System.out.println("Name: " + dmp[e].name);
			e++;
		}
		System.out.println("\n");
		//3--------------------------------------------------
		System.out.println("B??i 3");
		Account[] acrr = {acc1, acc2, acc3};
		int g = 0;
		Account Account = acrr[g];
		while (g<2) {
			System.out.println("Email: " + acrr[g].email);
			System.out.println("Full Name: " + acrr[g].fullName);
			System.out.println("Ph??ng Ban: " + acrr[g].department.name);
			g++;
		}
		System.out.println("\n");
		// question 17
		//1--------------------------------------------------
		Account[] accountArr = {acc1, acc2, acc3};
		int h=0;
		do {
			System.out.println("Email: " + accountArr[h].email);
			System.out.println("Full Name: " + accountArr[h].fullName);
			System.out.println("Ph??ng Ban: " + accountArr[h].department.name);
			h++;
		} while (h <2);
		System.out.println("\n");
		//2--------------------------------------------------
		Department[] dpmArr = {dep1, dep2, dep3};
		int f = 0;
		do {
			System.out.println("ID: " + dpmArr[f].id);
			System.out.println("Name: " + dpmArr[f].name);
			f++;
		} while (f< dpmArr.length);
		System.out.println("\n");
		
		
		
		// EXERCISE 2-----------------------------------------------------------
		// question 1------------------------------------------
		int i = 5;
		System.out.printf("%d%n",i);
		
		// question 2------------------------------------------
		int i1 = 1000000;
		System.out.printf("%,d%n",i1);
		
		// question 3------------------------------------------
		float i2 = 5.567098f;
		System.out.printf("%5.4f\n", i2 );
		
		// question 4------------------------------------------
		String i3 = "Nguy???n V??n A";
		System.out.println("T??i t??n l?? \"" + i3 + "\" v?? t??i ??ang ?????c th??n");
		
		// question 5------------------------------------------
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		 String tg = simpleDateFormat.format(date);
		System.out.println(tg);
		System.out.println("\n");
		
		// question 5------------------------------------------
		System.out.println("Question 5");
		Account[] accArray1 = {acc1, acc2, acc3};
		for (Account account1 : accArray) {
			System.out.println("Email: " + account1.email + "	Full Name: " 
					+ account1.fullName + "	Department: " + account1.department.name);
		}
		System.out.println("\n");
		
		
		// EXERCISE 3-----------------------------------------------------------
		// question 1------------------------------------------
		Locale locale = new Locale("vn", "VN");
		DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT,
		locale);
		String date1 = dateformat.format(exam1.createDate);
		System.out.println(exam1.code + ": " + date1);
		System.out.println("\n");
		
		// question 2------------------------------------------
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		Exam[] exams = { exam1, exam2, exam1 };
		for (Exam examvd : exams) {
		String date2 = sdf.format(examvd.createDate);
		System.out.println(examvd.code + ": " + date2);	
		}
		// question 3------------------------------------------
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
		Exam[] exams1 = { exam1, exam2, exam1 };
		for (Exam examvd1 : exams) {
		String date3 = sdf1.format(examvd1.createDate);
		System.out.println(examvd1.code + ": " + date3);
		}
		
		// question 4------------------------------------------
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy- MM");
		Exam[] exams2 = { exam1, exam2, exam1 };
		for (Exam examvd2 : exams) {
		String date4 = sdf2.format(examvd2.createDate);
		System.out.println(examvd2.code + ": " + date4);
		}
		
		// Exercise4
		// question 1------------------------------------------
			int a = random.nextInt();
			System.out.println(a);
		// question 2------------------------------------------
			float b = random.nextFloat();
			System.out.println(b);
		// question 3------------------------------------------
			String[] tenCacBantrongLop = {"trung", "c?????ng","th???c"};
			int a1 = random.nextInt(tenCacBantrongLop.length);
			System.out.println(tenCacBantrongLop[i]);
			
		// question 4------------------------------------------
			int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay();
			int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
			System.out.println("minday:" + minDay);
			System.out.println("maxday:" + maxDay);
			long randomInt = minDay + random.nextInt(maxDay - minDay);
			
		// question 5------------------------------------------	
			int now = (int) LocalDate.now().toEpochDay();
			int randomDate = now - random.nextInt(365);
			LocalDate reusultDate = LocalDate.ofEpochDay(randomDate);
			System.out.println("Ng??y ng???u nhi??n l??: " + reusultDate);
		
		// question 5------------------------------------------	
			int maxDay1 = (int) LocalDate.now().toEpochDay();
			long randomDay = random.nextInt(maxDay1);
			LocalDate resultDate = LocalDate.ofEpochDay(randomDay);
			System.out.println("1 Ng??y ng???u nhi??n trong qu?? kh???: " + resultDate);
		
		// question 6------------------------------------------		
			int a2 = random.nextInt(1000);
			System.out.println(a2);
	
			
		// Exercise 5-----------------------------------------------------------		
		// question 1------------------------------------------	
			System.out.println("M???i b???n nh???p v??o 3 s??? nguy??n");
			System.out.println("Nh???p v??o s??? 1: ");
			int a3 = scanner.nextInt();
			System.out.println("Nh???p v??o s??? 2: ");
			int q4 = scanner.nextInt();
			System.out.println("Nh???p v??o s??? 3: ");
			int a4 = scanner.nextInt();
			System.out.println("B???n v???a nh???p v??o c??c s???: " + "\n" + a + "\n" + b + "\n" + c);
			
		// question 2------------------------------------------		
			System.out.println("M???i b???n nh???p v??o 2 s??? th???c");
			System.out.println("Nh???p v??o s??? 1: ");
			float f1 = scanner.nextFloat();
			System.out.println("Nh???p v??o s??? 2: ");
			float f2 = scanner.nextFloat();
			System.out.println("B???n v???a nh???p v??o c??c s???: " + "\n" + f1 + "\n" + f2);
			
		// question 3------------------------------------------	
			System.out.println("M???i b???n nh???p h??? t??n");
			String hoTen = scanner.nextLine();
			System.out.println(hoTen);
			
		// question 4------------------------------------------	
			System.out.println("M???i b???n nh???p v??o n??m sinh: ");
			int year = scanner.nextInt();
			System.out.println("M???i b???n nh???p v??o th??ng sinh: ");
			int month = scanner.nextInt();
			System.out.println("M???i b???n nh???p v??o ng??y sinh: ");
			int day = scanner.nextInt();
			LocalDate dateBirth = LocalDate.of(year, month, day);
			System.out.println("Ng??y sinh c???a b???n l??: " + dateBirth);
			
		// question 5------------------------------------------
			question5();
			
		// question 6------------------------------------------
			question6();
			
		// question 7------------------------------------------
			question7();
			
		// question 8------------------------------------------
			question8() ;

			

 }
	
	public static void question5() {
		while(true) {
			System.out.println("Nh???p 1 ????? ti???p t???c, nh???p 2 ????? tho??t.");
			int nhapSo = scanner.nextInt();
			switch(nhapSo) {
			case 1:
				System.out.println("M???i b???n nh???p v??o th??ng tin account c??n t???o: ");
				Account acc = new Account();
				System.out.println("Nh???p ID: ");
				acc.id = scanner.nextInt();
				System.out.println("Nh???p email: ");
				acc.email = scanner.next();
				System.out.println("Nh???p userName: ");
				acc.userName = scanner.next();
				System.out.println("Nh???p fullName: ");
				acc.fullName = scanner.next();
				System.out.println("Nh???p position (Nh???p c??c s??? t??? 1 ?????n 4 t????ng ???ng v???i:"
						+ " 1.Dev, 2.Test, 3.Scrum_Master, 4.PM): ");
				int posNum = scanner.nextInt();
				switch (posNum) {
				case 1:
					Position pos1 = new Position();
					pos1.name = PositionName.DEV;
					acc.position = pos1;
					break;
				case 2:
					Position pos2 = new Position();
					pos2.name = PositionName.TEST;
					acc.position = pos2;
					break;
				case 3:
					Position pos3 = new Position();
					pos3.name = PositionName.CREUMMASTER;
					acc.position = pos3;
					break;
				case 4:
					Position pos4 = new Position();
					pos4.name = PositionName.PM;
					acc.position = pos4;
					break;
				}
				
				System.out.println("Th??ng tin Acc v???a nh???p, ID: " + acc.id + " Email: " 
				+ acc.email + " UserName: "+ acc.userName + " FullName: " + acc.fullName
				+ " Position: " + acc.position.name);
				break;
			case 2:
				System.out.println("B???n ???? tho??t");
				return;
			default:
				System.out.println("B???n nh???p sai c?? ph??p, m???i nh???p l???i");
				break;
				}
		}
	}
	
	public static void question6() {
		Department dep4 = new Department();
		System.out.println("Question 6: Vi???t l???nh cho ph??p ng?????i d??ng t???o "
				+ "department (vi???t th??nh method)");
		System.out.println("M???i b???n nh???p v??o th??ng tin Department c??n t???o: ");
		Department dep = new Department();
		System.out.println("Nh???p ID: ");
		dep4.id = scanner.nextInt();
		System.out.println("Nh???p Name: ");
		dep4.name = scanner.nextLine();
		System.out.println("Th??ng tin Department v???a nh???p, ID: " + dep4.id + " Name: " + dep4.name);
		}
	
	public static void question7() {
		while (true) {
		System.out.println("H??y nh???p v??o 1 s??? ch???n: ");
		int a = scanner.nextInt();
		if (a % 2 == 0) {
		System.out.println("B???m v???a nh???p v??o:" + a);
		return;
		} else {
		System.out.println("Nh???p sai, ????y kh??ng ph???i l?? s???ch???n");
		}
		}
		}
	
	public static void question8() {
		int choose;
		while (true) {
		System.out.println("M???i b???n ch???n ch???c n??ng: 1. T???o Account, 2. T???o Department");
		choose = scanner.nextInt();
		if (choose == 1 || choose == 2) {
		switch (choose) {
			case 1:
				question5();
				break;
			case 2:
				question7();
				break;
			}
			return;
		} else {
		System.out.println("Nh???p l???i: ");
		}
		}
	}
	
	public static void question10() {
		Scanner sc = new Scanner(System.in);
		int choose;
		while (true) {
		System.out.println("M???i b???n ch???n ch???c n??ng: "
				+ "1. T???o Account, "
				+ "2. T???o Department, "
				+ "3.Add Group v??o Account");
		choose = sc.nextInt();
		if (choose == 1 || choose == 2 || choose == 3) {
		switch (choose) {
		case 1:
		question5();
		break;
		case 2:
		question7();
		break;
		case 3:
	//	question9();
		break;
		}
		System.out.println("B???n c?? mu???n ti???p t???c kh??ng, h??y ch???n Menu, Ch???n 0 ????? tho??t ch????ng tr??nh!");
		int ak = sc.nextInt();
		if (ak == 0) {
		System.out.println("Tho??t");
		return;
		} 
		} else {
		System.out.println("Nh???p sai c?? ph??p nh???p l???i: ");
		}
		}
		}
	
	// Exercise 6: Method--------------------------------------------------
	// Question 1: T???o method ????? in ra c??c s??? ch???n nguy??n d????ng nh??? h??n 10
		public static void Exercise6_question1() {
		for (int i = 0; i < 10; i++) {
		if (i % 2 == 0) {
		System.out.print(i + " ");
		}
		}
		System.out.println("");
		}

		
	// Question 2:T???o method ????? in th??ng tin c??c account
			public static void Exercise6_question2() {
			Account acc1 = new Account();
			acc1.id = 1;
			acc1.email = "trung@gmail.com";
			acc1.userName = "trung";
			acc1.fullName = "Nguyen Van trung";
			acc1.createDate = LocalDate.now();
			Account acc2 = new Account();
			acc2.id = 2;
			acc2.email = "c????ng@gmail.com";
			acc2.userName = "cuong";
			acc2.fullName = "nguyenvan cuong";
			acc2.createDate = LocalDate.of(2021, 03, 17);
			Account acc3 = new Account();
			acc3.id = 3;
			acc3.email = "thuc@gmail.com";
			acc3.userName = "thuc";
			acc3.fullName = "nguyen van thuc";
			acc3.createDate = LocalDate.now();
			printAccount(acc1);
			printAccount(acc2);
			printAccount(acc3);
			}
			private static void printAccount(Account account) {
			System.out.println("ID: " + account.id + " Email: " + 
			account.email + " Username: " + account.userName
			+ " FullName: " + account.fullName + " CreareDate: "
			+ account.createDate);
			}
			
		// Question 3:T???o method ????? in ra c??c s??? nguy??n d????ng nh??? h??n 10
				private static void Exercise6_question3() {
				for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");
				}
				}


	

	
	
	
	
	
	
	

}
