package com.inheritance;

// Multilevel inheritance

class Employee1{
	int salary;
	int basic_pay=10000;
}

class HR1 extends Employee1{
	int hr=5000;
}

class WA1 extends HR1{
	int wa=1000;
}

class Multilevel_Inheritance {

	public static void main(String[] args) {
		WA1 emp1=new WA1();
		
		emp1.salary= emp1.basic_pay+ emp1.hr+emp1.wa;
		System.out.println(emp1.salary);
		
	}

}
