package com.celcom.day4;
class vehicle{
	void engine() {
		System.out.println("All the vehicle has One Engine ");
	}
	void wheels(){
		System.out.println("All the vehicle has a Wheels ");
		
	}
}
class Wheels{
	void wheelModel() {
		System.out.println("Wheel model is MRF ");
	}
	void noOfWheels(String vehicleType) {
		if (vehicleType.equals("Two Wheeler")) {
			System.out.println("I have two Wheels ");
		}
		else if (vehicleType.equals("Four Wheeler")) {
			System.out.println("I have four Wheels ");
		}
		else {
			System.out.println("I have six Wheels ");

		}
		
	}
}
class Engine{
	void engineModel() {
		System.out.println("Engine model is XYZ ");
	}
	
}
class Car extends vehicle{ //IS-A
	Wheels wheel = new Wheels();//HAS-A
	Engine engine = new Engine();//HAS-A
	
	void engineModel() {
		engine.engineModel();
	}
	void wheelModel() {
		wheel.wheelModel();
	}
	void noOfWheels() {
		wheel.noOfWheels("Four Wheeler");
	}
}


public class IsAandHasAExample1 {

	public static void main(String[] args) {
		Car car = new Car();
		car.engine();
		car.engineModel();
		
		car.wheels();
		car.wheelModel();
		car.noOfWheels();
	}

}
