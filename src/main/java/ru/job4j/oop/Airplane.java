package ru.job4j.oop;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Двигаюсь по воздуху");
    }

    @Override
    public int countPassengers() {
        return 200;
    }
}
