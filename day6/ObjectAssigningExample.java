package com.celcom.day6;

public class ObjectAssigningExample {

	public static void main(String[] args) {
		ObjectAssigningExample obj = new ObjectAssigningExample();
		System.out.println(obj.hashCode());
		ObjectAssigningExample obj2 = obj;
		System.out.println(obj2.hashCode());

	}

}
