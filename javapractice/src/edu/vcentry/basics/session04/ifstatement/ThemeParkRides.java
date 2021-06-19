package edu.vcentry.basics.session04.ifstatement;

public class ThemeParkRides {
	public static void main(String[] args) {
		double height = 3.2;
		boolean isHealthy = true;
		
		if (height < 4) {
			System.out.println("Not allowed for Hard Ride");
		} else if ((height >= 4) && (isHealthy == true)){  //true && false
			System.out.println("Allowed for a Hard Ride");
		} else if ((height >= 4) && (isHealthy == false)){ //true && true
			System.out.println("Not allowed for a Hard Ride");
		}
		
	}
	
	
}

// Truth table
// true && true = true
// false && true = false
// true && false = false
// false && false = false

// or Truth table
// true || true = true
// true || false = true
// false || true = true
// false || false = false
