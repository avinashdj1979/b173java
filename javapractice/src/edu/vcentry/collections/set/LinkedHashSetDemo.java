package edu.vcentry.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		//List l = new ArrayList();
		
		Set<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("Apple");
		lhs.add("Tomato");
		lhs.add("Orange");
		lhs.add("Grapes");
		
//		System.out.println("Using for");
//		for(String val : hs) {
//			System.out.println(val);
//		}
//		
//		//Iterating using lambdas
//		System.out.println("Using Lambdas");
//		hs.forEach(val ->  System.out.println(val));
//		
//		hs.remove("Grapes");
//		
//		System.out.println("Set contains grapes - " + hs.contains("Grapes"));
//		
//		System.out.println("Using Iterator - After removing Grapes");
//		Iterator iter = hs.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
//		lhs.add("apple");
//		System.out.println("Using Lambdas");
//		lhs.forEach(val ->  System.out.println(val));
		
		System.out.println("Is set Empty " + lhs.isEmpty());
		lhs.clear();
		System.out.println("Is set Empty " + lhs.isEmpty());
	}

}
