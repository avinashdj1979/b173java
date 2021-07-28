package edu.vcentry.student;

public class Student {
	
	private int rollNo;
	private String name;
	private int marks;
	
	public Student(int rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	public void grading(String subject, int marks) {
		String grade = "D";
		if(marks > 80) {
			grade = "A";
		} else if(marks > 60) {
			grade = "B";
		} else if(marks > 40) {
			grade = "C";
		} 
		
		System.out.printf("%d in %s and the grade is %s", marks, subject, grade);
	}
	
	
	public void grading(int marks) {
		grading("GK", 99);
	}
	
	
	public void grading(String name, String subject, int marks) {
		System.out.printf("%s has scored ", name);
		grading(subject, marks);
	}
}
