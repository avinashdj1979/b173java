package edu.vcentry.collections.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("Ram", "A");
		map.put("John", "B");
		map.put("Asif", "C");
		
		System.out.printf("Ram's grade is %S\n", map.get("Ram"));
		
		System.out.println(map);
		
		//Iteration of map
		Set<String> keySet = map.keySet();
		System.out.println("Key set" + keySet);
		
		for(String key : keySet) {
			System.out.println(key);
			System.out.printf("%S's grade is %S\n", key, map.get(key));
		}
		
		//Lambdas
		map.forEach((k,v) -> {
			System.out.println("Key:" + k);
			System.out.println(k + "==>" + v);
			});
		
		map.clear();
		System.out.println(map);

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