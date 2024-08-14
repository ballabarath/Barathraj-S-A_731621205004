package com.lab;

class Shape{
	
	void getArea(int length,int breadth) {
	
			System.out.println(length*breadth);
	
	}
}

class Rectanglee extends Shape{
	void getArea(int length,int breadth) {
		System.out.println(length*breadth);
	}
}
public class MyShape {
public static void main(String args[]) {
	Rectanglee myRectangle=new Rectanglee();
	myRectangle.getArea(8, 12);
}
}
