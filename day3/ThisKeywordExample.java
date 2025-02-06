package com.celcom.day3;

public class ThisKeywordExample {
	String name ;
	int Age;
	
	ThisKeywordExample(String name,int Ages){
		this.name = name;
		Age =Ages;
		
		this.greetings();
		 
		
	}
	void  greetings() {
		System.out.println("Welcome " + name +" " + Age);
	}

	public static void main(String[] args) {
		
		new ThisKeywordExample("dhivakar" , 21);
	}

}
