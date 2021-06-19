package edu.vcentry.basics.session05.dowhile;

public class DoWhileEvenNumbers {

	public static void main(String[] args) {
		int num = 24; // initialization
		do {
			//block of code
			if(num % 2 == 0) { 
				System.out.println(num);
			}
			num = num + 1; // increment
		}while(num < 21); // condition
		
		num = 2;
		while (num < 21) { // condition
			if(num % 2 == 0) { 
				System.out.println(num);
			}
			num += 1; // increment
		}
		System.out.println("out side while");
//		
//		num = 0;
//		for(;num < 21;) {
//			if(num % 2 == 0) { 
//				System.out.println(num);
//			}
//			num = num + 1;
//		}
//		
//		num = 0;
//		for(;;) {
//			if (num > 20) {
//				break;
//			}
//			if(num % 2 == 0) { 
//				System.out.println(num);
//			}
//			num = num + 1;
//		}
	}
}

// syntax
// do {
// block of code line 1
// line2
// ..
// ..
// } while(condition);