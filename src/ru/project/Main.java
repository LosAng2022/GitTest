package ru.project;

import ru.project.avto.Car;

public class Main {

    public static void main(String[] args) {

    Car car = new Car("Грузовик");

    int a = 0;
   while (a < 5) {

        System.out.println(car.type);
        a++;


    }
}}
