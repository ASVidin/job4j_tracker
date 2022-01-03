package ru.job4j.oop;

public class VehicleFactory {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();

        Vehicle[] vehicles = new Vehicle[]{bus, airplane, train};

        for (Vehicle vehicle: vehicles) {
            vehicle.move();
            System.out.println("Я везу " + vehicle.countPassengers() + " пассажиров");
        }

    }

}
