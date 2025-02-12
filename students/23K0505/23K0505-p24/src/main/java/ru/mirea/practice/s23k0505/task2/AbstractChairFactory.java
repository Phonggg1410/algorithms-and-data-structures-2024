package ru.mirea.practice.s23k0505.task2;

public abstract class AbstractChairFactory {
    abstract VictorianChair createVictorianChair(int age);

    abstract MagicChair createMagicChair();

    abstract FunctionalChair createFunctionalChair();
}
