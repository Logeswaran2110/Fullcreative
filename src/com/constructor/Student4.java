package com.constructor;

// Copy values from one object to another using constructor

class Student4 {

	int id;
	String name;
	String dept;
	
	Student4(int id1,String name1){
		id=id1;
		name=name1;
		}
	
	Student4(Student4 s){
		id=s.id;
		name=s.name;
		}
	
	public static void main(String[] args) {
		
		Student4 s1=new Student4(100,"Logesh");
		Student4 s2=new Student4(s1);
		
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
		
	}

}
