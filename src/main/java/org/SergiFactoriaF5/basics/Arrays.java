package org.SergiFactoriaF5.basics;

public class Arrays {
    public static void main(String[] args) {
        //Define an array of 5 numbers (filled)
        //Define an array of 5 city names (filled)
        //Print each number using a forEach loop
        int[] numbers = {1, 2, 3, 4, 5};
        String[] cities = {"Brooklyn", "NY", "Beirut", "Madrid", "Valencia"};
        for (int number: numbers){
            System.out.println("number" + number);
        }
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
