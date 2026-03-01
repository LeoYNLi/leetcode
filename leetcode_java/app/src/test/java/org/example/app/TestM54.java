package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.example.app.matrix.Medium54;
import org.junit.jupiter.api.Test;

public class TestM54 {
    @Test
    void case1() {
        Medium54 inst = new Medium54();
        int[][] metrics = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        List<Integer> expected = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        List<Integer> res = inst.spiralOrder(metrics);
        assertEquals(expected, res);
    }

    @Test
    void case2() {
        Medium54 inst = new Medium54();
        int[][] metrics = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
        List<Integer> res = inst.spiralOrder(metrics);
        assertEquals(expected, res);
    }
}
