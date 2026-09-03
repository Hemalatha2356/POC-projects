package com.pocsprojects.inheritence1;

public class MeritScholarship extends ScholarshipImpl{
	
	boolean checkEligibility() {
		int marks = studentMarks();
		int attendence = Attendence();
		double Income = familyIncome();
		int ageValue = age();
		
		if(marks>=80&&attendence>=75&&Income <= 500000&&ageValue<=25) {
			return true;
		}else {
			return false;
		}
	}

}
