package edu.vcentry.basics.session04.ifstatement;

public class IFConstruct {
	public static void main(String[] args) {
		int myNum1 = 7;
		int myMod = myNum1 % 2;
		boolean result = (myMod == 0);  // true or false
		System.out.println("My conditional expression output is " + result);
		
		
		if(result) {
			System.out.printf("%d is even\n", myNum1);
		} else {
			System.out.printf("%d is odd\n", myNum1);
		}
		
		
		
		System.out.println(myMod);
	}
}


// myNum1 % 2 == 0 - Conditional Expression - boolean - true or false
// = -> assignment operator
// % -> modulo operator
//  / -> division

// Condition operator
// == -> Equality operator
// { .... } - Block of Code

//int myNum2 = 3;
//
//double myDouble1 = 7d;
//double myDouble2 = 3d;
//
////Modulo - %
//
//int div = myNum1 / myNum2; //Q
//
//int mod = myNum1 % myNum2; //R
//
//System.out.println("Output for division = " + div);
//System.out.println("Output for modulo = " + mod);
//
//double doubleDivide = myDouble1 / myDouble2;
//
//System.out.println("Output for decimal Division = " + doubleDivide);