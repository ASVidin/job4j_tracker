package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Движемся вперед");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Внутри " + count + " пассажиров");
    }

    @Override
    public int refuel(int countFuel) {
        int price = 40;
        return price * countFuel;
    }
}
