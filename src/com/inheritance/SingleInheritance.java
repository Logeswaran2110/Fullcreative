package com.inheritance;

// single inheritance

class Employee{
	int salary;
	int basic_pay=10000;
}

class HR extends Employee{
	int hr=5000;
}

class SingleInheritance {

	public static void main(String[] args) {
		HR emp1=new HR();
	
		emp1.salary= emp1.basic_pay+ emp1.hr;
		System.out.println(emp1.salary);
	}

}
