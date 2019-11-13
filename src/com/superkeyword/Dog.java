package com.superkeyword;

// to refer immediate parent class instance variable

class Animal{
	String color="Black";
}

class Dog extends Animal{
	String color="White";

	void printColor() {
		System.out.println("Dog color is "+ color);
		System.out.println("Animal color is "+ super.color);
		}
	
	public static void main(String[] args) {
		Dog d1=new Dog();
		
		d1.printColor();
	}
}
