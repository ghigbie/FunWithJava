package com.georgehigbie;

public class Ford extends Truck{

    private boolean isHeavy;

    public Ford(int topSpeed, int capacity, int doors, int wheels, boolean isHeavy) {
        super(topSpeed, capacity, doors, wheels);
        this.isHeavy = isHeavy;
    }

    public void haulStuff(){
        System.out.println("This ford is hauling stuff");
    }
}
