package Bai_1;
import java.time.LocalDate;

public class Program {
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
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Group1";
		group1.creator = acc1;
		group1.createDate = LocalDate.of(2020, 5, 5);
		
		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Group2";
		group2.creator= acc2;
		group2.createDate = LocalDate.of(2020, 5, 5);
		
		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Group3";
		group3.creator = acc3;
		group3.createDate = LocalDate.of(2020, 6, 5);
		
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
		
		
		// Gán gruop và account---------------------------------------
		Group[] accG1 = {group1, group3};
		acc1.groups = accG1;
		
		Group[] accG2 = {group2, group3};
		acc2.groups = accG2;
		
		// Gán account vào group-------------------------------------
		Account[] grupA1 = {acc1, acc2 };
		group1.accounts = grupA1;
		
		Account[] grupA2 = {acc3, acc2 };
		group2.accounts = grupA2;
		
		// gán Exam vào question-------------------------------------	
		Exam [] queE1 = {exam2, exam3};
		que1.exams = queE1;
	
		Exam [] queE3 = {exam1, exam3};
		que3.exams = queE3;
		
		// gán question và exam--------------------------------------
		Question[] exQue1 = {que2, que3};
		exam1.questions = exQue1;
		
		Question[] exQue2 = {que2, que3};
		exam2.questions = exQue2;
		
		
		// Lấy thông tin----------------------------------------------
		System.out.println("Thông tin departmant1");
		System.out.println("id:" + dep1.id);
		System.out.println("name:" + dep1.name);
		System.out.println("\n");
		
		System.out.println("Thông tin departmant2");
		System.out.println("id:" + dep2.id);
		System.out.println("name:" + dep2.name);
		System.out.println("\n");
		
		System.out.println("Thông tin departmant3");
		System.out.println("id:" + dep3.id);
		System.out.println("name:" + dep3.name);
		System.out.println("\n");
		
		System.out.println("Thông tin position1");
		System.out.println("id:" + pos1.id);
		System.out.println("name:" + pos1.name);
		System.out.println("\n");
		
		System.out.println("Thông tin position2");
		System.out.println("id:" + pos2.id);
		System.out.println("name:" + pos2.name);
		System.out.println("\n");
		
		System.out.println("Thông tin position3");
		System.out.println("id:" + pos3.id);
		System.out.println("name:" + pos3.name);
		System.out.println("\n");
		
		System.out.println("Thông tin account1");
		System.out.println("id:" + acc1.id);
		System.out.println("email:" + acc1.email);
		System.out.println("userName:" + acc1.userName);
		System.out.println("fullName:" + acc1.fullName);
		System.out.println("department:" + acc1.department.name);
		System.out.println("position:" + acc1.position.name);
		System.out.println("createDate:" + acc1.createDate);
		System.out.println("\n");
		
		System.out.println("Thông tin account2");
		System.out.println("id:" + acc2.id);
		System.out.println("email:" + acc2.email);
		System.out.println("userName:" + acc2.userName);
		System.out.println("fullName:" + acc2.fullName);
		System.out.println("department:" + acc2.department.name);
		System.out.println("positiond:" + acc2.position.name);
		System.out.println("createDate:" + acc2.createDate);
		System.out.println("\n");
		
		System.out.println("Thông tin account3");
		System.out.println("id:" + acc3.id);
		System.out.println("email:" + acc3.email);
		System.out.println("userName:" + acc3.userName);
		System.out.println("fullName:" + acc3.fullName);
		System.out.println("department:" + acc3.department.name);
		System.out.println("position:" + acc3.position.name);
		System.out.println("createDate:" + acc3.createDate);
		System.out.println("\n");
		
		System.out.println("Thông tin Group1");
		System.out.println("id:" + group1.id);
		System.out.println("name:" + group1.name);
		System.out.println("creator:" + group1.creator.userName);
		System.out.println("createDate:" + group1.createDate);
		System.out.println("\n");
		
		System.out.println("Thông tin Group2");
		System.out.println("id:" + group2.id);
		System.out.println("name:" + group2.name);
		System.out.println("creator:" + group2.creator.userName);
		System.out.println("createDate:" + group2.createDate);
		System.out.println("\n");
		
		System.out.println("Thông tin Group3");
		System.out.println("id:" + group3.id);
		System.out.println("name:" + group3.name);
		System.out.println("creator:" + group3.creator.userName);
		System.out.println("createDate:" + group3.createDate);
		System.out.println("\n");
		
		System.out.println("Thông tin TypeQuestion1");
		System.out.println("id:" + tyque1.id);
		System.out.println("name:" + tyque1.name);
		System.out.println("\n");
		
		System.out.println("Thông tin TypeQuestion2");
		System.out.println("id:" + tyque2.id);
		System.out.println("name:" + tyque2.name);
		System.out.println("\n");
		
		System.out.println("Thông tin TypeQuestion3");
		System.out.println("id:" + tyque2.id);
		System.out.println("name:" + tyque2.name);
		System.out.println("\n");

		
		System.out.println("Thông tin CategoryQuestion1");
		System.out.println("id:" + caQue1.id);
		System.out.println("name:" + caQue1.name);
		System.out.println("\n");
		
		System.out.println("Thông tin CategoryQuestion2");
		System.out.println("id:" + caQue2.id);
		System.out.println("name:" + caQue2.name);
		System.out.println("\n");
		
		System.out.println("Thông tin CategoryQuestion3");
		System.out.println("id:" + caQue3.id);
		System.out.println("name:" + caQue3.name);
		System.out.println("\n");
		
		System.out.println("Thông tin Question1");
		System.out.println("id:" + que1.id);
		System.out.println("content:" + que1.content);
		System.out.println("category:" + que1.category.name);
		System.out.println("type:" + que1.type.name);
		System.out.println("creator:" + que1.creator.userName);
		System.out.println("createDate:" + que1.createDate);
		System.out.println("\n");
		
		System.out.println("Thông tin Question2");
		System.out.println("id:" + que2.id);
		System.out.println("content:" + que2.content);
		System.out.println("category:" + que2.category.name);
		System.out.println("type:" + que2.type.name);
		System.out.println("creator:" + que2.creator.userName);
		System.out.println("createDate:" + que2.createDate);
		System.out.println("\n");
		
		System.out.println("Thông tin Question3");
		System.out.println("id:" + que3.id);
		System.out.println("content:" + que3.content);
		System.out.println("category:" + que3.category.name);
		System.out.println("type:" + que3.type.name);
		System.out.println("creator:" + que3.creator.userName);
		System.out.println("createDate:" + que3.createDate);
		System.out.println("\n");
		
		System.out.println("Thông tin Answer1");
		System.out.println("id:" + an1.id);
		System.out.println("content:" + an1.content);
		System.out.println("questionID:" + an1.question.id);
		System.out.println("isCorreet:" + an1.isCorreet);
		System.out.println("\n");
		
		System.out.println("Thông tin Answer2");
		System.out.println("id:" + an2.id);
		System.out.println("content:" + an2.content);
		System.out.println("questionID:" + an2.question.id);
		System.out.println("isCorreet:" + an2.isCorreet);
		System.out.println("\n");
		
		System.out.println("Thông tin Answer3");
		System.out.println("id:" + an3.id);
		System.out.println("content:" + an3.content);
		System.out.println("questionID:" + an3.question.id);
		System.out.println("isCorreet:" + an3.isCorreet);
		System.out.println("\n");
		
		System.out.println("Thông tin Exam1");
		System.out.println("id:" + exam1.id);
		System.out.println("code:" + exam1.code);
		System.out.println("title:" + exam1.title);
		System.out.println("category:" + exam1.category.name);
		System.out.println("creator:" + exam1.creator.userName);
		System.out.println("createDate:" + exam1.createDate);
		System.out.println("\n");
		
		System.out.println("Thông tin Exam2");
		System.out.println("id:" + exam2.id);
		System.out.println("code:" + exam2.code);
		System.out.println("title:" + exam2.title);
		System.out.println("category:" + exam2.category.name);
		System.out.println("creator:" + exam2.creator.userName);
		System.out.println("createDate:" + exam2.createDate);
		System.out.println("\n");
		
		System.out.println("Thông tin Exam3");
		System.out.println("id:" + exam3.id);
		System.out.println("code:" + exam3.code);
		System.out.println("title:" + exam3.title);
		System.out.println("categoryID:" + exam3.category.name);
		System.out.println("creatorID:" + exam3.creator.userName);
		System.out.println("createDate:" + exam3.createDate);
		System.out.println("\n");
	}

}


