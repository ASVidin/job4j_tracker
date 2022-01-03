package ru.job4j.oop;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println("Двигаюсь по рельсам");
    }

    @Override
    public int countPassengers() {
        return 500;
    }
}
