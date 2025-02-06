package com.celcom.day3;
class Vehicle11{
	void NoOfEngine() {
		System.out.println("I have one Engine");
	}
}
class Car11 extends Vehicle11{
	void NoOfTyres(){
		System.out.println("I have four Tyres");

	}
}
class Scooty1 extends Car11{
	void brandName() {
		System.out.println("Activa");

		
	}
}
class Bike1 extends Car11{
	void brandName() {
		System.out.println("Honda");

		
	}
}

public class InheritanceExample3{

	public static void main(String[] args) {
		Scooty Activa = new Scooty();
		Activa.NoOfEngine();
		Activa.NoOfTyres();
		Activa.brandName();
		Bike1 Honda = new Bike1();
		Honda.NoOfEngine();
		Honda.NoOfTyres();
		Honda.brandName();
		

	}

}
