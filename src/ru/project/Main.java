package ru.project;

public class Main {

    public static void main(String[] args) {

    Car car = new Car("грузовик", "Скания", "синяя");
    System.out.println("У нас есть " + car.getType() + " модели " + car.getModel() + " цвета " + car.getColor());




    }
}
