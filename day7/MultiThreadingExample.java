package com.celcom.day7;

public class MultiThreadingExample {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
				System.out.println(t);
				System.out.println("Current Thread name :" + t.getName());
				System.out.println("Current Thread Priority : " + t.getPriority());

	}

}
