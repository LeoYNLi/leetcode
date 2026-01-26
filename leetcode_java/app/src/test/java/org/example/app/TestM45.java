package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestM45 {
    @Test
    void case1() {
        Medium45 inst = new Medium45();
        int[] nums = {2,3,1,1,4};
        int k = inst.jump(nums);
        assertEquals(2, k);
    }

    @Test
    void case2() {
        Medium45 inst = new Medium45();
        int[] nums = {1,2};
        int k = inst.jump(nums);
        assertEquals(1, k);
    }


    @Test
    void case3() {
        Medium45 inst = new Medium45();
        int[] nums = {0};
        int k = inst.jump(nums);
        assertEquals(0, k);
    }

    @Test
    void case4() {
        Medium45 inst = new Medium45();
        int[] nums = {1,2,1,1,1};
        int k = inst.jump(nums);
        assertEquals(3, k);
    }

    @Test
    void case5() {
        Medium45 inst = new Medium45();
        int[] nums = {3,1,1,1,1};
        int k = inst.jump(nums);
        assertEquals(2, k);
    }

    @Test
    void case6() {
        Medium45 inst = new Medium45();
        int[] nums = {3,4,3,2,5,4,3};
        int k = inst.jump(nums);
        assertEquals(3, k);
    }
}
