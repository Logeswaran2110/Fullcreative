package com.thiskeyword;

// to refer current class instance variable 

class Student {
	
	int id;
	String name;
	static String college="MIT";
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
		}
	
	void studentData(){
		System.out.println(id+" "+name+" "+college);
	}
	
	public static void main(String[] args) {
		Student s1=new Student(100,"Logesh");
		Student s2=new Student(101,"Surya");
		
		s1.studentData();
		s2.studentData();
	}

}
