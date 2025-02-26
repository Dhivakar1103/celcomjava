package com.celcom.day11;

import java.util.Scanner;

class Micro {
	public static void calculateHeatingTime(int items, double timePerItem, String foodType, String powerLevel) {
		double time = 0;
//		if(items>3||items<0) {
//			System.exit(1);
//		}
		if (items >= 1 && items <= 3) {
			switch (items) {

			case 1:
				time = timePerItem;
				break;
			case 2:
				time = timePerItem + (timePerItem * (0.5));

				break;
			case 3:
				time = timePerItem * 2;
				break;
			default:

				System.exit(1);

			}
			if (foodType.equalsIgnoreCase("Pasta")) {
				time += (time * (0.1));

			} else if (foodType.equalsIgnoreCase("Frozen meal")) {
				time += (time * (0.2));

			} else if (foodType.equalsIgnoreCase("Vegetables")) {
				time = time * 1;
			} else {
				System.err.println("Enter a valid Food Type");
				System.exit(0);
			}
			if (powerLevel.equalsIgnoreCase("High")) {
				time *= 1;

			} else if (powerLevel.equalsIgnoreCase("Medium")) {
				time -= (time * (0.1));

			} else if (powerLevel.equalsIgnoreCase("Low")) {
				time += (time * (0.15));

			} else {
				System.err.println("Enter a valid Power Level");
				System.exit(0);

			}
		} else {
			System.err.println("Entered a invalid items");
			return;
		}

		System.out.println(time);

	}
}

public class Assignment2Self {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of items : ");
		int items = sc.nextInt();
		System.out.println("Enter the heating time for one item (in seconds)");
		int timePerItem = sc.nextInt();
		System.out.println("Enter the type of food (e.g., pasta, frozen meal, vegetables): ");
		String foodType = sc.next();
		System.out.println("Enter the microwave model (high, medium, low):");
		String powerLevel = sc.next();
		Micro.calculateHeatingTime(items, timePerItem, foodType, powerLevel);

	}

}
