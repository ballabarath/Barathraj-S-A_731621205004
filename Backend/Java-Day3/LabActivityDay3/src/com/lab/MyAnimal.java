package com.lab;


class Animal{
	void makeSound() {
		System.out.println("Boo");
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("Bark");
	}
}
public class MyAnimal {
public static void main(String[]args) {
	Cat mycatobjCat=new Cat();
	mycatobjCat.makeSound();
}
	


}
