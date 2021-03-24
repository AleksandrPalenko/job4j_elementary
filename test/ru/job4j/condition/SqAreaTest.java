package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double result = SqArea.square(6, 2);
        Assert.assertEquals(2, result, 0.01);

    }

    @Test
    public void whenP14K3Square3() {
        int expected = 3;
        int p = 14;
        double k = 3;
        double result = SqArea.square(14, 3);
        Assert.assertEquals(3, result, 0.01);

    }

    @Test
    public void whenP30K8Square8() {
        int exception = 8;
        int p = 30;
        int k = 8;
        double result = SqArea.square(30, 8);
        Assert.assertEquals(8, result, 0.01);
    }
}
