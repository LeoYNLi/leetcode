package org.example.app;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TestM189 {
    @Test
    void case1() {
        Medium189 inst = new Medium189();
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        inst.rotate(nums, k);
        int[] expected = { 5, 6, 7, 1, 2, 3, 4 };
        assertArrayEquals(expected, nums);
    }

    @Test
    void case2() {
        Medium189 inst = new Medium189();
        int[] nums = { 1, 2 };
        int k = 7;
        inst.rotate(nums, k);
        int[] expected = { 2, 1 };
        assertArrayEquals(expected, nums);

    }
}
