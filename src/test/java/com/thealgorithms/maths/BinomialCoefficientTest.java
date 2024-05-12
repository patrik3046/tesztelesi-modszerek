package com.thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinomialCoefficientTest {

    @Test
    void testBinomialCoefficient() {
        assertEquals(190, BinomialCoefficient.binomialCoefficient(20, 2));
        assertEquals(1, BinomialCoefficient.binomialCoefficient(17, 17));
    }

    @Test
    void testBinomialCoefficient2() {
        assertEquals(0, BinomialCoefficient.binomialCoefficient(20, 21));
    }
}
