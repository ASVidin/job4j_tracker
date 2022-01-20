package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        char[] ch1 = o1.toCharArray();
        char[] ch2 = o2.toCharArray();
        int size = Math.min(ch1.length, ch2.length);
        for (int i = 0; i < size; i++) {
            int rsl = Character.compare(ch1[i], ch2[i]);
            if (rsl != 0) {
                return rsl;
            }
        }
        return Integer.compare(ch1.length, ch2.length);
    }
}
