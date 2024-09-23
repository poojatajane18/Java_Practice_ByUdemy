package com.Basic;

class Pen{
	String color;
	int tip;
	
	void setColor(String newColor) {
		color = newColor;
	}
	void setTip(int newTip) {
		tip=newTip;
	}
}

public class ClassObject {
	public static void main(String args[]) {
		Pen pen = new Pen();
		pen.setColor("Blue");
		System.out.println(pen.color);
		pen.setTip(5);
		System.out.println(pen.tip);
	}

}
