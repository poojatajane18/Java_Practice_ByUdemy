package com.Inheritance;

class Person{
	String name;
	int age;
	
	public void showRecord() {
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
	}
}

class Employee extends Person{
	int empid;
	float salary;
	
	public void displayRecord() {
		System.out.println("Empid : "+this.empid);
		System.out.println("Salary : "+this.salary);
	}
}

public class Program {
	
	public static void main(String[] args) {
		
		/*During inheritance, members of super class inherit into sub class. Hence using sub class instance, we
		can access members of super class as well as sub class.*/
		
		Employee emp = new Employee();
		emp.name = "Pooja";
		emp.age = 23;
		emp.empid = 3778;
		emp.salary = 45000.45f;
		emp.showRecord();
		emp.displayRecord();
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.name = "Pooja";
		p.age = 23;
		p.showRecord();
		
		
		/*During inheritance, members of sub class do not inherit into super class. Hence using super class
		instance, we can access members of super class only*/
		
		//p.empid=3778;
		//p.salary=45000.50f;   //NOT OK
		//p.displayRecord();

	}

}
