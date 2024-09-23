package com.example.main;
import p1.A;
import p1.B;
import p1.C;
import p2.D;
import p2.E;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Private
		/* private Acees-Modifier it is accessible only in same class
		A a = new  A();
		a.showRecord();
		*/
		
		
		//Package level Private
		/*A a = new  A();
		a.showRecord(); // Accessible in same class
		*/
		/*
		B b = new B();
		b.displayRecord(); // Accessible in sub Class
		*/
		//------Not accessible in different package----
		/*
		C c = new C();
		c.printRecord(); // Accessible in Non-sub class in same package but create instance
		*/
		
		
		//Protected
		/*A a = new A();
		a.showRecord(); //accessible in same class
		/*
		B b = new B();
		b.displayRecord();  //Accessible in subclass
		*/
		/*
		C c = new C();
		c.printRecord();// Accessible in Non-sub class in same package but create instance
		*/
		/*
		D d = new D();
		d.printNum1();//Accessible in subclass in different package
		*/
		/*Not accessible in non-subclass in different package*/
		
		
		//Public
		/*A a = new A();
		a.showRecord();//accessible in same class
		*/
		/*
		B b = new B();
		b.displayRecord();  //Accessible in subclass
		*/
		/*
		C c = new C();
		c.printRecord();// Accessible in Non-sub class in same package but create instance
		*/
		/*
		D d = new D();
		d.printNum1();//Accessible in subclass in different package
		*/
		E e = new E();
		e.displayNum1();//Accessible in non-subclass in different package
	
	}

}
