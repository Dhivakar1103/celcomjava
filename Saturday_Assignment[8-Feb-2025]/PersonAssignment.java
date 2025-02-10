package assignment;

class person {
	String name;
	int age;

	person(String name, int age) {
		this.name = name;
		this.age = age;

	}
	void display() {
		System.out.println("Name : " + name +" and Age : " + age);
	}
}

public class PersonAssignment {

	public static void main(String[] args) {
		person  Person1 = new person("Dhivakar" , 21);
		person  Person2 = new person("Ramesh Nadar" , 31);

		Person1.display();
		Person2.display();
	}

}
