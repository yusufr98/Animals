package com.company;

public class Bird extends Animal {//bird class extends animal clas
    public Bird() {
        super();//uses "super"(animal) constructor
        System.out.println("A bird is hatched...");
    }


    @Override
    public String sleep() {//overrides animal.sleep for specifically bird objects
        return "A bird sleeps soundly...";
    }

    @Override
    public String eat() {
        return "A bird eats...";
    }


    public String fly() {//create new method that only exists in bird objects
        //Birds can fly but other animals can't so this method
        //is unique to the Bird class
        return "A bird flies...";
    }
}