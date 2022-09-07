package com.java.car;

public class MyOwnAutoShop {
    public static void main(String[] args) {
       Sedan sedan = new Sedan(250, 200000, "red", 15);
        Ford ford1 = new Ford(200, 150000, "black", 2015, 10);
        Ford ford2 = new Ford(120, 250000, "blue", 2020, 25);
        Car car = new Car(120, 100000, "grey");
        System.out.println("Sedan " + sedan.getSalePrice());
        System.out.println("Ford(1) " + ford1.getSalePrice());
        System.out.println("Ford(2) " + ford2.getSalePrice());
        System.out.println("Car  " + car.getSalePrice());
    }
}