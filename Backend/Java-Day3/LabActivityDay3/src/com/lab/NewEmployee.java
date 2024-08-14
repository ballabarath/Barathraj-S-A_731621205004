package com.lab;

class Employee1 {
    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return 50000;
    }
}

class HRManager extends Employee {
    @Override
    public void works() {
        System.out.println("HR Manager is managing employees.");
    }

    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee.");
    }
}

public class NewEmployee {

    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        emp.work();
        System.out.println("Employee Salary: $" + emp.getSalary());

        HRManager hr = new HRManager();
        hr.works();
        hr.addEmployee();
        System.out.println("HR Manager Salary: $" + hr.getSalary());
    }
}
