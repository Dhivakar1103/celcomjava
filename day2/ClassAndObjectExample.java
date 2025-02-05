package com.celcom.day2;

class Employee{
	//variable declaration
	int id;
	String name;
	double salary;
	//
	
	Employee(int eid, String ename, double esalary ){
		id =eid;
		name =ename;
		salary = esalary;
	}
	
	
	//method
	void display() {
		System.out.println("Employee id : " + id );
		System.out.println("Employee name : " + name );
		System.out.println("Employee salary : " + salary );
	}
}

public class ClassAndObjectExample {
	public static void main(String args[]) {
		Employee dhiva = new Employee(101 , "dhiva", 200000.0);
		dhiva.display();
		Employee maddy = new Employee(102 , "maddy", 300000.0);
		maddy.display();
		
		
	}

}
