package com.dev.factorial;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void testFactorialZeroShouldBeOne() {
        assertEquals(1, Factorial.calculate(0));
    }

    @Test
    public void testFactorialOneShouldBeOne() {
        assertEquals(1, Factorial.calculate(1));
    }

    @Test
    public void testFactorialThreeShouldBeSix() {
        assertEquals(6, Factorial.calculate(3));
    }

    @Test
    public void testFactorialForBiggerNumbers() {
        assertEquals(1307674368000L, Factorial.calculate(15));
    }
}