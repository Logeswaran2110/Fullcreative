package com.runtimePolymorohism;

// runtime polymorphism can't be achieved by data member

class Bike1 {
	int speedLimit=50;
}

class Hero1 extends Bike1 {
	int speedLimit=50;
}

class Splendor1 extends Bike1 {
	int speedLimit=50;
}

class Yamaha1 extends Bike1 {
	int speedLimit=50;
}


class Polymorphism1 {

	public static void main(String[] args) {
	Bike1 b;
		
		b=new Hero1();
		System.out.println(b.speedLimit);
		
		b=new Splendor1();
		System.out.println(b.speedLimit);
		
		b=new Yamaha1();
		System.out.println(b.speedLimit);
	}

}
