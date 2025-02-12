package com.celcom.day7;

//Inter-Thread Communication
class Resource {
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}

class Reader extends Thread {
	Resource resource;

	Reader(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		synchronized (resource) {
			System.out.println("Reader is Waiting for Writer to write the Data");
			try {
				resource.wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println("Data From Reader : " + resource.getData());
		}
	}

}

class Writer extends Thread {
	Resource resource;

	Writer(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		synchronized (resource) {
			System.out.println("Writer is Writing the Data...");
			resource.setData("Hello");
			resource.notify();

		}
	}

}

public class SynchronizationExample {

	public static void main(String[] args) throws InterruptedException {
		Resource obj = new Resource();
		Reader obj1 = new Reader(obj);
		Writer obj2 = new Writer(obj);
		obj1.start();

		Thread.sleep(2000);
		obj2.start();
	}

}