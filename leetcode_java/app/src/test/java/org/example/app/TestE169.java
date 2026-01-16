package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestE169 {

    @Test
    void case1() {
        Easy169 inst = new Easy169();
        int[] nums = { 3, 2, 3 };
        int k = inst.majorityElement(nums);
        assertEquals(3, k);
    }

    @Test
    void case2() {
        Easy169 inst = new Easy169();
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        int k = inst.majorityElement(nums);
        assertEquals(2, k);
    }

    @Test
    void case3() {
        Easy169 inst = new Easy169();
        int[] nums = { 3, 3, 4 };
        int k = inst.majorityElement(nums);
        assertEquals(3, k);
    }

}
