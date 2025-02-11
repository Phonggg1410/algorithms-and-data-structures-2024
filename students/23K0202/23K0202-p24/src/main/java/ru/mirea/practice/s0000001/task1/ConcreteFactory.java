package ru.mirea.practice.s0000001.task1;

public class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        return new Complex(0, 0); // Default complex number (0 + 0i)
    }

    @Override
    public Complex createComplex(int real, int image) {
        return new Complex(real, image);
    }
}
