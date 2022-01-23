package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String firstO1 = o1.split("/")[0];
        String firstO2 = o2.split("/")[0];

        if (!firstO2.equals(firstO1)) {
            return firstO2.compareTo(firstO1);
        } else {
            return o1.compareTo(o2);
        }
    }
}
