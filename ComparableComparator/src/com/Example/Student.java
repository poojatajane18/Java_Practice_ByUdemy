package com.Example;

public class Student extends Person{
	private int rollNumber;
	public Student(String name, int rollNumber) {
		// TODO Auto-generated constructor stub
		super(name);
		this.rollNumber = rollNumber;
	}
	public int getRollNumber() {
		return this.rollNumber;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-15s%-5d",super.getName(),this.rollNumber);
	}

}
