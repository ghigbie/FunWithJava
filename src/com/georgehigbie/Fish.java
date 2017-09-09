package com.georgehigbie;

public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;


    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void rest(){
        System.out.println("The fishy is just sitting there.");
    }

    private void moveMuscles(){
        System.out.println("The fishy is undulating");
    }

    private void moveBackFin(){
        moveMuscles();
        System.out.println("The fishy is moving his back fin");
    }


    public void swim(int speed){
        moveMuscles();
        moveBackFin();
        move(1);
        System.out.println("The fish is swimming away!");
    }
}
