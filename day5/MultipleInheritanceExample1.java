package com.celcom.day5;
interface One{
	int a = 10;//by default interface variable are public static final
	
}
interface Two{
	//by default interface variable are public static final
	int b = 20;
}
interface Three extends One , Two{
	void addition();
}
class Addition implements Three{
	public void addition() {
		System.out.println("Addition of "+10+ " and "+ 20 + " : " + (a+b));
	}
	
}
public class MultipleInheritanceExample1 {

	public static void main(String[] args) {
		Addition add = new Addition();
		add.addition();

	}

}
