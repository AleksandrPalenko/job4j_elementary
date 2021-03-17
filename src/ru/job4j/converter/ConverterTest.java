package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {
    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
        //System.out.println();
    }

    @Test
    public void whenConvert120RBLThen2Dollar() {
        int in = 0;
        int expected = 2;
        int out2 = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out2);
        //System.out.println();
    }

}