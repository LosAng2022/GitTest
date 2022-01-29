package ru.project;

import ru.project.avto.Bus;
import ru.project.avto.Car;
import ru.project.avto.PassengerCar;
import ru.project.avto.Truck;

public class Main {

    public static void main(String[] args) {

        Truck truck = new Truck("Грузовик");
        Bus bus = new Bus("Автобус");
        PassengerCar passengerCar = new PassengerCar("Легковушка");

        int n = 0;

        while (n < 1) {

            int m = 0;

            while (m < 20) {
                System.out.print(truck.type);
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

                    System.out.print(truck.type);
                    System.out.print("*****************************************" + bus.type + "*********************************************" + passengerCar.type + "*****************************************");
                    System.out.print(truck.type);
                    y++;
                }

                System.out.println();
                x++;

            }
            int a = 0;

            while (a < 20) {
                System.out.print(truck.type);
                a++;
            }
        }
    }
}
