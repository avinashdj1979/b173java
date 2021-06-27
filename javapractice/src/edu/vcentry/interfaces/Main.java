package edu.vcentry.interfaces;

public class Main {

	public static void main(String[] args) {
		//Sports cricket = new Sports();
		// We can instantiate the interface.
		
		Sports cricket = new Cricket();
		//WeLove cric = new Cricket();
		
		cricket.tie();
		//cric.weLoveSport();
		
		Sports tennis = new Tennis();
		tennis.tie();

		//Majors tennisMajors = new Tennis();
		tennis.majors();
		
		tennis.weLoveSport();
		
		//Accessing the default method
		cricket.teamSport();
		
		Sports.isAudienceAllowed();

	}

}
