package com.equalOperator_equalsMethod;

class Employee{
	private String name;
	private int empid;
	private float salary;
	public Employee(String name, int empid, float salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	
}

public class Program1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Pooja", 123, 45000.50f);
		Employee emp2 = new Employee("Pooja", 123, 45000.50f);
		if(emp1.equals(emp2))  
			/*It's call super class method 
			 * Internally :- public boolean equals(Object obj) {
 			 					return (this == obj);//ok : Comparing state of References
 							}
			*/
			System.out.println("Equal");
		else 
			System.out.println("Not Equal");  //Output : Not Equal
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Pooja", 123, 45000.50f);
		Employee emp2 = new Employee("Pooja", 123, 45000.50f);
		if(emp1 == emp2)  //ok : Comparing state of Reference
			System.out.println("Equal");
		else 
			System.out.println("Not Equal");  //Output : Not Equal
	}

}
