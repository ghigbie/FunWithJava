package com.georgehigbie;

public class Vehicle {

    private int topSpeed;
    private int capacity;

    public Vehicle(int topSpeed, int capacity) {
        this.topSpeed = topSpeed;
        this.capacity = capacity;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void move(int speed){
        System.out.println("The vehicle is moving at " + speed);
    }
}
