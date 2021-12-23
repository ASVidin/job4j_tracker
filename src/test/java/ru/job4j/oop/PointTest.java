package ru.job4j.oop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {
    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);

        assertEquals(expected, out, -0.01);
    }

    @Test
    public void when15to55then4() {
        Point a = new Point(1, 5);
        Point b = new Point(5, 5);
        double expected = 4;
        double out = a.distance(b);

        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to200then2() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 0, 0);
        double expected = 2;
        double out = a.distance3d(b);

        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when123to456then5dot19() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 5, 6);
        double expected = 5.20;
        double out = a.distance3d(b);

        assertEquals(expected, out, 0.01);
    }
}