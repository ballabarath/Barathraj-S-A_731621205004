package com.barath;

class A {
	int a = 8;
	A(String name){
		System.out.println("Welcome"+name);
	}
    void myMethod1() {
		System.out.println("Iam super class Method");
	}
}
class B extends A {
	B(){
		super("Bharath");
	}
	void myMethod2() {
		System.out.println(super.a);
		super.myMethod1();
	}
}
public class MySuper {
	public static void main(String[] args) {
		B b = new B();
		b.myMethod2();

	}

}
