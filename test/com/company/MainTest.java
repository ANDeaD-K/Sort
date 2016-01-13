package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testAdd() {
        Calc calc = new Calc();
        assertEquals(10, calc.add(8, 2));
    }
}