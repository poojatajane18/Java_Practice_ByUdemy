package com.Example;

public class Employee extends Person{
	private int empid;
	public Employee(String name, int empid) {
		// TODO Auto-generated constructor stub
		super(name);
		this.empid = empid;
	}
	public int getEmpid() {
		return this.empid;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-15s%-5d",super.getName(),this.empid);
	}
}
