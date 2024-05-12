package com.thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxValueTest {
    @Test
    public void maxTest() {
        assertEquals(-1, MaxValue.max(-1, -3));
        assertEquals(5, MaxValue.max(5, 5));
    }

    @Test
    public void maxTest2() {
        assertEquals(6, MaxValue.max(5, 6));
    }
}
