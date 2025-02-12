package com.celcom.day7;

public class InnerClassExample {
	// Non - Static Inner Class
	class InnerClass1 {
		void MyMethod1() {
			System.out.println("Non Static Inner Class");
		}
	}

	// Static Inner Class
	static class InnerClass2 {
		void MyMethod2() {
			System.out.println(" Static Inner Class");
		}
	}

	void MyMethod() {
		class InnerClass3 {
			void MyMethod3() {
				System.out.println("Local Inner Class");
			}
		}
		InnerClass3 inner3 = new InnerClass3();
		inner3.MyMethod3();
	}

	public static void main(String[] args) {
		InnerClassExample obj = new InnerClassExample();
		InnerClass1 inner = obj.new InnerClass1();
		inner.MyMethod1();

		InnerClassExample.InnerClass2 inner2 = new InnerClassExample.InnerClass2();
		inner2.MyMethod2();
	}

}
