package edu.vcentry.interfaces;

public class Cricket implements Sports{

	@Override
	public void tie() {
		System.out.println("Score are Level");
	}

	@Override
	public boolean isOlympicSport() {
		return Sports.FALSE;
	}

	@Override
	public void winner() {
		System.out.println("Team which score more Runs");
	}

	@Override
	public void weLoveSport() {
		System.out.println("We Love Cricket");
	}

	@Override
	public void majors() {
		
	}
}
