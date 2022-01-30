package ru.project;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {

    Car car = new Car("грузовик", "Скания", "синяя");
    System.out.println("У нас есть " + car.getType() + " модели " + car.getModel() + " цвета " + car.getColor());
    Car car2 = new Car("автобус", "Huandai", "белый");
    System.out.println("У нас есть " + car2.getType() + " модели " + car2.getModel() + " цвета " + car2.getColor());

    Collection<Car> collectionOfCars = new ArrayList<>();
    collectionOfCars.add(car);
    collectionOfCars.add(car2);
    System.out.println(collectionOfCars.size() + " - размер коллекции");
    System.out.println(collectionOfCars + " - все элементы коллекции");
    collectionOfCars.remove(car);
    System.out.println(collectionOfCars + " - все элементы коллекции");
    collectionOfCars.add(car);
    System.out.println(collectionOfCars + " - все элементы коллекции");
        System.out.println(collectionOfCars.stream().count() + " - посчитал количество элементов в коллеции");
        System.out.println(collectionOfCars.stream().findFirst() + " - нашел первый объект в коллекции");
        System.out.println((long)collectionOfCars.size() + " еще разок посчитал количество элементов в коллекции");

    }
}
