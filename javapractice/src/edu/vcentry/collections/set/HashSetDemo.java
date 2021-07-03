package edu.vcentry.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//List l = new ArrayList();
		
		Set<String> hs = new HashSet<String>();
		
		hs.add("Apple");
		hs.add("Orange");
		hs.add("Grapes");
		
		System.out.println("Using for");
		for(String val : hs) {
			System.out.println(val);
		}
		
		//Iterating using lambdas
		System.out.println("Using Lambdas");
		hs.forEach(val ->  System.out.println(val));
		
		hs.remove("Grapes");
		
		System.out.println("Set contains grapes - " + hs.contains("Grapes"));
		
		System.out.println("Using Iterator - After removing Grapes");
		Iterator iter = hs.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		hs.add("apple");
		System.out.println("Using Lambdas");
		hs.forEach(val ->  System.out.println(val));
	}

}
