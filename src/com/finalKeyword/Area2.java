package com.finalKeyword;

// static blank final variable 

class Area2 {
	final static double pi; 
	
	static {          // static final variable is initialized only in static block
		pi=3.14;
	}
	
	Area2(int r){
		double a1;
		
		a1=pi*r*r;
		System.out.println(a1);
	}

	public static void main(String[] args) {
		Area2 obj=new Area2(100);
	}

}
