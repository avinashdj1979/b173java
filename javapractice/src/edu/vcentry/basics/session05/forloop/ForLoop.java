package edu.vcentry.basics.session05.forloop;

public class ForLoop {
	public static void main(String[] args) {
		System.out.println("Starting of for loop");
		for(int count = 0; count < 5; count += 1) {
			System.out.println("Hello");
		}
	}
}

// count = count + 1
// count += 1;
// count++

// Algorithm to print Hello , 5 times

/*
1. first time
-> count = 0, **** Executed only once for the loop that is for the first time
-> if count < 5
-> print Hello
-> increase the count by 1 -> 0 + 1, count = 1
// 2nd time 
-> if count < 5 - ( 1 < 5 --> true)
-> print Hello
-> count 1 + 1 = 2
// 3rd time
-->if count < 5 -- ( 2 < 5 --> true)
--> print Hello
--> count 2 + 1 = 3
// 4th time
-->if count < 5 -- ( 3 < 5 --> true)
--> print Hello
--> count 3 + 1 = 4 
// 5th time
--> if count < 5, (4 < 5) --> true
--> print Hello
--> count 4 + 1 = 5, (5 < 5) --> false
--> break the loop.
*/
