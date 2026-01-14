package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TeatE26 {
    @Test
    void testE26_case1() {
        Easy26 inst = new Easy26();
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int k = inst.removeDuplicates(nums);
        assertEquals(5, k);
    }

    @Test
    void testE26_case2() {
        Easy26 inst = new Easy26();
        int[] nums = { 1, 1, 2 };
        int k = inst.removeDuplicates(nums);
        assertEquals(2, k);
    }

}
