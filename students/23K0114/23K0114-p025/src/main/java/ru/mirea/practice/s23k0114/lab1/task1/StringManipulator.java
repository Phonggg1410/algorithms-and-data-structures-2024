package ru.mirea.practice.s23k0114.lab1.task1;

import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class StringManipulator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.println("Введите строку для разбивки:");
            String input = scanner.nextLine();

            System.out.println("Введите регулярное выражение для разделителя:");
            String regex = scanner.nextLine();

            Pattern pattern = Pattern.compile(regex);
            String[] elements = pattern.split(input);

            System.out.println("Результат разбиения строки на элементы:");
            for (String element : elements) {
                System.out.println(element);
            }
            // apple,orange;banana,grape
            // [;,]
        }
    }
}

