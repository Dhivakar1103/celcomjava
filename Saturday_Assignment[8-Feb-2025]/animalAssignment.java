package assignment;

class Animal {

	public void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

class Cat extends Animal {

	public void makeSound() {
		System.out.println("Cat barks");
	}
}

public class animalAssignment {
	public static void main(String[] args) {

		Animal animal1 = new Animal();

		Cat cat1 = new Cat();
		Cat cat2 = new Cat() {

			public void makeSound() {
				System.out.println("Cat meows");
			}
		};

		animal1.makeSound();

		cat1.makeSound();
		animal1.makeSound();
		cat2.makeSound();
	}
}
