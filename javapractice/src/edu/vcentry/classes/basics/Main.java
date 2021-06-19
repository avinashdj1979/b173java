package edu.vcentry.classes.basics;

public class Main {

	public static void main(String[] args) {
		
		//new Person(); -> object created with reference

		Person santhosh = new Person();
		
		System.out.println("Santosh's age " + santhosh.getAge());
		System.out.println("Santosh's name " + santhosh.getName());
		
		santhosh.setAge(22);
		santhosh.setName("Santhosh kumar");
		
		System.out.println("Santosh's age " + santhosh.getAge());
		System.out.println("Santosh's name " + santhosh.getName());
		
		//System.out.println(santhosh.Name); //private
		
		Person gautam = new Person();
		
		gautam.setAge(23);
		gautam.setName("Gautham Gambhir");
		
		System.out.println("Gautam's age " + gautam.getAge());
		System.out.println("Gautam's name " + gautam.getName());
		
		Person karthi = new Person();
		
		karthi.setAge(24);
		karthi.setName("Karthik kumar");
		
		System.out.println("karthi's age " + karthi.getAge());
		System.out.println("karthi's name " + karthi.getName());
		
	}

}
/*
Object -> instance


*/
