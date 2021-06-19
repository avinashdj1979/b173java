package edu.vcentry.basics.session05.forloop;

public class ForLoopToPrintEvenNumbers {

	public static void main(String[] args) {
		for(int count = 1; count < 21; count += 2) {
			System.out.println(count);
		}
	}
}

/*
1st time
==> count = 0 (only for the 1st time)
=============
==> count < 21
==> print the count
==> count = count + 2 = 3
2nd time 
==>count < 21 ==> 3 < 21 ==> true
==> print count
==> count = count + 2 = 5
3rd time 
==>count < 21 ==> 5 < 21 ==> true
==> print count
==> count = count + 2 = 4
20. count < 21 ==> false



*/