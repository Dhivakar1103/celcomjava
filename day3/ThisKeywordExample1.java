package com.celcom.day3;

public class ThisKeywordExample1 {
	ThisKeywordExample1(){
		this("Dhiva");
		System.out.println("A");
			}
	ThisKeywordExample1(String name){
		this(10);
		System.out.println("B");
			}
	ThisKeywordExample1(int a ){
		System.out.println("C");
		
			}
	
	public static void main(String[] args) {
		new ThisKeywordExample1();

	}

}
