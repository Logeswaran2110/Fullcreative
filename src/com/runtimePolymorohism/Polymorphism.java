package com.runtimePolymorohism;

// Up casting & method overridden

class Bike {
	void run() {
		System.out.println("Running");
	}
}

class Hero extends Bike {
	void run() {
		System.out.println("Running with 50 kmph");
	}
}

class Splendor extends Bike {
	void run() {
		System.out.println("Running with 100 kmph");
	}
}

class Yamaha extends Hero {
	void run() {
		System.out.println("Running with 150 kmph");
	}
}

class Polymorphism {

	public static void main(String[] args) {
		Bike b;
		
		b=new Hero();
		b.run();
		
		b=new Splendor();
		b.run();
		
		b=new Yamaha();
		b.run();
	}

}
