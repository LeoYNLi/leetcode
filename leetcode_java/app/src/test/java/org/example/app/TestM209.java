package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestM209 {
    @Test
    void case1() {
        int target = 7;
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        Medium209 inst = new Medium209();
        int k = inst.minSubArrayLen(target, nums);
        assertEquals(2, k);
    }

    @Test
    void case2() {
        int target = 213;
        int[] nums = { 12, 28, 83, 4, 25, 26, 25, 2, 25, 25, 25, 12 };
        Medium209 inst = new Medium209();
        int k = inst.minSubArrayLen(target, nums);
        assertEquals(8, k);
    }

}
