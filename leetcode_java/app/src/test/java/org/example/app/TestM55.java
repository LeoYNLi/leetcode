package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.app.arrayOrString.Medium55;
import org.junit.jupiter.api.Test;

public class TestM55 {
    @Test
    void case1() {
        int[] nums = { 2, 3, 1, 1, 4 };
        Medium55 inst = new Medium55();
        boolean output = inst.canJump(nums);
        assertEquals(true, output);
    }

    @Test
    void case2() {
        int[] nums = { 3, 2, 1, 0, 4 };
        Medium55 inst = new Medium55();
        boolean output = inst.canJump(nums);
        assertEquals(false, output);
    }

    @Test
    void case3() {
        int[] nums = { 0 };
        Medium55 inst = new Medium55();
        boolean output = inst.canJump(nums);
        assertEquals(true, output);
    }

    @Test
    void case4() {
        int[] nums = { 2, 0, 0 };
        Medium55 inst = new Medium55();
        boolean output = inst.canJump(nums);
        assertEquals(true, output);
    }

    @Test
    void case5() {
        int[] nums = { 5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0 };
        Medium55 inst = new Medium55();
        boolean output = inst.canJump(nums);
        assertEquals(true, output);
    }

    @Test
    void case6() {
        int[] nums = { 4, 2, 0, 0, 1, 1, 4, 4, 4, 0, 4, 0 };
        Medium55 inst = new Medium55();
        boolean output = inst.canJump(nums);
        assertEquals(true, output);
    }

}
