package com.celcom.day4;
final class Animal12{
	String msg = setMessage();
	final String setMessage() {
		return "A";
	}
	
}
//class DOg extends Animal12{
//	
//}
//can not create sub class
public class FinalKeyWordExample {

	public static void main(String[] args) {
		Animal12 animal = new Animal12();
		animal.setMessage();

	}

}
