package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        Map<String, String> emails = new HashMap<>();
        emails.put("1@mail.ru", "Ivan");
        emails.put("2@mail.ru", "Huan");
        emails.put("1@mail.ru", "Donjuan");
        emails.put("3@mail.ru", "Jan");
        for (String key : emails.keySet()) {
            System.out.println("email: " + key + ", name: " + emails.get(key));
        }
    }
}
