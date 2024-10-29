package org.SergiFactoriaF5.scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // No need for {}

        String user;
        String password;
        byte i = 1;
        int maxAttempts = 3;

        while (i <= maxAttempts) {
            System.out.print("Username: ");
            user = scanner.nextLine();
            System.out.print("Password: ");
            password = scanner.nextLine();

            if (user.equals("admin") && password.equals("1234")) {
                System.out.println("Log in okay");
                break;
            }

            if (i == maxAttempts) { // Change === to ==
                System.out.println("Max attempts exceeded");
            }

            i++;
        }

        scanner.close(); // Close the scanner
    }
}
