package com.instanceIntializerBlock;

// assigning the instance data member value through IIB

class Student {
		int id;
		String name;
		{
			id=100;
			name="Logesh";
			}
		
		void StudentData() {
			System.out.println(id+" "+name);
		}
		

	public static void main(String[] args) {
		
		Student s1=new Student();
		
		s1.StudentData();
		
	}

}
