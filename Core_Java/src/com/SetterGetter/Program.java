package com.SetterGetter;

class Student1{
	private String name;
	private int rollNumber;
	private float marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		if(marks > 100)
			throw new IllegalArgumentException("Invalid Marks");
		this.marks = marks;
	}
	
}


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1();
		s1.setName("Pooja");
		s1.setRollNumber(11);
		s1.setMarks(56.72f);
		
		String name = s1.getName();
		int rollNumber = s1.getRollNumber();
		float marks= s1.getMarks();
		
		System.out.println(name+" "+rollNumber+" "+marks);

	}

}
