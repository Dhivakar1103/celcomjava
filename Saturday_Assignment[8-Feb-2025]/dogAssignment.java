package assignment;

class Dog {
	String Name;
	String Breed;

	Dog(String name, String breed) {
		Name = name;
		Breed = breed;

	}

	void display() {
		System.out.println("Dog Name : " + Name + "  Bread : " + Breed);
	}

	void setName(String name) {
		Name = name;

	}

	void setBreed(String breed) {
		Breed = breed;
	}
}

public class dogAssignment {

	public static void main(String[] args) {
		Dog Dog1 = new Dog("Black", " BullDog");
		Dog1.display();
		Dog1.setName("Blacky");
		Dog1.display();
		
		
		Dog Dog2 = new Dog("Charlie", " BullDog");
		Dog2.display();
		Dog2.setBreed("Labrodour ");
		Dog2.display();
	}

}
