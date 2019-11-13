package com.statickeyword;

// static method

class Student1 {

	int id;
	String name;
	static String college="MIT";
	
	Student1(int id1,String name1){
		id=id1;
		name=name1;
		}
	
	static void changeCollegeFormat() {
		college="Madras Institute of Technology";
	}
	
	void studentData(){
		System.out.println(id+" "+name+" "+college);
	}
	
	public static void main(String[] args) {
		
		Student1 s1=new Student1(100,"Logesh");
		Student1 s2=new Student1(101,"Surya");
		
		s1.studentData();
		s2.studentData();
		
		Student1.changeCollegeFormat();
		
		s1.studentData();
		s2.studentData();
	}

}
