package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String firstO1 = o1.split("/")[0];
        String firstO2 = o2.split("/")[0];
        int rsl = firstO2.compareTo(firstO1);
        return rsl != 0 ? rsl : o1.compareTo(o2);
    }
}
