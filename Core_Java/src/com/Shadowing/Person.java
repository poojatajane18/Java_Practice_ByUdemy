package com.Shadowing;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		this("", 0); //Constructor chaining
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printRecord() {
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
	}

}
