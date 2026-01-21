package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestM45 {
    @Test
    void case1() {
        Medium45 inst = new Medium45();
        int[] nums = { 2, 3, 1, 1, 4 };
        int k = inst.jump(nums);
        assertEquals(2, k);
    }

    @Test
    void case2() {
        Medium45 inst = new Medium45();
        int[] nums = { 2, 3, 0, 1, 4 };
        int k = inst.jump(nums);
        assertEquals(2, k);
    }
}
