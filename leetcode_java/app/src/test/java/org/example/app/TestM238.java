package org.example.app;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.example.app.arrayOrString.Medium238;
import org.junit.jupiter.api.Test;

public class TestM238 {
    @Test
    void case1() {
        Medium238 inst = new Medium238();
        int[] nums = { 1, 2, 3, 4 };
        int[] res = inst.productExceptSelf(nums);
        int[] expect = { 24, 12, 8, 6 };
        assertArrayEquals(expect, res);
    }

    @Test
    void case2() {
        Medium238 inst = new Medium238();
        int[] nums = { -1, 1, 0, -3, 3 };
        int[] res = inst.productExceptSelf(nums);
        int[] expect = { 0, 0, 9, 0, 0 };
        assertArrayEquals(expect, res);
    }
}
