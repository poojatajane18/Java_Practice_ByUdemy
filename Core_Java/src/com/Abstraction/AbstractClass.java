package com.Abstraction;

abstract class Animal{
	void eat() {
		System.out.println("Eat Anything");
	}
	abstract void walk(); // Abastract method
}

class Horse extends Animal {

	@Override
	void walk() {
		// TODO Auto-generated method stub
		System.out.println("Walks on 4 legs");
	}
	
}

class Chicken extends Animal{

	@Override
	void walk() {
		// TODO Auto-generated method stub
		System.out.println("Walks on 2 legs");
	}
	
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse h = new Horse();
		h.eat();
		h.walk();
		
		Chicken c = new Chicken();
		c.eat();
		c.walk();

	}

}
