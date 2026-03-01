package org.example.app;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.example.app.twoPointer.Medium167;
import org.junit.jupiter.api.Test;

public class TestM167 {
    @Test
    void case1() {
        int[] numbers = new int[] { 2, 7, 11, 15 };
        int target = 9;
        Medium167 inst = new Medium167();
        int[] res = inst.twoSum(numbers, target);
        int[] expected = { 1, 2 };
        assertArrayEquals(expected, res);

    }
}
