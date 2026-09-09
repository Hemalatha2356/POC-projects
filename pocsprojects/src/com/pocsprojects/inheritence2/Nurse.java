package com.pocsprojects.inheritence2;

public class Nurse extends PersonImpl{
	
	@Override
	public double getConsultationFee() {
	    return 200;
	}

	public static void main(String[] args) {
		
		Doctor d = new Doctor();
		
		System.out.println("apppoinment : " + d.appoinment());
		System.out.println("consulation fee : " + d.getConsultationFee());
		
		
		Patient p = new Patient();
		
		System.out.println("patient details");
		p.setDisease("fever");
		System.out.println(p.getDisease());
		
		
		System.out.println("name valid " + p.namevalidation());
		System.out.println("age valid " + p.agevalidation());
		System.out.println("phone valid " + p.phonevalidation());
		
		Nurse n = new Nurse();

		System.out.println("Nurse details");

		System.out.println("Name valid: " + n.namevalidation());
		System.out.println("Age valid: " + n.agevalidation());
		System.out.println("Phone valid: " + n.phonevalidation());

		System.out.println("Consultation fee: " + n.getConsultationFee());
	

	}

}
