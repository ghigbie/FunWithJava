package com.georgehigbie;

public class Truck extends Vehicle{

    private int doors;
    private int wheels;

    public Truck(int topSpeed, int capacity, int doors, int wheels) {
        super(topSpeed, capacity);
        this.doors = doors;
        this.wheels = wheels;
    }

    public void changeGears(){
        System.out.println("The truck is changing gears");
    }

    public void steering(String direction){
        System.out.println("The truck is steering " + direction);
    }
}
