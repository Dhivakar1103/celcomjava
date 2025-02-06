package com.celcom.day3;
class Bike {
	String model;
	int price;
	int speed;
	

	Bike (String model,	int price,int speed){
		this.model =model;
		this.price = price;
		this.speed = speed;
	}
void display(){
	System.out.println("Bike model : " + model );
	System.out.println("Bike price : " + price );
	System.out.println("Bike speed : " + speed);
	
	
}
void setPrice(int price) {
	this.price = price;
}
}
public class ClassAndObjectForBike {
	

	public static void main(String[] args) {
		Bike R15 = new Bike("R15",150000, 120);
		R15.display();
		R15.setPrice(140000);
		R15.display();

	}

}
