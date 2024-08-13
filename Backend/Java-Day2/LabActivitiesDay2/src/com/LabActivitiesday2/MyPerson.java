package com.LabActivitiesday2;

import java.util.Scanner;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void printDetails() {
        System.out.println("Name of the person: " + name + ", Age: " + age);
    }
}

public class MyPerson {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the first person: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter the age of the first person: ");
        int age1 = scanner.nextInt();
        scanner.nextLine(); 
        Person person1 = new Person(name1, age1);
        System.out.print("Enter the name of the second person: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter the age of the second person: ");
        int age2 = scanner.nextInt();
        Person person2 = new Person(name2, age2);
        person1.printDetails();
        person2.printDetails();
    }
}
