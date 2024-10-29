package org.SergiFactoriaF5.coche;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double kilometers;

    //constructor
    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    };

    //drive
    public void drive(double km) {
        if (km >= 1){
            this.kilometers += km;
            System.out.println(this.brand + " " + this.model + " " + this.year +  " drives " + km + "km");
        }
    }

    //showInformation
    public void showInformation() {
        System.out.println(this.brand);
        System.out.println(this.model);
        System.out.println(this.year);
        System.out.println(this.kilometers);
    }
}
