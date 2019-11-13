package com.finalKeyword;

// you cann't override the final method

class Bike {
	final void run() {
		System.out.println("Bike is running");
	}
}

class Hondo extends Bike{

/*	void run() {
		System.out.println("Hondo is running");
	}
*/	
	public static void main(String[] args) {
		Hondo obj=new Hondo();
		
		obj.run();
	}

}
