package ru.mirea.practice.s0000001.prog2;

import java.util.Scanner;

public abstract class Exception2 {
    public static void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            try {
                int i = Integer.parseInt(intString);
                try {
                    System.out.println(2 / i);
                } catch (ArithmeticException e) {
                    System.out.println("Arithmetic exception division by zero");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, not integer");
            }
        }
    }

    public static void main(String[]args) {
        exceptionDemo();
    }
}

