package com.wrapper;

import java.util.Date;

/*We can directly store reference of sub class instance into super class reference variable. It is
called as upcasting.*/

class Person{
	
}

class Employee extends Person{
	
}

public class Upcasting {
	public static void main(String[] args) {
		//Person p = new Employee();  //Upcasting
		
		Employee emp = new Employee();
		//Person p = (Person)emp; //OK: Upcasting
		Person p = emp; //OK: Upcasting
		
		
		/*
		 * We can convert reference super class into reference of sub class. It is called as downcasting.
					Person p = new Employee( ); //Upcasting
					Employee emp = (Employee)p; //Downcasting
		 */
		
		
		//Employee e = new Person();  //Compile time checking => Compiler Error
		
		Person p1 = new Person();
		Employee emp1 = (Employee)p1;   //java.lang.ClassCastException 
		
		
		Object obj = new Date();
		Date date = (Date) obj;
		String str = (String)obj;   // java.lang.ClassCastException
		
		
	}

}
