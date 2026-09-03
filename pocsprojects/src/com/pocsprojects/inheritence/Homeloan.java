package com.pocsprojects.inheritence;

//whenever we are not happy or not satisified from parent class functionalities
//go and create same method with different behavior is the concepts of method overriding
public class Homeloan extends LoanImpl{
	
	public double getlaonROI() {
		 double roi=6.5;
		 int cibil = getcibilscore();
		 if(cibil>=300&&cibil<=549) {
			 System.out.println("Poor – High risk; loan applications are likely to be rejected or approved at high interest rates");
			 roi=roi+10.5;
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

	public static void main(String[] args) {
       System.out.println("welcome to homeloan loan application!!");
		
		Homeloan h1 = new Homeloan();
		double salary = h1.getcustomersalary();
		int age = h1.getage();
		int cibil=h1.getcibilscore();
		
		
		if(salary>=800000&&age<=28&&(cibil>=300&&cibil<=900)) {
			System.out.println("then basic information is valid!");
			if(h1.isphonevalid()&& h1.idAndharcard()&&h1.ispancard()) {
				System.out.println("your loan was approved");
				System.out.println("rate of interest is : " + h1.getlaonROI());
				
			}else {
				System.out.println("something went wrong");
			}
			
		}else {
			System.out.println("your loan was not approved!!");
		}

	}
	void homeloandocumentinfo() {
		System.out.println("homeloan documentation info or validation!!");
	}

}
