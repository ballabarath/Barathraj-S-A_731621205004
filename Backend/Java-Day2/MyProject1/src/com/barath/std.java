package com.barath;

import java.util.Scanner;

class Student{
	int regNo;
	String studentName;
	int arr[] = new int[5];
	float avg;
	int sum = 0;
	
	Student(int regNo,String studentName){
		this.regNo = regNo;
		this.studentName = studentName;
	}
	void GetMarks(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your five subject marks: ");
		for(int i=0;i<5;i++) {
			arr[i]= sc.nextInt();
		}
		sc.close();
	}
	void CalculateGrade() {
		for(int i=0;i<5;i++) {
			sum = sum+arr[i];
		}
		avg = sum/5;
		if(avg>=80) {
			System.out.println("A Grade");
		}
		else if(avg>=60) {
			System.out.println("B Grade");
		}
		else if(avg>=50) {
			System.out.println("C Grade");
		}
		else{
			System.out.println("Fail");
		}
	}
	
	void display() {
		System.out.println("Register No: " + regNo);
		System.out.println("Student Name: " + studentName);
		System.out.println("Total Marks: " + sum);
		System.out.println("Percentage: " + avg);
	}
}
public class std {

	public static void main(String[] args) {
		
		Student obj = new Student(101,"Kavin");
		obj.GetMarks();
		obj.CalculateGrade();
		obj.display();
		
	}

}
