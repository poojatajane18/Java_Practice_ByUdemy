package com.Inheritance;

class Animal1 {
	String color;
	void eat() {
		System.out.println("Eats");
	}
	void breath() {
		System.out.println("Breath");
	}
}

class Mammal extends Animal1{
	void walk() {
		System.out.println("walk");
	}
}

class Fish extends Animal1{
	void swim() {
		System.out.println("swim");
	}
}

class Bird extends Animal1{
	void fly() {
		System.out.println("fly");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal m = new Mammal();
		m.eat();
	}

}
