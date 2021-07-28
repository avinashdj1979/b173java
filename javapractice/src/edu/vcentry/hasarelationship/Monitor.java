package edu.vcentry.hasarelationship;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Monitor {
	private String manufacturer;
	private String model;
	private int size;
	private Resolution resolution; //has a 
	
	public Monitor() {
		
	}
	
	public Monitor(String manufacturer, String model, int size, Resolution resolution) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.size = size;
		this.resolution = resolution;
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
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Resolution getResolution() {
		return resolution;
	}
	public void setResolution(Resolution resolution) {
		this.resolution = resolution;
	}
}
