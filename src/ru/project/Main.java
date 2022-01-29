package ru.project;

public class Main {

    public static void main(String[] args) {

    Car car = new Car("грузовик", "Скания", "синяя");
    System.out.println("У нас есть " + car.getType() + " модели " + car.getModel() + " цвета " + car.getColor());
    Car car2 = new Car("автобус", "Huandai", "белый");
    System.out.println("У нас есть " + car2.getType() + " модели " + car2.getModel() + " цвета " + car2.getColor());




    }
}
