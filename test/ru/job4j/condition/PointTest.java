package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void whenX10Y10X22Y20() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double result = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(2, result, 1);
    }

    @Test
    public void whenX10Y10X24Y22() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 4;
        int y2 = 2;
        double result = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(4, result, 1);
    }

    @Test
    public void whenX10Y10X102Y28() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 10;
        int y2 = 8;
        double result = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(10, result, 3);
    }

    @Test
    public void whenX10Y10X210Y25() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 10;
        int y2 = 5;
        double result = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(12, result, 0.9);
    }

}
