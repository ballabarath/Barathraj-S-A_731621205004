package com.barath;

public class VariableProject {
	int b = 20;
	static int c = 130;
	public static void main(String[] args) {
		int a = 100;
		System.out.println("Local Variable : " + a);
		
		VariableProject obj = new VariableProject();
		System.out.println(obj.b);
		
		System.out.println(VariableProject.c);
	}

}
