package org.platformfarm.poc.cicd;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void add() {

        Calculator calc = new Calculator();
        long expect = calc.add(1, 1);
        Assert.assertEquals(2, expect);

        expect = calc.add(2, 2);
        Assert.assertEquals(4, expect);

    }

    @Test
    public void minus() {

        Calculator calc = new Calculator();
        long expect = calc.minus(3, 2);
        Assert.assertEquals(1, expect);

    }
}