package com.pocsprojects.inheritence;

import java.util.Scanner;

public class Personalloan extends LoanImpl {
	
	void personalloandocinfo() {
		System.out.println("personal loan documentation validation checking or info!!");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("welcome to personal loan application!!");
		
		Personalloan p1 = new Personalloan();
		double salary = p1.getcustomersalary();
		int age = p1.getage();
		int cibil=p1.getcibilscore();
		
		
		if(salary>=900000&&age<=26&&(cibil>=300&&cibil<=900)) {
			System.out.println("then basic information is valid!");
			if(p1.isphonevalid()&& p1.idAndharcard()&&p1.ispancard()) {
				System.out.println("your loan was approved");
				System.out.println("rate of interest is : " + p1.getlaonROI());
				p1.personalloandocinfo();
			}else {
				System.out.println("something went wrong");
			}
			
		}else {
			System.out.println("your loan was not approved!!");
		}
		System.out.println("main method ended!!");

	}

}
