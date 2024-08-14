package com.lab;


class Person {
 private String firstName;
 private String lastName;


 public Person(String firstName, String lastName) {
     this.firstName = firstName;
     this.lastName = lastName;
 }

 public String getFirstName() {
     return firstName;
 }

 // Method to get the last name
 public String getLastName() {
     return lastName;
 }
}

class Employee extends Person {
 private String employeeId;
 private String jobTitle;

 public Employee(String firstName, String lastName, String employeeId, String jobTitle) {
     super(firstName, lastName);
     this.employeeId = employeeId;
     this.jobTitle = jobTitle;
 }

 public String getEmployeeId() {
     return employeeId;
 }


 public String getLastName() {
     return super.getLastName() + ", " + jobTitle;
 }
}


public class Myyperson {

 public static void main(String[] args) {
   
     Employee emp = new Employee("John", "Doe", "E123", "Software Engineer");

     System.out.println("First Name: " + emp.getFirstName());
     System.out.println("Last Name: " + emp.getLastName()); // Includes job title
     System.out.println("Employee ID: " + emp.getEmployeeId());
 }
}

