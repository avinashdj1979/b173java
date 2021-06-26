package edu.vcentry.classes.inheritance;

public class American extends Person{
	
	//Is-A relationship
	//Indian is a Person
	//American is a person
	
	private String ssn;

	public American() {
		super();
	}

	public American(String name, int age, String ssn) {
		super(name, age);
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	@Override
	public void eats() {
		System.out.println("My name is " + getName() + " and i eat American Food");
	}

}


/*


*/