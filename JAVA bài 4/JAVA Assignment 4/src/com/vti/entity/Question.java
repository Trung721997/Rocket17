package com.vti.entity;
import java.time.LocalDate;

public class Question {
	byte id;
	String content;
	CategoryQuestion category;
	TypeQuestion type;
	Account creator;
	LocalDate createDate;
	Exam [] exams;

}
