package com.celcom.day2;
class Fruits{
	int size;
	String color;
	int price;

	Fruits(int size,String color , int price){
		this.size = size;
		this.color = color;
		this.price = price;
		
	}
	void display() {
		System.out.println("Fruit size : " + size);
		System.out.println("Fruit color : " + color);
		System.out.println("Fruit price : " + price);
		
	}
	void setPrice(int price) {
		this.price = price;
	}
}

public class ClassAndObjectExample2 {

	public static void main(String[] args) {
		Fruits apple = new Fruits(10,"Red",300);
		apple.display();
		apple.setPrice(200);
		apple.display();
	}

}
