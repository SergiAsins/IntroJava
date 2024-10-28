package org.SergiFactoriaF5.basics;

public class Conditionals {
    public static void main(String[] args){
        // variable edad de un usuario con la minima memoria posible
        // Imprimir el usuario es mayor de edad si 18 o +
        // Imprimir el usuario es menor de edad si 17 o -
        byte age = 17;
        if(age >= 18){
            System.out.println("The user an adult");
        }else{
            System.out.println("The user is a minor");
        }
    }
}
