package com.polymorphism;

// Method overloading

class Addition{
	static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	static void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	static void add(int a, float b) {
		System.out.println(a+b);
	}
	
	static void add(float a, int b) {
		System.out.println(a+b);
	}
}

class MethodOverloading {

	public static void main(String[] args) {
		Addition.add(10,20);
		Addition.add(10,20,30);     // by changing the no. of parameter
		Addition.add(10,20.5f);     // by changing the data type
		Addition.add(12.5f,20);     // by changing the sequence of data types
	}

}
