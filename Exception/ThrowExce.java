package com.Exception;

class YoungerAge extends RuntimeException{

    YoungerAge(String message) {
	super(message);
}
     
}


public class ThrowExce {

public static void main(String[] args) {
	int age =32;
	if(age<18) {
		throw new YoungerAge(" vikash you are not eligible  for marriage");
	}
	else {
		System.out.println(" vikash you are eligible for marriage ");
	}

}

}
