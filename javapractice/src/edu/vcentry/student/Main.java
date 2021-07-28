package edu.vcentry.student;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new SchoolStudent(1, "Ram", 100, "PSBB");
		
		System.out.printf("%s has scored ", student1.getName());
		student1.grading("Mathematics", 99);
		
		System.out.println();
		
		student1.grading(student1.getName(), "Sciene", 100);

	}

}
