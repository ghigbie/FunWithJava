package com.georgehigbie;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int size;
    private String coat;

    public Dog(String name, int size, int weigth) {
        super(name, 1, 1, size, weigth);
    }
}
