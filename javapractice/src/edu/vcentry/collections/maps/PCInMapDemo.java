package edu.vcentry.collections.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import edu.vcentry.hasarelationship.Monitor;
import edu.vcentry.hasarelationship.MotherBoard;
import edu.vcentry.hasarelationship.PC;
import edu.vcentry.hasarelationship.Resolution;

public class PCInMapDemo {

	public static void main(String[] args) {
		
		Map<String, PC> pcMap = new LinkedHashMap<String, PC>();
		
		Resolution myRes = new Resolution(1980, 1240);
		Monitor myMonitor = new Monitor("Samsung", "SM1234", 27, myRes);
		MotherBoard myMotherBoard = new MotherBoard("ASUS", "ASUS1234", 4, 3, "2.10");
		PC myPc1 = new PC(myMonitor, myMotherBoard);
		
		Resolution myRes2 = new Resolution(4280, 2940);
		Monitor myMonitor2 = new Monitor("LG", "LG234", 32, myRes);
		MotherBoard myMotherBoard2 = new MotherBoard("Intel", "Intel1234", 4, 3, "3.10");
		PC myPc2 = new PC(myMonitor2, myMotherBoard2);
		
		pcMap.put("compB", myPc2);
		pcMap.put("compA", myPc1);

		Set<String> keys = pcMap.keySet();
		
		for(String key : keys) {
			PC pc = pcMap.get(key);
			System.out.printf("Computer %s's Monitor's Manufacturer is %s\n", key, pc.getMonitor().getManufacturer());
		}

	}

}
