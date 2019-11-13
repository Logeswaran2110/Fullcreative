package com.classconcept;

class Students {
	String name;
	int id;
	String college;
	String dept;
	String gender;

	void studentId(int id1)
	{
		id=id1;
	}
	
	void studentName(String name1)
	{
		name=name1;
	}

	void studentCollege(String college1)
	{
		college=college1;
	}

	void studentDept(String dept1)
	{
		dept=dept1;
	}
	
	
	void studentData()
	{
		System.out.println("Name is "+ name);
		System.out.println("ID no is "+ id);
		System.out.println("college is "+ college);
		System.out.println("dept is "+ dept);
		System.out.println("gender is "+ gender);
		
	}

	public static void main(String[] args) {
		Students s1=new Students();
		s1.studentId(100);
		s1.studentName("Logesh");
		s1.studentCollege("MIT");
		s1.studentDept("E&I");
		s1.gender="male";
		
		Students s2=new Students();
		s2.studentId(101);
		s2.studentName("Surya");
		s2.studentCollege("MIT");
		s2.studentDept("EEE");
		s2.gender="male";
		
		
		s1.studentData();
		s2.studentData();
		
	}

}
