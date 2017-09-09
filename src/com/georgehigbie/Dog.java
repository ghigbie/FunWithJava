package com.georgehigbie;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int teeth;
    private int tail;
    private String coat;

    public Dog(String name, int size, int weigth, int eyes, int legs, int teeth, int tail, String coat) {
        super(name, 1, 1, size, weigth);
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.tail = tail;
        this.coat = coat;
    }
}
