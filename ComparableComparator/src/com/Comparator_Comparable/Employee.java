package com.Comparator_Comparable;

import java.time.LocalDate;


public class Employee implements Comparable<Employee>{
	 private int empNumber;
	 private String empName;
	 private String job;
	 private int manager;
	 private LocalDate hireDate;
	 private float salary;
	 private float commision;
	 private int deptNumber;
	 
	 
	 public Employee(int empNumber, String empName, String job, int manager, LocalDate hireDate, float salary,
			float commision, int deptNumber) {
		super();
		this.empNumber = empNumber;
		this.empName = empName;
		this.job = job;
		this.manager = manager;
		this.hireDate = hireDate;
		this.salary = salary;
		this.commision = commision;
		this.deptNumber = deptNumber;
	}
	@Override
	 public int compareTo(Employee other) {
		 return this.empNumber - other.empNumber;
	 }
	 @Override
	 public String toString() {
		return String.format("%-5d%-10s%-10s%-5d%-15s%-10.2f%-10.2f%-5d",
		this.empNumber, this.empName, this.job, this.manager, this.hireDate,
		this.salary, this.commision, this.deptNumber);
	 }
	public int getDeptNumber() {
		// TODO Auto-generated method stub
		return this.deptNumber;
	}
	public LocalDate getHireDate() {
		// TODO Auto-generated method stub
		return this.hireDate;
	}
	public String getEmpName() {
		// TODO Auto-generated method stub
		return this.empName;
	}
	public String getJob() {
		// TODO Auto-generated method stub
		return this.job;
	}


}
