package ru.job4j.oop;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private int expected = 0;
    private int result = 0;
    private Calculator calculator =  new Calculator();

    @Test
    public void whenSumThen15() {
        result = Calculator.sum(10);
        expected = 15;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMinusThen5() {
        result = Calculator.minus(10);
        expected = 5;
        Assert.assertEquals(result, expected);

    }

    @Test
    public void whenDivideThen2() {
        result = calculator.divide(10);
        expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMultiplyThen50() {
        result = Calculator.multiply(10);
        expected = 50;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenAllOperationsThen72() {
        result = calculator.sumAllOperation(10);
        expected = 72;
        Assert.assertEquals(result, expected);
    }
}


