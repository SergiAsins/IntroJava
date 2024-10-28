package org.SergiFactoriaF5;

public class ForLoop {
    public static void main(String[] args){
        // imprimir por consola los numeros pares de 5 a 10 usando un for
        int myNumber = 10;
        for (int i = 5; i <= myNumber; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
