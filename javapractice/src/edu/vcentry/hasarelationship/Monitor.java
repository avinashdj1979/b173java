package edu.vcentry.hasarelationship;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Monitor {
	private String manufacturer;
	private String model;
	private int size;
	private Resolution resolution; //has a 
}
