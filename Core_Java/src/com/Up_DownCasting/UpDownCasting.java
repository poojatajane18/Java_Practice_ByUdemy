package com.Up_DownCasting;

class Person{
	String name;
	int age;
	public Person() {
		this.name = " ";
		this.age = 0;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void showRecord() {
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
	}
	public void printRecord() {
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
	}
}

class Employee extends Person{
	int empid;
	float salary;
	
	public Employee() {
		super();
		this.empid=0;
		this.salary=0.0f;
	}
	public Employee(String name, int age, int empid, float salary) {
		super(name,age);
		this.empid = empid;
		this.salary = salary;
	}
	public void displayRecord() {
		super.showRecord();
		System.out.println("Empid : "+this.empid);
		System.out.println("Salary : "+this.salary);
	}
	public void printRecord() {  //Method Overriding
		super.printRecord();
		System.out.println("Empid : "+this.empid);
		System.out.println("Salary : "+this.salary);
	}
}

public class UpDownCasting {
	public static void main(String[] args) {
		Person p = new Employee("Pooja",23,234,56000.78f); //----UPCASTING----
		//p.showRecord();  //P.showRecord wiil be called
		p.printRecord();  //Employee.printRecord will be call --IT is also called as DYNAMIC METHOD DISPATCH (Because this is overriden method)
		/* In case of upcasting, By using super class reference only acees the sub class method if it is override method */
		//p.displayRecord();   //Comiler Error
		
		
		Employee emp = (Employee) p;  // ------Downcasting-----
		emp.displayRecord();  /*In case of Douncasting is complusory first do UPCASTING  
		                       & it is explicit type casting*/
	}
	
	public static void main5(String[] args) {
		Person p =  new Person();
		Employee emp = (Employee) p;  //java.lang.ClassCastException: class com.Up_DownCasting.Person
		//cannot be cast to class com.Up_DownCasting.Employee   
	}
	
	public static void main4(String[] args) {
		Employee e1 = new Employee(); // ok
		Employee e2 = e1;  //ok
		e1.displayRecord();
		System.out.println(e2);
		
		Person p = new Person();  //ok
		Person p1 = p;  //ok
	}
	
	public static void main3(String[] args) {
		Employee emp = new Employee();
		emp.name = "Pooja ";
		emp.age = 23;
		emp.empid = 123;
		emp.salary = 45000.50f;
		
		//Person p = (Person)emp;  //OK : Upcasting  //It is access only super class members 
		Person p = emp ; //OK : Upcasting
		System.out.println("Name : "+p.name);
		System.out.println("Age : "+p.age);
		
		//System.out.println("Empid : "+p.empid); //NOT OK : empid cannot be resolved or is not a field
		//System.out.println("Salary : "+p.salary);//NOT OK : empid cannot be resolved or is not a field
		
	}
	
	public static void main2(String[] args) {
		Employee emp = new Employee("Sandeep",23,123,7800.60f);
		emp.showRecord();
		emp.displayRecord();
		emp.printRecord();
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.name = "sandeep";
		p.age = 23;
		//p.emp = 123;  //NOT OK   
		/* Memeber of sub class do not inherit into superclass ,
		Using super class instance we can not access sub class members only access super method */
		//p.salary = 45000.50f;  //NOT OK
		p.showRecord();
		p.printRecord();
		// p.displayRecord(); //NOT OK

	}

}
