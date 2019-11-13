package com.statickeyword;

// static property shared to all object & get memory only once 

class Counter {
	
	int count;
	static int count2;
	
	Counter(){
		count++;
		count2++;
		System.out.println(count + " "+ count2);
	}

	public static void main(String[] args) {
		
		Counter ob1= new Counter();
		Counter ob2= new Counter();
		Counter ob3= new Counter();
		
	}

}
