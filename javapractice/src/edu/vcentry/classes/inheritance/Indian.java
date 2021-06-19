package edu.vcentry.classes.inheritance;

public class Indian extends Person{
	
	//Is-A relations
	//Indian is a Person
	
	private String aadhaar;

	Indian(){
		//super //This is the default behavior
		//super();
		aadhaar = "NA";
	}
	
	
	Indian(String name, int age, String aadhaar){
		//super(); //This is the default behavior
		super(name, age);
		this.aadhaar = aadhaar;
	}
	
	public String getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}

	@Override
	public void eats() {
		System.out.println("My name is " + getName() + " and i eat Indian Food");
	}
	
	public void canVote() {
		if(getAge() >= 18) {
			System.out.printf("%s can vote\n", getName());
		} else {
			System.out.printf("%s cannot vote\n", getName());
		}
	}
	
}


/*


*/