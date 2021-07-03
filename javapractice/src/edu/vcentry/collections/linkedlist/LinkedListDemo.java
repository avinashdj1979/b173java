package edu.vcentry.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		List<Integer> llInt = new LinkedList<Integer>();
		
		llInt.add(1);
		llInt.add(2);
		llInt.add(3);
		llInt.add(3);
		
		List<Double> llDouble = new LinkedList<Double>();
		
		llDouble.add(1.0);
		llDouble.add(2.0);
		llDouble.add(3.0);
		llDouble.add(3.0);
		llDouble.add(4.5);
		
		System.out.println(llDouble.size());
		
		Iterator<Double> iter = llDouble.iterator();
		while(iter.hasNext()) {
			double d = iter.next();
			System.out.println(d);
		}
		
		System.out.println("Using Lambdas");
		llDouble.forEach(val ->  System.out.println(val));
	}
}
