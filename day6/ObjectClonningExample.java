package com.celcom.day6;

public class ObjectClonningExample implements Cloneable{

	public static void main(String[] args )throws CloneNotSupportedException {
		ObjectClonningExample obj = new ObjectClonningExample();
		
		System.out.println(obj.hashCode());
		ObjectClonningExample obj2 =(ObjectClonningExample) obj.clone();
		System.out.println(obj2.hashCode());

	}

}
