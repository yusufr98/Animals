package com.company;

public class Moiuse extends Animal {
    public Moiuse(){
        super();
    }
    @Override
    public String sleep(){
        return "A mouse sleeps...";
    }
    @Override
    public String eat(){
        return "A mouse eats...";
    }
    public String squeak(){
        return "Squeak squeak";
    }
}
