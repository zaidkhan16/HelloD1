package IIPC_java;

public class Abstration_animal {
	public static void main(String[]args) {
		Dog d1=new Dog();
		Cat c1=new Cat();
		d1.makeSound();
		c1.makeSound();
	}

}
abstract class Animal{
	String name;
	int age;
	abstract void makeSound() ;
	
		
	
}
class Dog extends Animal{
	void makeSound() {
		System.out.println("Dog sound");
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("cat sound");
	}
}
