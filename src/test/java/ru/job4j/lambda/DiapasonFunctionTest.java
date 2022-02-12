package ru.job4j.lambda;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class DiapasonFunctionTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = DiapasonFunction.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, Is.is(expected));
    }

    @Test
    public void whenSquareFunctionThenLinearResults() {
        List<Double> result = DiapasonFunction.diapason(3, 6, x -> 2 * x * x - 3 * x + 1);
        List<Double> expected = Arrays.asList(10D, 21D, 36D);
        assertThat(result, Is.is(expected));
    }

    @Test
    public void whenExponentialFunctionThenLinearResults() {
        List<Double> result = DiapasonFunction.diapason(1, 5, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(2D, 4D, 8D, 16D);
        assertThat(result, Is.is(expected));
    }
}