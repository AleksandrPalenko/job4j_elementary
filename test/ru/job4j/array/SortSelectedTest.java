package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[]{3, 2, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[]{5, 4, 6, 8, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{4, 5, 6, 7, 8};
        Assert.assertArrayEquals(expected, result);
    }
}