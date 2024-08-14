package com.lab;

class newAni{
	void move() {
		System.out.println("Walk");
	}
}
class Cheetah extends newAni{
	void move() {
		System.out.println("Run");
	}
}
public class NewAnimal {

	public static void main(String[] args) {
	
newAni nsAnimal=new Cheetah();
nsAnimal.move();
	}

}
