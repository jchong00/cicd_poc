package org.platformfarm.poc.cicd;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void add() {

        Calculator calc = new Calculator();
        long expect = calc.add(1, 1);
        Assert.assertEquals(1, expect);

    }
}
