package com.statickeyword;

// static block

class Student2 {

	int id;
	String name;
	static String college;
	
	static {
		 college="MIT";
		}
	
	Student2(int id1,String name1){
		id=id1;
		name=name1;
		}
	
	void studentData(){
		System.out.println(id+" "+name+" "+college);
	}
	
	public static void main(String[] args) {
		
		Student2 s1=new Student2(100,"Logesh");
		
		s1.studentData();
		
	}

}
