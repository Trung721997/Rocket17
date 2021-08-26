package com.vti.entity;
import java.time.LocalDate;

public class Exam {
	byte id;
	int code;
	String title;
	CategoryQuestion category;
	Account creator;
	LocalDate createDate;
	Question [] questions;

}
