package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterSumTest {

    @Test
    public void sumIs10() {
        int start = 0;
        int finish = 10;
        int result = CounterSum.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);

    }
}