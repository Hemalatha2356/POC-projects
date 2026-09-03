package com.pocsprojects.inheritence;

import java.util.Scanner;


public class LoanImpl implements Loan{
	static Scanner sc=new Scanner(System.in);
	@Override
	public boolean isphonevalid() {
		 System.out.println("Enter your phone number");
		 String phone = sc.next();
		 return phone.matches("[6-9]{1}[0-9]{9}");
	 }
	@Override
	 public boolean idAndharcard() {
		 System.out.println("enter your Andhar number : ");
		 String  Andhar = sc.next();
		 return Andhar.matches("[1-9]{1}[0-9]{11}");
	 }
	
	@Override
	 public boolean ispancard() {
		 System.out.println("Enter your pan number");
		 String pan =sc.next();
		 return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		 
	 }
	@Override
	 public double getcustomersalary() {
		 System.out.println("Enter your salary : ");
		 double salary=sc.nextDouble();
		 return salary;
	 }
	@Override
	 public int getage() {
		 System.out.println("Enter your age : ");
		 int age = sc.nextInt();
		 return age;
	 }
	@Override
	 public int getcibilscore() {
		 System.out.println("Enter your cibil score : ");
		 int cibil = sc.nextInt();
		 return cibil;
	 }
	@Override
	 public double getlaonROI() {
		 double roi=8.5;
		 int cibil = getcibilscore();
		 if(cibil>=300&&cibil<=549) {
			 System.out.println("Poor – High risk; loan applications are likely to be rejected or approved at high interest rates");
			 roi=roi+4.0;
		 }else if(cibil>=550&&cibil<=699) {
			 System.out.println("Fair – Moderate risk; may face limitations in credit approval");
			 roi=roi+2.0;
		 }else if(cibil>=700&&cibil<=749) {
			 System.out.println("Good – Low risk; better chances of loan approval with favorable terms");
			 roi=roi+1.5;
		 }else if(cibil>=750&&cibil<=900) {
			 System.out.println(" Excellent – Very low risk; highest likelihood of approval and access to lower interest rates");
			 roi=roi+0.5;
		 }
		 else {
			 System.out.println("invalid cibil information");
			 roi=roi+10.0;
		 }
		 return roi;
	 }

}
