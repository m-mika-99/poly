package org.example;

import org.example.viecle.Car;

public class Main {
    public static void main (String[] args) {
        Car c = new Car();
        c.keyOn();
        c.startEngine();
        c.kickAccelPedal();
    }
}