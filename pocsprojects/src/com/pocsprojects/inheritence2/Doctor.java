package com.pocsprojects.inheritence2;

public class Doctor extends PersonImpl{
	

	public boolean Doctoravaliability() {
		System.out.println(" Doctoravaliability true/false : ");
		boolean avaliability = sc.nextBoolean();
		return avaliability;
	}
	
	public boolean appoinment() {
		boolean availability = Doctoravaliability();
		if(availability) {
			System.out.println("approved");
			return true;
		}else {
			System.out.println("not approved");
			return false;
		}
		
	}
	@Override
	public double getConsultationFee() {
		return 500;
	}

	
}
