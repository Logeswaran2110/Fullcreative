package com.finalKeyword;

// non static final blank variable

class Area1 {
	final double pi; 
	
	Area1(int r){
		double a1;
		pi=3.14;       // instance variable is initialized in the constructor only
		
		a1=pi*r*r;
		System.out.println(a1);
	}

	public static void main(String[] args) {
		Area1 obj=new Area1(100);
		
	}

}
