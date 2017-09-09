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

    private void chew(){
        System.out.println("Doggie is chewing food");
    }

    @Override
    public void eat() {
        System.out.println("Doggie is eating!!!");
        chew();
        super.eat();
    }

    private void moveLegs(){
        System.out.println("Doggies is moving legs like crazy");
    }

    public void walk(){
        moveLegs();
        System.out.println("Doggie is walking");
        super.move(5);
    }

    public void run(){
        moveLegs();
        System.out.println("Doggie is running");
        super.move(10);
    }
}
