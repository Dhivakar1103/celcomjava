package com.celcom.day4;


class Animal1{
	int a = 10;
	void move() {
		System.out.println("Can not define");
	}
	void eat() {
		System.out.println("Can not define");
		
	}
}
class Cat1 extends Animal1{
	
	void move() {
		System.out.println("Cat will move by walk ");
	}
	void eat() {
		System.out.println("Cat will eat Rat ");
	}
	
}




public class DMDExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 animal = new Cat1();
		animal.move();
		System.out.println(animal.a);

	}

}
