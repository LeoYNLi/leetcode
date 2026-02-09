package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestM11 {
    @Test
    void case1() {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        Medium11 inst = new Medium11();
        int k = inst.maxArea(height);
        assertEquals(k, 49);
    }
}
