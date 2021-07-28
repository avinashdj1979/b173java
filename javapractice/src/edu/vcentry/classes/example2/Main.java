package edu.vcentry.classes.example2;

public class Main extends Television{
	
	public void nonStatic() {
		setName("LG");
	}

	public static void main(String[] args) {
		Television t1 = new Television();
		t1.setName("LG");
		System.out.println(t1.getName());
		hi(t1.getName());
		Television t2 = new Television();
		t2.setName("Samsung");
		System.out.println(t2.getName());
	}
}


/*
1. Create an object of Television class lg
	Television lg = new Television()
2. Set the name of lg object
	lg.setName("LG")
3. print the name of lg object
	sysout(lg.getName())

Repeat 1, 2 and 3 for the next object


*/