package com.instanceIntializerBlock;

// When IIB is invoked

class Bike {
	
	Bike(){                                              // copies the IIB in the constructor                   
		System.out.println("constructor is invoked");  
	}

    {
    	System.out.println("instance initializer block invoked");
    	} 
    
    
	public static void main(String[] args) {
		
		Bike obj=new Bike();
		
	}

}
