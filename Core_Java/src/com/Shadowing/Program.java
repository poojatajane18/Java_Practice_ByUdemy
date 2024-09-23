package com.Shadowing;

/*If name of super class method and sub class method is same and if we try to invoke such
method on instance of sub class then preference will be given to the sub class method. It is
called as method shadowing.*/

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Sandeep",23,456,45000.5f);
		//emp.printRecord();
		/*-----SHADOWING
		 * Empid : 456
		   Salary : 45000.5
		 */
		
		emp.printRecord();  
		/*	Using super.printRecord() in subclass method
		 * 	Name : Sandeep
			Age : 23
			Empid : 456
			Salary : 45000.5
		 */
	}

}
