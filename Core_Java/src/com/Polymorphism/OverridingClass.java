package com.Polymorphism;

class Person {
	public void printRecord() {
		System.out.println("Person.printRecord");
	}
}

class Employee extends Person{
	@Override
	public void printRecord() {
		System.out.println("Employee.printRecord");
	}
}

public class OverridingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Employee();  // Upcasting
		p.printRecord();  //Dynamic method dispatch
	}

}
