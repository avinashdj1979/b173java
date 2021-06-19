package edu.vcentry.basics.session05.whileloop;

public class WhileLoop {

	public static void main(String[] args) {
		int num = 0;
		while(num < 20)
		{
			if(num % 5 == 0) {
				System.out.println(num);
			}
			num = num + 1;
		}
	}
}

// Algorithm - to print all numbers between (1 to 20) which are divisible by 5

/*
 1st time
 =>  num = 0
 => if (num < 20) (0 < 20) ==> true
		check (if num is divisible by 5) == true
 			print (the number)
 		num = num + 1
 2nd time
 => if (num < 20) (1 < 20) ==> true
 		check (if num is div by 5) == true
 			print (the number)
 	num = num + 1
 */

