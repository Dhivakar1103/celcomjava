package com.celcom.day7;

class TwoTable extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * 2 = " + (i * 2));

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}
class FiveTable extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.err.println(i + " * 5 = " + (i * 5));

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}

public class MultiThreadingExample5 {

	public static void main(String[] args) throws InterruptedException {
		TwoTable t1 = new TwoTable();
		Thread t2 = new Thread(new FiveTable());//implementing runnable
		t1.start();
		t1.join();
		System.out.println("Main");
		t2.start();

		
	}
}
