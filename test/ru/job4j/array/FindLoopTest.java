package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas2Then3() {
        int[] data = {5, 4, 3, 2};
        int el = 2;
        int result = FindLoop.indexOf(data, el);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test

    public void whenArrayHas3Then2() {
        int[] data = {5, 4, 3, 2, 5};
        int el = 3;
        int result = FindLoop.indexOf(data, el);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test

    public void whenStart1AndFinish3Then2() {
        int[] data = {5, 2, 3, 2, 5};
        int el = 3;
        int start = 1;
        int finish = 3;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test

    public void whenStart0AndFinish7Then7() {
        int[] data = {5, 2, 3, 2, 5, 7, 8, 9};
        int el = 9;
        int start = 0;
        int finish = 7;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test

    public void whenStart0AndFinish7ThenNo() {
        int[] data = {5, 2, 3, 2, 5, 7, 8, 9};
        int el = 6;
        int start = 0;
        int finish = 7;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

}