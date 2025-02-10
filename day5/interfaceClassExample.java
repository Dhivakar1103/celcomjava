package com.celcom.day5;

interface VehiclePlan{
	void noEngine();
	void noOfWheels();
	void brandName();
}
interface VehiclePlan2{
	void noOfWheels();
	void brandName();
}
abstract class vehicle1 implements  VehiclePlan,VehiclePlan2{
	public void noEngine() {
		System.out.println("I have one engine");
	}
	
}
class carr extends vehicle1{
	public void noOfWheels() {
		System.out.println("I have four wheels");
	}
	public void brandName() {
		System.out.println("I am BMW");
	}
	
}

public class interfaceClassExample {

	public static void main(String[] args) {
		VehiclePlan vec = new carr();
		vec.noEngine();
		vec.noOfWheels();
		vec.brandName();
	}

}
