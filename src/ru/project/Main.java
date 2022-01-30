package ru.project;

import ru.project.avto.Bus;
import ru.project.avto.Car;
import ru.project.avto.PassengerCar;
import ru.project.avto.Truck;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("грузовик", "Скания", "синяя");
        System.out.println("У нас есть " + car.getType() + " модели " + car.getModel() + " цвета " + car.getColor());
        Car car2 = new Car("автобус", "Huandai", "белый");
        System.out.println("У нас есть " + car2.getType() + " модели " + car2.getModel() + " цвета " + car2.getColor());
        Car car3 = new Car("легковушка", "Вольво", "белая");

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

        int n = 0;

        while (n < 1) {

            int m = 0;

            while (m < 20) {
                System.out.print(car3.getType());
                m++;
            }

            System.out.println();
            n++;

        }
        {
            int x = 0;

            while (x < 8) {

                int y = 0;

                while (y < 1) {

                    System.out.print(car3.getType());
                    System.out.print("************************************************************" + car2.getType() + "*******************************************************" + car.getType() + "**************************************************");
                    System.out.print(car3.getType());
                    y++;
                }

                System.out.println();
                x++;

            }
            int a = 0;

            while (a < 20) {
                System.out.print(car3.getType());
                a++;
            }
        }
    }
}
