package edu.vcentry.methodoverlading;

public class LeaderBoard {

	public void leaderBoard(String name, int score) {
		if(score >= 1000) {
			System.out.printf("%s is ranked 1\n", name);
		} else if (score >= 500){
			System.out.printf("%s is ranked 2\n", name);
		} else if (score >= 100) {
			System.out.printf("%s is ranked 3\n", name);
		} else {
			System.out.printf("%s is ranked 4\n", name);
		}
	}
	
	//method definition
	public void leaderBoard(int score, String name) {
		leaderBoard(name, score);
		System.out.println("I am in leaderBoard(int score, String name) ");
	}
	
	public void leaderBoard(int score) { // calling method
		String name = "unknown";
		leaderBoard(name, score); // called method
		System.out.println("I am in leaderBoard(int score) ");
	}
	
	
	public static void main(String args[]) {
		LeaderBoard lb = new LeaderBoard();
		lb.leaderBoard("Raj", 99);
		lb.leaderBoard(600 , "Kumar"); // calling
		lb.leaderBoard(3000);
	}
}


/*
Algoritm
1000 and above - rank 1
500 and above but less than 1000 - rank 2
100 or less - rank 3

When a Non Static method is called from a static method
- it has be called with the help of object.
*/
