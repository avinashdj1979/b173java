package edu.vcentry.interfaces;

public interface Sports extends WeLove, Majors{
	
	public static final boolean TRUE = true;
	boolean FALSE = false;

	public void winner();

	public void tie();
	
	boolean isOlympicSport();
	
	default void manOfTheMatch() {
		System.out.println("The Best Player");
	}
	
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

1. Interface can extend another interface
2. A Class can implement interface, and it has a contract to implement(give definition) to all the declared methods in the interface
3. An Interface can have default or static method with definition
4. Static method cannot be overriden
5. Default method can be overriden
6. Interfaces can be public or default.
7. All methods in the interface are public by default
8. All variables in the interface are public, static, final by default
9. A class can implement multiple interfaces

*/