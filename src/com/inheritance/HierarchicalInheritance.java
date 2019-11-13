package com.inheritance;


class Employee2{
	int salary;
	int basic_pay=10000;
}

class HR2 extends Employee2{
	int hr=5000;
	void salaryCalculation() {
		salary= basic_pay+hr;
		System.out.println(salary);
	}
}

class HR2_WA2 extends Employee2{
	int hr=5000;
	int wa=1000;
	void salaryCalculation() {
		salary= basic_pay+hr+wa;
		System.out.println(salary);
	}
}

class HierarchicalInheritance {
	
	public static void main(String[] args) {
		HR2 emp1=new HR2();
		HR2_WA2 emp2=new HR2_WA2();
		
		emp1.salaryCalculation();
		emp2.salaryCalculation();	
	}

}
