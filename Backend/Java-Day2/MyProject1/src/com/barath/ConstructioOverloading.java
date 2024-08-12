package com.barath;

public class ConstructioOverloading {

		ConstructioOverloading(String name) {
			System.out.println("Welcome " + name);
		}
		 
		ConstructioOverloading(int a ,int b) {
			System.out.println("Expected Salary: " + (a+b));
		}
		ConstructioOverloading(int n) {
			System.out.println("Actual Salary: " + (n+n));
		}

		public static void main(String[] args) {
			ConstructioOverloading obj1 = new ConstructioOverloading("Kavin");
			ConstructioOverloading obj2 = new ConstructioOverloading(25000);
			ConstructioOverloading obj3 = new ConstructioOverloading(40000,20000);

		}

}
