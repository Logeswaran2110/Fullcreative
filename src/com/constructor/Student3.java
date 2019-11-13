package com.constructor;

// Constructor overloading 

class Student3 {
	int id;
	String name;
	String dept;
	
	Student3(int id1,String name1){
		id=id1;
		name=name1;
		}
	Student3(int id1,String name1, String dept1){
		id=id1;
		name=name1;
		dept=dept1;
		}
	
	public static void main(String[] args) {
		Student3 s1=new Student3(100,"Logesh");
		Student3 s2=new Student3(101,"Surya","E&I");
		
		System.out.println(s1.id+" "+s1.name+" "+s1.dept);
		System.out.println(s2.id+" "+s2.name+" "+s2.dept);
	}

}
