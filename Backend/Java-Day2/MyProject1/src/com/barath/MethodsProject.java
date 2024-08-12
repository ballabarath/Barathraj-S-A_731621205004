package com.barath;

public class MethodsProject {
	void myMethod1() {
		System.out.println("Instance Method");
	}
	static void myMethod2() {
		System.out.println("Static Method");
	}
	public static void main(String[] args) {
		MethodsProject obj = new MethodsProject();
		obj.myMethod1();
		
		MethodsProject.myMethod2();

	}

}
