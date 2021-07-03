package edu.vcentry.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//ArrayList - Class
		//List - interface
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("One"); //0
		al.add("Two"); //1
		al.add("Three"); //2
		
		List<String> l = new ArrayList<String>();
		l.add(":1:");
		
		//Reading from Array List
		String index2Val = al.get(2);
		
		System.out.println("The value at index 2 is " + index2Val);
		
		System.out.println("Iterating all objects in the array List using for each");
		for(String val : al) {
			System.out.println("The value is " + val);
		}
		
//		//size() method gives the length(Number of elements in the ArrayList) 
//		int size = al.size();
//		
//		System.out.println("Iterating all objects in the array List using index");
//		for(int ctr=0; ctr < size; ctr++) {
//			System.out.println(al.get(ctr));
//		}
//		
//		System.out.println("Iterating all objects in the array List using iterator");
//		Iterator<String> iter = al.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
		//Three to :3:
		
		int indexOfThree = al.indexOf("Three");
		
		al.set(indexOfThree, ":3:"); //modify
		
		System.out.println("Iterating all objects in the array List using for each : After Replacement");
		for(String val : al) {
			System.out.println("The value is " + val);
		}
		
		al.add(1,"One and Half"); //adding new element
		
		System.out.println("Iterating all objects in the array List using for each : After adding an element between one and two");
		for(String val : al) {
			System.out.println("The value is " + val);
		}
		
		al.remove(1);
		
		System.out.println("Iterating all objects in the array List using for each : Remove One And Half");
		for(String val : al) {
			System.out.println("The value is " + val);
		}
		
	}

}
