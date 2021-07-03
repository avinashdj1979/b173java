package edu.vcentry.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		//ArrayList - Class
		//List - interface
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("One");
		al.add("Two");
		al.add("Three");
		
		System.out.println("The list contains one - (true or false) - " + al.contains("one"));
		
		List<String> l = new ArrayList<String>();
		l.add(":1:");
		
		l.addAll(al);
		
		System.out.println(l.toString());
		
		l.clear();
		
		System.out.println(l.toString());
		
		System.out.println("Size of the array " + l.size());
		
		System.out.println("The index of one is " + l.indexOf("One"));
		
		boolean hasOne = l.contains("One");
		
		System.out.println("The list contains one - (true or false) - " + hasOne);
		
	}
}
