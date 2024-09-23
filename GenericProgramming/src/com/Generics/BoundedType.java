package com.Generics;
import java.util.Date;
import java.util.ArrayList;

class Box1<T extends Number>{
	private T reference;
	
	public T getReference() {
		return reference;
	}
	
	public void setReference(T reference) {
		this.reference = reference;
	}
}

public class BoundedType {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10); //list.add(Integer.valueOf(10));
		list.add(20); //list.add(Integer.valueOf(20));
		list.add(30); //list.add(Integer.valueOf(30));
		for( Integer element : list )
		System.out.println(element);
	}

	public static void main1(String[] args) {
		//Box1<Boolean> b1 = new Box1<>();    //NOT OK
		//Box1<Character> b2 = new Box1<>();	//NOT OK
		Box1<Integer> b = new Box1<>();		//OK
		Box1<Number> b3 = new Box1<>();		//OK
		Box1<Double> b4 = new Box1<>();		//OK
		//Box1<String> b5 = new Box1<>();		//NOT OK
		//Box1<Date> b6 = new Box1<>();		//NOT OK

	}

}
