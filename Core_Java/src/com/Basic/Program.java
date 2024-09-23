package com.Basic;

class InstanceCounter{
	 private static int count;
	 public InstanceCounter( ){
		 InstanceCounter.count = InstanceCounter.count + 1;
	 }
	 public static int getCount() {
		 return InstanceCounter.count;
	 }
	 }
	 class Program{
		 public static void main(String[] args) {
			 InstanceCounter c1 = new InstanceCounter();
			 InstanceCounter c2 = new InstanceCounter();
			 System.out.println("Instance Count : "+InstanceCounter.getCount());
	 }
	 }

