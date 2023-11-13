package com.madeeasy.week5.session4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {

    static Factorial factorial;

    @BeforeAll
    static void beforeAll() {
        factorial = new Factorial();
    }

    @Test
    void testFactorial() {
        assertEquals(120, factorial.factorial(5));
    }
}