package com.lab;


class Vehicle{
void drive() {
	System.out.println("Driving...");
}
}
class Car extends Vehicle{
void drive() {
	System.out.println("Repairing a Car");
}
}
public class MyVehicle {

	public static void main(String[] args) {
	Car myCar=new Car();
	myCar.drive();

	}

}
