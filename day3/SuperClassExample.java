package com.celcom.day3;
class Vehicles{
	String a = "I am a super class variable";
	Vehicles(){
		System.out.println("I am a class constructor");
		
	}
	void NoOfEngine() {
		System.out.println("I have one Engine");
	}
}
class Cars extends Vehicles{
	Cars(){
		super();
	}
	void NoOfTyres(){
		System.out.println("I have four Tyres");
		System.out.println(super.a);
		

	}
}

public class SuperClassExample {
	

	public static void main(String[] args) {
		Cars four = new Cars();
		four.NoOfEngine();
		four.NoOfTyres();
		
	}

}
