package com.thealgorithms.maths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AverageTest {

    private static final double SMALL_VALUE = 0.00001d;

    @Test
    public void testAverage_double_4_5() {
        double[] numbers = {1d, 2d, 3d, 4d, 5d, 6d, 7d, 8d};
        Assertions.assertEquals(4.5d, Average.average(numbers), SMALL_VALUE);
    }

    @Test
    public void testAverage_int_5() {
        int[] numbers = {2, 4, 10};
        Assertions.assertEquals(5, Average.average(numbers));
    }

    @Test
    public void testAverage_int_exc() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Average.average((int[]) null);
        });
    }

    @Test
    public void testAverage_double_exc() {
        int[] numbers = {};
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Average.average(numbers);
        });
    }

    @Test
    public void testAverage_int_exc_2() {
        double[] numbers = {};
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Average.average(numbers);
        });
    }

    @Test
    public void testAverage_double_exc_2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Average.average((double[]) null);
        });
    }
}
