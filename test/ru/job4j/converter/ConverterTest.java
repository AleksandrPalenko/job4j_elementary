package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert120RBLThen2Dollar() {
        int in = 120;
        int expected = 2;
        int out2 = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out2);
    }

    @Test
    public void whenConvert180RBLThen3Dollar() {
        int in = 180;
        int expected = 3;
        int out3 = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out3);
    }

    @Test
    public void whenConvert210RblThen3Euro() {
        int in = 210;
        int expected = 3;
        int out4 = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out4);
    }
}