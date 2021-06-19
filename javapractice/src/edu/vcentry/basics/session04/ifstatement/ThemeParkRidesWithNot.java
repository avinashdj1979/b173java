package edu.vcentry.basics.session04.ifstatement;

public class ThemeParkRidesWithNot {
	public static void main(String[] args) {
		double height = 4.2;		// 7 feet
		boolean isHealthy = false; // isNotHealthy
		char rideAtRisk = 'n'; 
		boolean softRide = true;  // softRide = true it is soft ride / else hard ride  // hardRide
		
//		if(!softRide) {
//			if (height < 4) {
//				System.out.println("Not allowed for Hard Ride");
//			} else if ((height >= 4) && (isHealthy == true)){  //true && false
//				System.out.println("Allowed for a Hard Ride");
//			} else if ((height >= 4) && (isHealthy == false)){ //true && true
//				System.out.println("Not allowed for a Hard Ride");
//			}
//		} else {
//			if (height < 4) {
//				System.out.println("Not allowed for Soft Ride");
//			} else if (isHealthy || (rideAtRisk == 'y')) {
//				System.out.println("Allowed for Soft Ride");
//			} else {
//				System.out.println("Not Allowed for Soft Ride");
//			}
//		}
		
		if(height >= 4) {
			if(!softRide) {
				if ((height >= 4) && (isHealthy == true)){  //true && false
					System.out.println("Allowed for a Hard Ride");
				} else if ((height >= 4) && (isHealthy == false)){ //true && true
					System.out.println("Not allowed for a Hard Ride");
				}
			} else {
				if (isHealthy || (rideAtRisk == 'y')) {
					System.out.println("Allowed for Soft Ride");
				} else {
					System.out.println("Not Allowed for Soft Ride");
				}
			}
		} else {
			System.out.println("Not allowed for any rides");
		}

	}
	
	
}

// Not Truth table
// !true = false
// !false = true


// You cannot start with else if
// else cannot be followed by a condition
