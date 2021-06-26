package edu.vcentry.interfaces;

public class Main {

	public static void main(String[] args) {
		Sports cricket = new Cricket();
		//WeLove cric = new Cricket();
		
		cricket.tie();
		//cric.weLoveSport();
		
		Sports tennis = new Tennis();
		tennis.tie();

		//Majors tennisMajors = new Tennis();
		tennis.majors();
		
		tennis.weLoveSport();

	}

}
