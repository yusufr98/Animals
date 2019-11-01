package com.company;

public class Dog extends Animal {
     public Dog(){
         super();
     }
     @Override
    public String sleep() {
        return "A dog sleeps...";
    }
    @Override
    public String eat() {
        return "A dog eats...";
    }
    public String bark() {
         return "Woof woof!";
    }
}
