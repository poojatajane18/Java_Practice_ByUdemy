package com.Shadowing;

public class Employee extends Person{
	private int empid;
	private float salary;
	
	public Employee() {
		this("", 0, 0, 0.0f);
	}
	
	public Employee(String name,int age, int empid,float salary) {
		super(name,age);
		this.empid = empid;
		this.salary = salary;
	}
	public void printRecord() {  //Overriden Method
		super.printRecord();
		System.out.println("Empid : "+this.empid);
		System.out.println("Salary : "+this.salary);
	}

}
