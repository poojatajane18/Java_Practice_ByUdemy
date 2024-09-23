package com.Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Syntax {

	public static void main(String[] args) {
		
		Box<Date> b1 = new Box<Date>();      //OK
		
		Box<Date> b2 = new Box<>();          //Ok
		
		//Box<> b3 = new Box<Date>();          //NOT OK
		
		/**** We can not use inheritance for type argument ****/
		//Box<Object> b4 = new Box<Date>();    //Not OK
		List<Date> list = new ArrayList<Date>();   //OK
		//Box<Date> b1 = new Box< Object>( ); //Not OK
		
		Box b = new Box();  //OK : Here Box is called as raw type
		//Box<Object> b1 = new Box< Object>( );

		/*** During instantiation of parameterized type, type argument must be non primitive type***/
		//Box<int> b5 = new Box<>();  ////Not OK: type argument int is notallowed
		 Box<Integer> b6 = new Box<>( ); //OK
		
		
		
		

	}

}
