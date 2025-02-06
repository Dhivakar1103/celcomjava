package com.celcom.day3;


	class Vehicle{
		void NoOfEngine() {
			System.out.println("I have one Engine");
		}
	}
	class Car extends Vehicle{
		void NoOfTyres(){
			System.out.println("I have four Tyres");

		}
	}
public class InheritanceExample {
	public static void main(String[] args) {
		 Car four = new  Car();
		 four.NoOfEngine();
		 four.NoOfTyres();
		 
		 
		

	}

}
