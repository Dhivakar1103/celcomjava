package com.celcom.day12;

//class Box<T> {
//	private T value;
//
//	private void set(T value) {
//		this.value = value;
//	}
//	public T  get() {
//		// TODO Auto-generated method stub
//		return value;
//	}
//
//	public class GenericsEx {
//		public static void main(String[] args) {
//			Box<Integer> intBox = new Box<>();
//			intBox.set(10);
//			System.out.println(intBox.get()); // Output: 10
//			Box<String> StringBox = new Box<>();
//
//			StringBox.set("Hello");
//			System.out.println(StringBox.get()); // Output: Hello
//
//			
//		}
//	}
class Calculator<T extends Comparable<T>> {
	private T num1, num2;

	public Calculator(T num1, T num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public T getMax() {
		return (num1.compareTo(num2) > 0) ? num1 : num2;
	}

	public T getMin() {
		return (num1.compareTo(num2) < 0) ? num1 : num2;
	}
}

public class GenericsEx {
	public static void main(String[] args) {
		Calculator<Integer> intCalc = new Calculator<>(10, 20);
		System.out.println("Max: " + intCalc.getMax()); 
		System.out.println("Min: " + intCalc.getMin()); 

		Calculator<String> strCalc = new Calculator<>("Apple", "Banana");
		System.out.println("Max: " + strCalc.getMax()); // Output: Banana
		System.out.println("Min: " + strCalc.getMin()); // Output: Apple
	}
}
