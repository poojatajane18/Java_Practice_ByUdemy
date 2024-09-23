package com.Example;

public abstract class Person {
	private String name;
	public Person(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
