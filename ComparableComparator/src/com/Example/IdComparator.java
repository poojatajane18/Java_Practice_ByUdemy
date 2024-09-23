package com.Example;

import java.util.Comparator;

public class IdComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		if(p1 instanceof Student && p2 instanceof Student) {
			Student s1 = (Student) p1;
			Student s2 = (Student) p2;
			return s1.getRollNumber() - s2.getRollNumber();
		}
		else if(p1 instanceof Employee && p2 instanceof Employee) {
			Employee e1 = (Employee) p1;
			Employee e2 = (Employee) p2;
			return e1.getEmpid() - e2.getEmpid();
		}
		else if( p1 instanceof Student && p2 instanceof Employee ) {
			 Student s3 = (Student) p1;
			 Employee e3 = (Employee) p2;
			 return s3.getRollNumber() - e3.getEmpid();
		}
		else {
			 Employee e1 = (Employee) p1;
			 Student s2 = (Student) p2;
			 return e1.getEmpid() - s2.getRollNumber();
		}
	}
}
