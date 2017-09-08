package com.georgehigbie;

public class Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weigth;

    public Animal(String name, int brain, int body, int size, int weigth) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeigth() {
        return weigth;
    }
}
