package com.celcom.day3;

public class JavaBeanExample {

		private int eid;
		private String name;
		private int salary;	
		public JavaBeanExample() {
		}


	public JavaBeanExample(int eid, String name, int salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public static void main(String[] args) {
		System.out.println("101");
		System.out.println("dhivakar");
		System.out.println("100000");

	}

}
