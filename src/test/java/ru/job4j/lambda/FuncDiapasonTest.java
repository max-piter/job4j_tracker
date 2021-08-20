package ru.job4j.lambda;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FuncDiapasonTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FuncDiapason.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunction() {
        List<Double> result = FuncDiapason.diapason(5, 8, (x) -> x);
        List<Double> expected = Arrays.asList(5D, 6D, 7D);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenQuadraticFunction() {
        List<Double> result = FuncDiapason.diapason(5, 8, (x) -> x * x);
        List<Double> expected = Arrays.asList(25D, 36D, 49D);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenFunction() {
        final int a = 2;
        List<Double> result = FuncDiapason.diapason(5, 8, (x) -> Math.pow(a, x));
        List<Double> expected = Arrays.asList(32D, 64D, 128D);
        Assert.assertEquals(result, expected);
    }

}