package ru.mirea.practice.s23k0120.task3;

public class Planet implements Nameable {
    private final String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
