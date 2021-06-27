package edu.vcentry.interfaces;

public interface Sports extends WeLove, Majors{
	
	public static final boolean TRUE = true;
	boolean FALSE = false;

	public void winner();

	public void tie();
	
	public boolean isOlympicSport();
	
	default void teamSport() {
		System.out.println("It is an individual Sport");
	}
	
	static boolean isAudienceAllowed() {
		return false;
	}
}



/*
winner()
tie()
isOlympicSport()
*/