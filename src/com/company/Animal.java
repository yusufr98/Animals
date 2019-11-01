package com.company;

public class Animal {//parent class, general template, can be instanced as animal or can extend to child class
    public Animal() {
        System.out.println("A new animal has been created!");
    }
    public String sleep() {
        return "An animal sleeps...";
    }
    public String eat() {
        return "An animal eats...";
    }
}
