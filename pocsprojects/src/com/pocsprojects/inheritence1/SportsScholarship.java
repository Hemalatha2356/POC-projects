package com.pocsprojects.inheritence1;

public class SportsScholarship extends ScholarshipImpl{
	boolean checkEligibility() {
		boolean sports = Sportsachievements();
		if(sports) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		MeritScholarship m = new MeritScholarship();
		boolean result = m.checkEligibility();
		
		if(result) {
			System.out.println("merit scholrship approved");
		}else {
			System.out.println("merit scholrship not approved");
		}
		
		SportsScholarship ss = new SportsScholarship();
		boolean result2 = ss.checkEligibility();
		
		if(result2) {
			System.out.println("SportsScholarship approved");
		}else {
			System.out.println("SportsScholarship not approved");
		}
		

	}

}
