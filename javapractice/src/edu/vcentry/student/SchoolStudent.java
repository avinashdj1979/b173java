package edu.vcentry.student;

public class SchoolStudent extends Student {
	
	private String schoolName;

	public SchoolStudent(int rollNo, String name, int marks, String schoolName) {
		super(rollNo, name, marks);
		this.schoolName = schoolName;
	}

}
