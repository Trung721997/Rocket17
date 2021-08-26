package com.vti.backend;

import java.time.LocalDate;

import com.vti.entity.Department;
import com.vti.entity.Position;
import com.vti.entity.PositionName;
import com.vti.entity.Account;
import com.vti.entity.Group;




public class Excercise1 {
	

	static Account[] acc;
	static Position pos1;
	public static void Question_1() {
		System.out.println("Question_1a");	
		Department dep = new Department();
		dep.setId(1);
		dep.setName("Sale");
		System.out.println(dep);
		System.out.println("\n");
		
		System.out.println("Question_1b");
		Department depa = new Department("marketting");
		System.out.println(depa);
		System.out.println("\n");
	}
	
	public static void Question_2() {
		Position pos1 = new Position(1, PositionName.DEV);
		
		System.out.println("Question 2a");
		Account ac = new Account();
		ac.setId(1);
		ac.setEmail("Nguyen Van Trung");
		ac.setUserName("TrungVan");
		ac.setFirstName("Nguyen");
		ac.setLastName("Van Trung");
		ac.setFullName("Nguyen Van Trung");
		ac.setCreateDate(LocalDate.of(2021,2, 2));
		System.out.println(ac);
		System.out.println("\n");
		
		System.out.println("Question 2b");
		Account acc = new Account(1, 
		"nguyenvantrung@gmail.com", "TrungVan", "Nguyen",
		"Van Trung", "Nguyen Van Trung");
		System.out.println(acc);
		System.out.println("\n");

	
		System.out.println("Question 2c");
		Account acc1 = new Account (1, 
		"nguyenvantrung@gmail.com", "TrungVan", "Nguyen",
		"Van Trung", "Nguyen Van Trung",pos1);
		System.out.println(acc1);
		System.out.println("\n");


		System.out.println("Question 2d");
		Account acc2 = new Account(1, 
		"nguyenvantrung@gmail.com", "TrungVan", "Nguyen",
		"Van Trung", "Nguyen Van Trung",pos1 ,LocalDate.of(2018,1,1));
		System.out.println(acc2);
		System.out.println("\n");
	}
	
	public static void Question_3() {
		System.out.println("Question_3a");
		Group grup = new Group();
		grup.setId(1);
		grup.setName("Group Tu Thien");
		grup.setAccounts(acc);
		grup.setCreateDate(LocalDate.of(2021,3,4));
		System.out.println(grup);
		System.out.println("\n");
		
		System.out.println("Question_3b");
		Group grup1 = new Group("Group Gop Quy", LocalDate.of(2021,4,5), acc);
		System.out.println(grup1);
		System.out.println("\n");
		
		System.out.println("Question_3c");
		String[] usernames = {"Van" , "Trung" , "trần"};
		Group grup2 = new Group(null, null, null, usernames);
		
		
	}

}
