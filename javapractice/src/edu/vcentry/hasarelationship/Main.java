package edu.vcentry.hasarelationship;

public class Main {

	public static void main(String[] args) {
		Resolution myRes = new Resolution(1980, 1240);
		Monitor myMonitor = new Monitor("Samsung", "SM1234", 27, myRes);
		MotherBoard myMotherBoard = new MotherBoard("ASUS", "ASUS1234", 4, 3, "2.10");
		PC myPc = new PC(myMonitor, myMotherBoard);
		
		System.out.println(myPc.getMotherBoard().getBiosVersion());
		System.out.println(myPc.getMonitor().getResolution().getHeight());
	}
}
