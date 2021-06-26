package edu.vcentry.hasarelationship;

public class MotherBoard {
	
	private String manufacturer;
	private String model;
	private int cardSlots;
	private int ramSlots;
	private String biosVersion;
	
	
	/**
	 * @param manufacturer
	 * @param model
	 * @param cardSlots
	 * @param ramSlots
	 * @param biosVersion
	 */
	public MotherBoard(String manufacturer, String model, int cardSlots, int ramSlots, String biosVersion) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.cardSlots = cardSlots;
		this.ramSlots = ramSlots;
		this.biosVersion = biosVersion;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCardSlots() {
		return cardSlots;
	}
	public void setCardSlots(int cardSlots) {
		this.cardSlots = cardSlots;
	}
	public int getRamSlots() {
		return ramSlots;
	}
	public void setRamSlots(int ramSlots) {
		this.ramSlots = ramSlots;
	}
	public String getBiosVersion() {
		return biosVersion;
	}
	public void setBiosVersion(String biosVersion) {
		this.biosVersion = biosVersion;
	}
	
	

}
