package org.SergiFactoriaF5.coche;

public class Main {
    public static void main(String[] args) {
    Car car1 = new Car("Ford", "Focus", 2010);

    car1.showInformation();
    car1.drive(20000d);
    car1.showInformation();
    }
}
