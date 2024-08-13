package com.LabActivitiesday2;

import java.util.Scanner;

class Employee {
    private String name;
    private String jobTitle;
    private double salary;
    Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void applySalaryIncrease(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
        }
    }
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: Rs" + salary);
    }
}

public class MyEmployee {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the employee's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the employee's job title: ");
        String jobTitle = scanner.nextLine();
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();
        Employee employee = new Employee(name, jobTitle, salary);
        System.out.println("\nInitial employee details:");
        employee.printDetails();
        System.out.print("\nEnter the salary increase percentage: ");
        double percentage = scanner.nextDouble();
        employee.applySalaryIncrease(percentage);
        System.out.println("\nUpdated employee details:");
        employee.printDetails();
    }
}
