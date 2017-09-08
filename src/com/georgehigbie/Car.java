package com.georgehigbie;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera")|| validModel.equals("comodor")) {
            this.model = model;
        }else{
            this.model = "Unknown";
        }
    }

    public void setEngine(String engine){
        this.engine = engine;
    }

    public String getModel(){
        return this.model;
    }
    public String getEngine(){
        return this.engine;
    }
}
