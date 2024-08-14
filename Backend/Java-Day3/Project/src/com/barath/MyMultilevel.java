package com.barath;

class Vehicle{
	void noofEngine() {
		System.out.println("I have one Engine");
	}
}
class TwoWheeler1 extends Vehicle{
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}

class Bike1 extends TwoWheeler1 {
	void brandName() {
		System.out.println("Brand Name is Honda");

	}
}
public class MyMultilevel {

	public static void main(String[] args) {
		Bike1 mybkBike1=new Bike1();
		mybkBike1.brandName();
		mybkBike1.noofEngine();
		mybkBike1.noOfWheels();

	}

}
