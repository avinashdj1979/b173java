package edu.vcentry.collections.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ListInMapDemo {

	public static void main(String[] args) {
		
		List<String> fruitsList = new LinkedList<String>();
		fruitsList.add("Apple");
		fruitsList.add("Orange");
		
		List<String> vegsList = new LinkedList<String>();
		vegsList.add("Onion");
		vegsList.add("Potato");
		
		List<String> oilsList = new LinkedList<String>();
		oilsList.add("Cocunut oil");
		oilsList.add("Mustard oil");
		
		Map<String, List<String>> itemsMap = new HashMap<String, List<String>>();
		
		itemsMap.put("fruits", fruitsList);
		itemsMap.put("vegetables", vegsList);
		itemsMap.put("oils", oilsList);
		
		Set<String> keys = itemsMap.keySet();
		
		for(String key : keys) {
			List<String> l = itemsMap.get(key);
			System.out.println(key + "=>" + l);
		}

	}

}


/*
Map - > key, value pair

list.add("A");
list.add("B");

map.add("Ram","GradeA");

Homework
3 LinkedList, fruits, vegetables, oils

LinkedList<String> fruitList = new LinkedList<String>();
fruitList.add("Apple");

//VegList
vegList.add
//oilsList
oilsList.add..

add 3 linkedList to the Map

Iterate the Map
Map Keys - fruits, vegetables, oils
Map<String, LinkedList> myMap = new HashMap<String,LinkedList>();
myMap.put("fruits", fruitList);
myMap.put("vegetables", VegList);

Set<String> keySet = myMap.keySet();

for(String key : keySet){
	LinkedList l = myMap.get(key);
	sysout(key);
	for(String s : l){
		sysout(l)
	}

}

*/