package com.pocsprojects.inheritence1;

import java.util.Scanner;

public class ScholarshipImpl implements Scholarship{
	Scanner sc = new Scanner(System.in);
	
//	Student marks
//	Attendance
//	Family income
//	Age
//	Sports achievements
	@Override
	public int studentMarks() {
	    System.out.println("Enter student marks:");
	    int marks = sc.nextInt();

	    if (marks >= 0 && marks <= 100) {
	        System.out.println("Valid marks");
	    } else {
	        System.out.println("Invalid marks");
	    }

	    return marks;
	}
	@Override
	public int Attendence() {
		System.out.println("Enter the attendence");
		int Attendence = sc.nextInt();
		if(Attendence>=0&&Attendence<=100) {
			System.out.println("valid attendence");
		}else {
			System.out.println("invalid attendence");
		}
		return Attendence;
	}
	@Override
	public double familyIncome() {
		System.out.println("Enter the family income");
		double Income = sc.nextDouble();
		if(Income>=0&&Income<=500000) {
			System.out.println("valid income");
		}else {
			System.out.println("invalid income");
		}
		return Income;
	}
	@Override
	public int age() {
		System.out.println("Enter your age");
		int age = sc.nextInt();
		if(age>=15&&age<24) {
			System.out.println("valid age");
		}else {
			System.out.println("invalid age");
		}
		return age;
	}
	@Override
	public boolean Sportsachievements() {
		System.out.println("Sports achievements");
		boolean sports = sc.nextBoolean();
		if(sports) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
		return sports;
	}
}
