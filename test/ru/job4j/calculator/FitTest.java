package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {
    @Test
    public void whenMan190Then103() {
        short weight = 190;
        double expected = 103;
        double result = Fit.manWeight(weight);
        Assert.assertEquals(expected, result, 0.5);
    }

    @Test
    public void whenWomen170Then69() {
        short weight = 170;
        double expected = 69;
        double result = Fit.womanWeight(weight);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenWomen160Then60() {
        short weight = 160;
        double expected = 57;
        double result = Fit.womanWeight(weight);
        Assert.assertEquals(expected, result, 0.5);
    }
}

