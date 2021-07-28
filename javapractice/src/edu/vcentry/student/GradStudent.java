package edu.vcentry.student;

public class GradStudent extends Student {
	
	private String collegeName;

	public GradStudent(int rollNo, String name, int marks, String collegeName) {
		super(rollNo, name, marks);
		this.collegeName = collegeName;
	}

}
