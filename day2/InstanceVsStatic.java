package com.celcom.day2;

public class InstanceVsStatic {
	int a = 10;
	static int b = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Instance");
		InstanceVsStatic obj1 = new InstanceVsStatic();
		InstanceVsStatic obj2 = new InstanceVsStatic();
		System.out.println(obj1.a);//10
		System.out.println(obj2.a);//10
		obj1.a = 20;
		System.out.println(obj1.a);//20
		System.out.println(obj2.a);//10
		System.out.println("Static");
		
		System.out.println(InstanceVsStatic.b);//10
		System.out.println(InstanceVsStatic.b);//10
		InstanceVsStatic.b = 20;
		System.out.println(InstanceVsStatic.b);//20
		System.out.println(InstanceVsStatic.b);//20

	}

}
