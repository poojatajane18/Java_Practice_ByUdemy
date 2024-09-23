package com.GenericMethod;

class Box<T>{
	private T data;
	
	public Box() {
		
	}
	public Box(T data) {
		this.data = data;
	}
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return this.data.toString();
	}
}

class Sample extends Box<Integer>{
	public Sample() {
		super();
	}
	public Sample(Integer data) {
		super(data);
	}
	/*
	 //Method added by compiler to achive dynamic method dispatch
	 public void setData(Object data) { //Bridge method
	 super.setData((Integer)data);
	 } */
	
	@Override
	public void setData(Integer data) {
		super.setData(data);
	}
}

public class BridgeMethod {
	public static void main(String[] args) {
		Box<Integer> box = new Box<>(123);
		System.out.println(box.toString());
	}
	
	public static void main4(String[] args) {
		Box box = new Box();  //Box is raw type
		box.setData(123);
		//String str = (String) box.getData(); //ClassCastException
		//System.out.println(str);
	}
	
	public static void main3(String[] args) {
		Sample s = new Sample();
		Box<Integer> b = s; //Upcasting
		b.setData(134);
		System.out.println(b.toString());
	}
	
	public static void main2(String[] args) {
		Sample s = new Sample();
		Box b = s;   //Upcasting
		b.setData(123);   
		System.out.println(b.toString());
	}

	public static void main1(String[] args) {
		Sample s = new Sample();
		Box b = s;   //Upcasting
		b.setData("Hello");   //ClassCastException
		System.out.println(b.toString());

	}

}
