package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.app.arrayOrString.Easy27;
import org.junit.jupiter.api.Test;

public class TestE27 {
    @Test
    void testE27_case1() {
        Easy27 inst = new Easy27();
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        int k = inst.removeElement(nums, val);
        assertEquals(5, k);
    }

    @Test
    void testE27_case2() {
        Easy27 inst = new Easy27();
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        int k = inst.removeElement(nums, val);
        assertEquals(2, k);
    }

    @Test
    void testE27_case3() {
        Easy27 inst = new Easy27();
        int[] nums = { 1 };
        int val = 1;
        int k = inst.removeElement(nums, val);
        assertEquals(0, k);
    }
}
