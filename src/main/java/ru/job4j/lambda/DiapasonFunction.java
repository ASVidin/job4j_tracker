package ru.job4j.lambda;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DiapasonFunction {
    static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        return IntStream.range(start, end).mapToObj(i -> func.apply((double) i)).collect(Collectors.toList());
    }
}
