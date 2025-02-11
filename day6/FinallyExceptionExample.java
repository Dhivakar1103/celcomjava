package com.celcom.day6;

public class FinallyExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Exceptions");
		try {
			int arr[] = { 1,2,3};
			System.out.println(arr[3]);
			System.out.println("hi");
			
		}
		catch(ArithmeticException e){
			System.out.println(e);
			
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		catch (NegativeArraySizeException e) {
			
			System.out.println(" negative ");
		}
		finally {
			System.out.println();
		}
		System.out.println("After exceptions");

	}

}
