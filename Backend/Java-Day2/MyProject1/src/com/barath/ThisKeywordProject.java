package com.barath;

public class ThisKeywordProject {
	String name;
	ThisKeywordProject(String name){
		this(10, 20);
		this.name = name;
		this.greeting();
	}
	
	ThisKeywordProject(int a, int b){
		System.out.println("Addition : " + (a + b));
	}
	
	void greeting() {
		System.out.println("Welcome " + name);
	}
	public static void main(String[] args) {
		ThisKeywordProject obj = new ThisKeywordProject("Kavin");

	}

}
