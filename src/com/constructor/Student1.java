package com.constructor;

// No args constructor

class Student1 {
	
	String college;
	
	Student1(){
		college = "MIT";
	}
	
	public static void main(String[] args) {
		
		Student1 s1=new Student1();
		Student1 s2=new Student1();
		
		System.out.println(s1.college+ " "+ s2.college);
	}

}
