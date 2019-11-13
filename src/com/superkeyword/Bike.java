package com.superkeyword;

// to invoke immediate parent class method

class Vehicle{
	void run() {
		System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle{
	void run() {
		System.out.println("Bike is running safeky");
	}
	
	void work() {
		run();
		super.run();
	}
	
	public static void main(String[] args) {
		Bike obj=new Bike();
		obj.work();
	}
}
