package com.georgehigbie;

public class Truck extends Vehicle{

    private int doors;
    private int wheels;

    public Truck(int topSpeed, int capacity, int doors, int wheels) {
        super(topSpeed, capacity);
        this.doors = doors;
        this.wheels = wheels;
    }

    public void changeGearsDown(){
        System.out.println("The truck is changing gears down");
    }

    public void changeGearsUp(){
        System.out.println("The truck is changing gears up");
    }

    public void steering(String direction){
        System.out.println("The truck is steering " + direction);
    }

    @Override
    public void stop() {
        System.out.println("The truck is hitting the brakes");
        super.stop();
    }
}
