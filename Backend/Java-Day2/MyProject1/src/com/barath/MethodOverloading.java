package com.barath;

public class MethodOverloading {
	
	void myMethod(String name) {
		System.out.println("Welcome" + name);
	}
	 
	void myMethod(int a ,int b) {
		System.out.println("Addition of two numbers: " + (a+b));
	}
	void myMehod(int n) {
		System.out.println("Sum of two same numbers: " + (n+n));
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.myMehod(5);
		obj.myMethod("Kavin");
		obj.myMethod(10,20);

	}

}
