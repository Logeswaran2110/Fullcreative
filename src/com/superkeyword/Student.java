package com.superkeyword;

class Student2{
	int id;
	String name;
	
	Student2(int id, String name){
		this.id=id;
		this.name=name;
		}
}

class Student extends Student2 {
	String dept;
	
	Student(int id, String name, String dept){
		super(id,name);
		this.dept=dept;
		}
	
	void StudentData() {
		System.out.println(id+" "+name+" "+dept);
	}
	
	public static void main(String[] args) {
		Student s1=new Student(100,"Logesh","E&I");
		s1.StudentData();
	}
}
