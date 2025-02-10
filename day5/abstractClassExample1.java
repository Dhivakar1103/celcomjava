package com.celcom.day5;

abstract class vehicle {
	abstract void noOfWheels();

	void noOfEngine() {
		System.out.println("I have one engine");
	}
	abstract void brandName();
}
class car extends vehicle{
	void noOfWheels() {
		System.out.println("I have four wheels");

		
	}
	void brandName() {
		System.out.println("My brand name is AUDI");
	}
	
}
abstract public class abstractClassExample1 {

	public static void main(String[] args) {
		vehicle vec = new car();
		vec.brandName();
		vec.noOfEngine();
		vec.noOfWheels();
		
		

	}

}
