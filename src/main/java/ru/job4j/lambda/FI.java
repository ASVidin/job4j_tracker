package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FI {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 11", 20),
                new Attachment("image 333", 120),
                new Attachment("image 2", 23)
        };
        Comparator<Attachment> comparator = (left, right) -> Integer.compare(left.getSize(), right.getSize());
        Comparator<String> cmpSize = (left, right) -> Integer.compare(left.length(), right.length());
        Comparator<String> cmpText = (left, right) -> left.compareTo(right);
        Comparator<String> cmpDescSize = Comparator.comparing(String::length, Comparator.reverseOrder());

        Arrays.sort(atts, comparator);
        System.out.println(Arrays.toString(atts));

        Function<Attachment, String> consumer = Attachment::getName;
        List<String> lst = Arrays.stream(atts).map(consumer).sorted(cmpSize).collect(Collectors.toList());
        System.out.println(lst);

        lst.sort(cmpText);
        System.out.println(lst);

        lst.sort(cmpDescSize);
        System.out.println(lst);

    }
}
