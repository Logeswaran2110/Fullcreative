package com.thiskeyword;

class ThisMethod {
	
	void method2() {
		System.out.println("method2 is invoked");
	}
	
	void method1() {
		System.out.println("method1 is invoked");
		this.method2(); // same as method2();
	}

	public static void main(String[] args) {
		ThisMethod obj=new ThisMethod();
		
		obj.method1();
	}

}
