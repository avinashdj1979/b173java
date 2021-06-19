package edu.vcentry.basics.session05.forloop;

public class ForLoopToPrintOddNumbers {

	public static void main(String[] args) {
		for(int count = 1; count < 21; count += 1) {
			if(count % 2 == 1) {
				System.out.println(count);
			}
		}
	}
}

/*
1st time
==> count = 1 (only for the 1st time
=============
==> count < 21
==> if the count % 2 == 1 , print the count
==> count = count + 1 = 2
2nd time 
==>count < 21 ==> 2 < 21 ==> true
==> block of code
==> count = count + 1 = 3
....
20. count < 21 ==> false



*/