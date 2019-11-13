package com.variables;

class Variables {
	
	static int a=10;
	int b;
	
	public static void main(String[] args) {
		int c=30;
		System.out.println(a +" " + c);
	//	System.out.println(b); can't use non static member directly
		
		Variables obj=new Variables();
		Variables ob1=new Variables();
		
		obj.b=21;
		ob1.b=22;
		System.out.println(obj.b+ " "+ ob1.b);
	}

}
