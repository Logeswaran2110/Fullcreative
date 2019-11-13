package com.thiskeyword;

// to invoke current class constructor & used for constructor chaining 

class Student1 {
	int id;
	String name;
	String dept;
	
	Student1(int id, String name){
		this.id=id;
		this.name=name;
		}
	
	Student1(int id, String name, String dept){
		this(id,name);
		this.dept=dept;
		}
	
	void studentData(){
		System.out.println(id+" "+name+" "+dept);
	}
	
	public static void main(String[] args) {
		Student1 s1=new Student1(100,"Logesh");
		Student1 s2=new Student1(101,"Surya", "E&I");
		
		s1.studentData();
		s2.studentData();
	}

}
