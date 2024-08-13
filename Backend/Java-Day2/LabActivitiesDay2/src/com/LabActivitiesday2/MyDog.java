package com.LabActivitiesday2;

class Dog {
    private String name;
    private String breed;
    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void printDetails() {
        System.out.println("Name: " + name + ", Breed: " + breed);
    }
}

public class MyDog {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "Bulldog");
        dog1.printDetails();
        dog2.printDetails();
        dog1.setName("Charlie");
        dog1.setBreed("Labrador Retriever");
        dog2.setName("Rocky");
        dog2.setBreed("Poodle");
        dog1.printDetails();
        dog2.printDetails();
    }
}
