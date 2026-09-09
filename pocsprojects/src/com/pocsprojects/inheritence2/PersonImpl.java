package com.pocsprojects.inheritence2;

import java.util.Scanner;

public class PersonImpl implements Hospitalmanagement{
	Scanner sc = new Scanner(System.in);
	
	@Override
	public boolean namevalidation() {
		System.out.println("Enter your name : ");
		String name = sc.next();
		return name.matches("[A-Z][a-z]+");
	}
	@Override
	public boolean agevalidation() {
		System.out.println("Enter a age : ");
		int age = sc.nextInt();
		if(age>=10 && age<=50) {
			System.out.println("valid age!");
			return true;
		}else {
			System.out.println("invalid age!!");
			return false;
		}
		
	
		
	}
	@Override
	public boolean phonevalidation() {
		System.out.println("Enter a phone number");
		String phone = sc.next();
		return phone.matches("[6-9][0-9]{9}");
	}
    @Override
	public double getConsultationFee() {
		
		return 400;
	}
	
}
