package com.barath;

class TwoWheelerr{
	void noOfEngine() {
		System.out.println("I have Engine");
	}
}


class Bikee extends TwoWheelerr{
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}

class Scooty extends TwoWheeler1 {
	void brandName() {
		System.out.println("Brand Name is Honda");

	}
}
public class Myhiera {

	public static void main(String[] args) {
Bikee bikee=new Bikee();
bikee.noOfEngine();
bikee.noOfWheels();

Scooty scooty=new Scooty();
scooty.noofEngine();
scooty.brandName();
	}

}
