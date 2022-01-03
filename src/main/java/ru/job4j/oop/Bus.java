package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Двигаюсь по шоссе");
    }

    @Override
    public int countPassengers() {
        return 50;
    }
}
