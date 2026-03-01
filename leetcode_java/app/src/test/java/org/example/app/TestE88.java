package org.example.app;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.example.app.arrayOrString.Easy88;
import org.junit.jupiter.api.Test;

public class TestE88 {
    @Test
    void case1() {
        Easy88 inst = new Easy88();
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        inst.merge(nums1, m, nums2, n);
        int[] expected = { 1, 2, 2, 3, 5, 6 };
        assertArrayEquals(expected, nums1);
    }

    @Test
    void case2() {
        Easy88 inst = new Easy88();
        int[] nums1 = { 0 };
        int m = 0;
        int[] nums2 = { 1 };
        int n = 1;
        inst.merge(nums1, m, nums2, n);
        int[] expected = { 1 };
        assertArrayEquals(expected, nums1);
    }
}