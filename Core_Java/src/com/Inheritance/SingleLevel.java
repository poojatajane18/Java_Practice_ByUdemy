package com.Inheritance;

class Animal {
	String color;
	void eat() {
		System.out.println("Eats");
	}
	void breathe() {
		System.out.println("Breathes");
	}
}

class Mammals extends Animal {
	int legs;
}

class Dog extends Mammals{
	String breed;
}

public class SingleLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog();
		dog.eat();
		dog.legs=4;
		System.out.println(dog.legs);
	}

}
