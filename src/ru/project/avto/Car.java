package ru.project.avto;

public class Car {

    private String type;
    private String model;
    private String color;


    public Car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}