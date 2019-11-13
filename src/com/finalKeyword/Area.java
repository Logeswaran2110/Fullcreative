package com.finalKeyword;

// final variable

class Area {
	
	final double pi=3.14;  // Can't change the final variable. It is constant 
	
	Area(int r){
		double a1;
		a1=pi*r*r;
		System.out.println(a1);
	}

	public static void main(String[] args) {
		Area obj=new Area(100);
	}

}
