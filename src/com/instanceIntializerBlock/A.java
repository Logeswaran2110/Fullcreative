package com.instanceIntializerBlock;


class B {
	
	B() {
		System.out.println("constructor of B class is invoked");  // add IIB as first
	}
	
	{
    	System.out.println("instance initializer block of B class invoked");
	}
}

class A extends B {
	
	A() {
		System.out.println("constructor of A class is invoked");  // add super(); and IIB as first
	}
	
	{
    	System.out.println("instance initializer block of A class invoked");
	}
	

	public static void main(String[] args) {
		
		A obj=new A();
	}

}
