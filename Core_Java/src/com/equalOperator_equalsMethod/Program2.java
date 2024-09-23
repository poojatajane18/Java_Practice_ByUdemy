package com.equalOperator_equalsMethod;

class Employee1{
	private String name;
	private int empid;
	private float salary;
	public Employee1(String name, int empid, float salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	//Employee this = emp1;
	//Object obj = emp;  //Upcasting 
	@Override
	public boolean equals(Object obj) { //emp2 stored in Object [Object obj = emp;  ]//Upcasting 
		if( obj != null ) {
			Employee1 other = (Employee1) obj; //Downcasting //We access subclass fields use Downcasteng
			if( this.empid == other.empid )
			 return true;
		}
		return false;
	}
}

public class Program2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 emp1 = new Employee1("Sandeep", 3778, 45000.50f );
		Employee1 emp2 = new Employee1("Sandeep", 3778, 45000.50f );
		 //Employee emp2 = null;
		if( emp1.equals(emp2) )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		 //OP : Equal
		 }

}
