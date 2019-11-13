package com.inheritance;

// Aggregation

class Address{
	String city, state;
	
	Address(String city, String state){
		this.city=city;
		this.state=state;
	}
}

class Emp {
	
	int id;
	String name;
	Address address;
	
	Emp(int id, String name, Address address){  // used for initialization
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	void employeeData() {
		System.out.println("Name is "+ name);
		System.out.println("Employee ID is "+ id);
		System.out.println("Address - "+ address.city+" , "+address.state);
	}

	public static void main(String[] args) {
		Address address1=new Address("chennai", "Tamil nadu");
		Address address2=new Address("Hyderabad", "AP");
		
		Emp e1=new Emp(100,"Logesh",address1);
		Emp e2=new Emp(101,"surya",address2);
		
		e1.employeeData();
		e2.employeeData();
	}

}
