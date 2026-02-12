package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestM15 {
    @Test
    void case1() {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1, -1, 2));
        expected.add(Arrays.asList(0, -1, 1));

        Medium15 inst = new Medium15();
        List<List<Integer>> res = inst.threeSum(nums);
        assertEquals(expected, res);

    }

    @Test
    void case2() {
        int[] nums = { 0, 0, 0, 0 };
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 0, 0));

        Medium15 inst = new Medium15();
        List<List<Integer>> res = inst.threeSum(nums);
        assertEquals(expected, res);

    }

    @Test
    void case3() {
        int[] nums = { 0, 0, 0 };
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 0, 0));

        Medium15 inst = new Medium15();
        List<List<Integer>> res = inst.threeSum(nums);
        assertEquals(expected, res);

    }
}
