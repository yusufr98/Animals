package com.company;

public class Main {

    public static void main(String[] args) {
        Animal a = new Animal();//creating animal object
        print(a.eat());
        print(a.sleep());

        Cat c = new Cat();//creating new cat object
        print(c.eat());
        print(c.sleep());
        print(c.purr());


        Bird b = new Bird();//creating new bird object
        print(b.eat());
        print(b.sleep());
        print(b.fly());

    }

    private static void print(String s) {
        System.out.println(s);
    }
}

