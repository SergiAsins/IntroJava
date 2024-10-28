package org.SergiFactoriaF5;

public class WhileLoop {
    public static void main(String[] args){
        // imprimir por consola los numeros impares de 5 a 10 usando un while
        int counter = 5;
        while(counter <= 10) {
            if (counter % 2 != 0) {
                System.out.println("counter = " + counter);
            }
            counter++;
        }
    }
}
