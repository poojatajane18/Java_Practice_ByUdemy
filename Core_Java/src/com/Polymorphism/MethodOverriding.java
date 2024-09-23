package com.Polymorphism;

class Animal {
	void eat() {
		System.out.println("Eat Anything");
	}
}

class Deer extends Animal{
	void eat() {
		System.out.println("Eat grass");
	}
}


public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deer deer =new Deer();
		deer.eat();
	}

}
