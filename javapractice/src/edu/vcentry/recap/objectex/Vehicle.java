package edu.vcentry.recap.objectex;

public class Vehicle {

	private String type;

	public Vehicle(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void changeType(Vehicle v1) {
		v1.type = "Changed Type";
		System.out.println(v1.type);
	}
}
