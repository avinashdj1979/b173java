package edu.vcentry.classes.basics;

public class Main2 {

	public static void main(String[] args) {
		
		Person karthi = new Person();
		
		karthi.setAge(24);
		karthi.setName("Karthik kumar");
		
		System.out.println("karthi's age " + karthi.getAge());
		System.out.println("karthi's name " + karthi.getName());
		
//		Person dinesh = new Person(); 
//		
//		Person dinesh1 = dinesh;
		
		Person dinesh = karthi; //now dinesh and karthi will point to the same object
		
		System.out.println("Dinesh's age " + dinesh.getAge());
		System.out.println("Dinesh's name " + dinesh.getName());
		
//		karthi = null;
		
		karthi.setAge(40);
		karthi.setName("Gautam");
		
		
//		System.out.println("karthi's age " + karthi.getAge());
//		System.out.println("karthi's name " + karthi.getName());
		
		System.out.println("Dinesh's age " + dinesh.getAge());
		System.out.println("Dinesh's name " + dinesh.getName());
		
		dinesh.setAge(1);
		dinesh.setName("Sachin");
		
		System.out.println("karthi's age " + karthi.getAge());
		System.out.println("karthi's name " + karthi.getName());

	}

}
/*
Object -> instance


*/
