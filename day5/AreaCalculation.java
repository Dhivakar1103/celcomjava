package com.celcom.day5;

import java.util.Scanner;

interface area {
	void calculate();
}

interface perimeter {
	void calculatePerimeter();
}

abstract class shape implements area {
	double radius;
	int length;
	int breadth;
	int height;

	shape(double radius) {
		this.radius = radius;
	}

	shape(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	void caluclate() {

	}

}

class circle extends shape {

	circle(double radius) {
		super(radius);
		this.calculate();
		this.calculatePerimeter();

	}

	public void calculate() {

		double x = Math.PI * radius * radius;
		System.out.println("Area of the circle is " + x);

	}

	public void calculatePerimeter() {

		double x = 2 * Math.PI * radius;
		System.out.println("Perimeter of the circle is " + x);

	}

}

class rectangle extends shape {
	rectangle(int length, int breadth) {
		super(length, breadth);
		this.calculate();
		this.calculatePerimeter();
	}

	public void calculate() {

		double y = length * breadth;
		System.out.println("Area of the rectangle is " + y);

	}

	public void calculatePerimeter() {

		double y = (length + breadth);
		System.out.println("Perimeter of the rectangle is " + y);

	}

}

class triangle extends shape {
	triangle(int length, int height) {

		super(length, height);
		this.calculate();
		this.calculatePerimeter();

	}

	public void calculate() {

		double z = 0.5 * length * breadth;
		System.out.println("Area of the triangle is " + z);

	}

	public void calculatePerimeter() {

		double z = length + length + breadth;
		System.out.println("Area of the triangle is " + z);

	}

}

public class AreaCalculation {

	public static void main(String[] args) {

		System.out.println("Enter a choice ");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			new circle(5);
			break;
		case 2:
			new rectangle(5, 6);
			break;
		case 3:
			new triangle(8, 6);
			break;

		}

		sc.close();
	}

}
