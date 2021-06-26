package edu.vcentry.hasarelationship;

public class PC {
	
	private Monitor monitor;
	private MotherBoard motherBoard;
	
	
	public PC(Monitor monitor, MotherBoard motherBoard) {
		this.monitor = monitor;
		this.motherBoard = motherBoard;
	}
	
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
	public Monitor getMonitor() {
		return monitor;
	}

	public MotherBoard getMotherBoard() {
		return motherBoard;
	}

	public void setMotherBoard(MotherBoard motherBoard) {
		this.motherBoard = motherBoard;
	}
	

}
