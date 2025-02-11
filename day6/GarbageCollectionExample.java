package com.celcom.day6;

public class GarbageCollectionExample {
	static int count;
	GarbageCollectionExample(){
		count++;
		System.out.println(count);
	}
	protected void finalize() {
		count-- ; 
		System.out.println(count);

	}
	public static void main(String[] args) {
		GarbageCollectionExample obj1 = new GarbageCollectionExample();
		GarbageCollectionExample obj2 = new GarbageCollectionExample();
		
		obj1 = null;
		System.gc();
		
		obj2 = null;
		Runtime.getRuntime().gc();
	}

}
