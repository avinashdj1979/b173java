package edu.vcentry.interfaces;

public class Tennis implements Sports, Majors {

	@Override
	public void winner() {
		System.out.println("Who wins 3 out of 5 sets is the winner");
	}

	@Override
	public void tie() {
		System.out.println("Tie is not possible in Tennis");
	}

	@Override
	public boolean isOlympicSport() {
		return Sports.TRUE;
	}

	@Override
	public void weLoveSport() {
		System.out.println("We love Tennis");
	}

	@Override
	public void majors() {
		System.out.println("Wimbledon, French, Australian and US");
	}
}
