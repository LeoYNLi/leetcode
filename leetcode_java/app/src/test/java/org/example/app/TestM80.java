package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.app.arrayOrString.Medium80;
import org.junit.jupiter.api.Test;

public class TestM80 {
    @Test
    void case1() {
        Medium80 inst = new Medium80();
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = inst.removeDuplicates(nums);

        assertEquals(5, k);

    }

    @Test
    void case2() {
        int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        Medium80 inst = new Medium80();
        int k = inst.removeDuplicates(nums);
        assertEquals(7, k);
    }
}
