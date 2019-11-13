package com.statickeyword;

class Student {

	int id;
	String name;
	static String college="MIT";
	
	Student(int id1,String name1){
		id=id1;
		name=name1;
		}
	
	void studentData(){
		System.out.println(id+" "+name+" "+Student.college);
	}
	
	public static void main(String[] args) {
		Student s1=new Student(100,"Logesh");
		Student s2=new Student(101,"Surya");
		
		s1.studentData();
		s2.studentData();
		
	}

}
