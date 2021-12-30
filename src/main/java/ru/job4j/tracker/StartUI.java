package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    private Item item;
    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");

    public StartUI(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public void showCreateDateTime() {
        System.out.println(getItem().getCreated().format(dateTimeFormatter));
    }

    public static void main(String[] args) {
        StartUI test1 = new StartUI(new Item());
        test1.showCreateDateTime();

        System.out.println(test1.getItem());
    }
}
