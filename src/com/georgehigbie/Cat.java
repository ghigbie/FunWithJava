package com.georgehigbie;

public class Cat extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Cat(String name, int size, int weight) {
        super(name, 1, 1, size, weight);
    }
}
