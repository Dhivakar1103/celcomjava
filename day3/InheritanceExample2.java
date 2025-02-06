package com.celcom.day3;
class Vehicle1{
	void NoOfEngine() {
		System.out.println("I have one Engine");
	}
}
class Car1 extends Vehicle1{
	void NoOfTyres(){
		System.out.println("I have four Tyres");

	}
}
class Scooty extends Car1{
	void brandName() {
		System.out.println("Activa");

		
	}
}


public class InheritanceExample2 {

	public static void main(String[] args) {
		Scooty Activa = new Scooty();
		Activa.NoOfEngine();
		Activa.NoOfTyres();
		Activa.brandName();
		

	}

}
