package com.constructor;

// Parameterized constructor

class Student2 {
	
	int id;
	String name;
	
	Student2(int id1,String name1){
		id=id1;
		name=name1;
	}

	public static void main(String[] args) {
		
		Student2 s1=new Student2(100,"Logesh");
		
		System.out.println(s1.id+" "+s1.name);
	}

}
